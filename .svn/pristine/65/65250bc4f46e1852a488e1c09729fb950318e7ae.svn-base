package com.zy.followDao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zy.followDao.FollowDao;
import com.zy.vo.Follow;
import com.zy.vo.Stu_Fo_Remove;
import com.zy.vo.Student;

public class FollowDaoImp extends HibernateDaoSupport implements FollowDao{

	//添加Follow f_content
	@SuppressWarnings("unchecked")
	@Override
	public List<Stu_Fo_Remove> findALLFollow(final int start) {
		return (List<Stu_Fo_Remove>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
                 Query query =session.createQuery("select new com.zy.vo.Stu_Fo_Remove(s.SId,"
                 		+ "s.SName,f.FId,f.FDate,f.FWay,f.FZxr,f.FStatus,f.FContent) from Follow f inner join f.student s");
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
				List<?> list=session.createQuery("select FId from Follow").list();
				return list.size();
			}
		});
	}

	@Override
	public void addFollow(Follow f) {
		this.getHibernateTemplate().save(f);
	}

	@Override
	public Student selectOneStu(Integer SId) {
		
		return this.getHibernateTemplate().get(Student.class, SId);
	}

	@Override
	public Stu_Fo_Remove selectOneFollow(final Integer FId) {
		return (Stu_Fo_Remove) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select new com.zy.vo.Stu_Fo_Remove(s.SId,"
                 		+ "s.SName,f.FId,f.FDate,f.FWay,f.FZxr,f.FStatus,f.FContent) from Follow f inner join f.student s where f.FId=?");
				query.setParameter(0, FId);
				return query.uniqueResult();
			}
		});
	}

}
