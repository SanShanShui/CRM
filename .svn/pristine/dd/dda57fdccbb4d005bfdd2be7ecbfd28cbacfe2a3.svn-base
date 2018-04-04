package com.zy.positionDao.imp;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zy.positionDao.PositionsDao;
import com.zy.vo.Positions;

public class PositionsDaoImp extends HibernateDaoSupport implements PositionsDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Positions> findAll(final int start) {
		
		return (List<Positions>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("from Positions ");
				query.setFirstResult(start);
				query.setMaxResults(6);
				System.out.println(query.list());
				return query.list();
			}
		});
	}

}
