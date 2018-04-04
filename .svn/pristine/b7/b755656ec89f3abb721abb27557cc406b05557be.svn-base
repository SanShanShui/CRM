package com.zy.removeDao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zy.removeDao.RemoveDao;
import com.zy.vo.Follow;
import com.zy.vo.Remove;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

public class RemoveDaoImp extends HibernateDaoSupport implements RemoveDao{

     //测试	
	//添加Remove  r_date或者三表联查
	@SuppressWarnings("unchecked")
	@Override
	public List<Stu_Fo_Remove> findALLRemove(final int start) {
		return (List<Stu_Fo_Remove>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
                Query query=session.createQuery("select new com.zy.vo.Stu_Fo_Remove(s.SId,s.SName,s.SQq,s.SStatus,"
			                 +"s.SZxr,s.STel,r.RId,r.ROldzxr,r.RNewzxr,r.RDate,r.RCase)from Remove r inner join r.student s");
                query.setFirstResult(start);
                query.setMaxResults(6);
				return query.list();
			}
		});
	}

	@Override
	public int countPages() {
		return (int) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
                List<?> list=session.createQuery("select RId from Remove").list();
				return list.size();
			}
		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Stu_Fo_Remove> findNewRemove(final int start) {
		
		return (List<Stu_Fo_Remove>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select new com.zy.vo.Stu_Fo_Remove(s.SId,s.SName,s.SQq,s.SStatus,"
			                 +"s.SZxr,s.STel,r.RId,r.ROldzxr,r.RNewzxr,r.RDate,r.RCase) from Remove r inner join r.student s group by s.SId");
				query.setFirstResult(start);
				query.setMaxResults(6);
				return query.list();
			}
		});
	}

	@Override
	public int findNewRId() {
		return (int) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				@SuppressWarnings("unchecked")
				List<Integer> list=session.createQuery("select Max(r.RId) from Remove r left join r.student s group by s.SId").list();
				return list.size();
			}
		});
	}

	@Override
	public void addRemove(Remove remove) {
		this.getHibernateTemplate().save(remove);
	}

	@Override
	public Student selectOneStu(Integer SId) {
		return this.getHibernateTemplate().get(Student.class, SId);
	}

	@Override
	public void addFollow(Follow f) {
        this.getHibernateTemplate().save(f);		
	}

}
