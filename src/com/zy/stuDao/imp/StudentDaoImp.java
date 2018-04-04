package com.zy.stuDao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zy.stuDao.StudentDao;
import com.zy.vo.Follow;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

public class StudentDaoImp extends HibernateDaoSupport implements StudentDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Stu_Fo_Remove> findALLStu(final int start) {
		return (List<Stu_Fo_Remove>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select new com.zy.vo.Stu_Fo_Remove(SId, SName, SSex, SQq, SClasses, SStatus, SZxr, STel) from Student ");
				query.setFirstResult(start);
				query.setMaxResults(6);
				return query.list();
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public int countPages() {
		
		return (int) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				
				List<String> list=session.createQuery("select SId from Student").list();
				int counts=list.size();
				return counts;
			}
		});
	}

	@Override
	public void addUser(Follow f) {
		this.getHibernateTemplate().save(f);
		
	}

	@Override
	public Student selectOneStu(Integer SId) {		
		return this.getHibernateTemplate().get(Student.class,SId);
	}

	@Override
	public void updateStu(Student stu) {
		this.getHibernateTemplate().update(stu);
		
	}
}
