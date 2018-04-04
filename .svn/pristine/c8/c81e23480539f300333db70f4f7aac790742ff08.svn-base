package com.zy.departmentDao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zy.departmentDao.DepartmentDao;
import com.zy.vo.Department;
@Repository("departmentDao")
public class DepartmentDaoImp extends HibernateDaoSupport implements DepartmentDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> findAll(final int start) {
//回滚视图(调用其他sql语句方法)
		return (List<Department>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {

				Query query=session.createQuery("from Department");
				query.setFirstResult(start);
				query.setMaxResults(6);
				return query.list();
			}
		});
	}

	@Override
	public void addDepartment( Department dep) {
		this.getHibernateTemplate().save(dep);
		
	}

	@Override
	public void delDepartment(Integer DId) {
		
       this.getHibernateTemplate().delete(findByDId(DId));		
	}

	@Override
	public Department findByDId(final Integer DId) {
		return this.getHibernateTemplate().execute(new HibernateCallback<Department>() {

			@Override
			public Department doInHibernate(Session session)
					throws HibernateException, SQLException {
				Department dep=(Department) session.get(Department.class, DId);
				return dep;
			}
		});
	}

	@Override
	public void updateDepartment(Department dep) {

		this.getHibernateTemplate().update(dep);
		
	}

	@Override
	public Integer countPages() {
		return this.getHibernateTemplate().execute(new HibernateCallback<Integer>() {

			@Override
			public Integer doInHibernate(Session session)
					throws HibernateException, SQLException {
				List<?> list=session.createQuery("select DId from Department").list();
				Integer counts=list.size();
				return counts;
			}
		});
	}


}
