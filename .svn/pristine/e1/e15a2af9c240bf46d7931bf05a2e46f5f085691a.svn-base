package com.zy.userDao.imp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zy.userDao.UserDao;
import com.zy.vo.Privilege;
import com.zy.vo.Role;
import com.zy.vo.User;
import com.zy.vo.User_Role;

public class UserDaoImp extends HibernateDaoSupport implements UserDao{
//登录判断
	@Override
	public Boolean panduan(final String username, final String password) {
      
		return (Boolean) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("from User where UUsername=? and UPassword=?");
				query.setParameter(0, username);
				query.setParameter(1, password);
				User user=(User) query.uniqueResult();
				if(user!=null){
					return true;
				}
				return false;
			}
		
		});
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findAllRole() {
		
		return this.getHibernateTemplate().executeFind(new HibernateCallback<Object>() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				List<Role> list=session.createQuery("select new com.zy.vo.Role(RId, RName, RDesc) from Role where RId>1").list();
				return list;
			}
		});
	}


	@Override
	public void addUser(User user) {
	
		this.getHibernateTemplate().save(user);
		
	}
	
@Override
	public Role findByRId(final Integer RId) {
		
		return (Role) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("from Role where RId=?");
                query.setParameter(0, RId);
				return query.uniqueResult();
			}
		});
	}


	//获取权限
	@SuppressWarnings("unchecked")
	@Override
	public List<String> selectPrivilege(final String username) {
		
		return (List<String>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				List<String> list=new ArrayList<String>();
				Query query=session.createQuery("from User where UUsername=?");
				query.setParameter(0, username);
				User user=(User) query.uniqueResult();
				int RId=user.getRole().getRId();
				query=session.createQuery("select new com.zy.vo.Privilege(p.PId,p.PName , p.PDesc) "
						+ "from Privilege p left join p.roles r where r.RId=?");
				query.setParameter(0, RId);
				List<Privilege> prilist=(List<Privilege>) query.list();
				for (Privilege each : prilist) {
					list.add(each.getPName());
				}
				//放入session
				ServletActionContext.getRequest().getSession().setAttribute("privilege", list);
				return list;
			}
		});
	}
//查询所有用户
	@SuppressWarnings("unchecked")
	@Override
	public List<User_Role> selectAllUser(final int start) {
		return (List<User_Role>) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select new com.zy.vo.User_Role(u.UId,u.UUsername,u.UPassword,u.UName,u.UTel,"
						+ "u.UEmail,r.RId,r.RName,r.RDesc) "
						+ "from User u left join u.role r where r.RId>1");
				query.setFirstResult(start);
				query.setMaxResults(6);
				return query.list();
			}
		});
	}
//角色
	@Override
	public int selectUser_Role(final String username) {
		
		return (int)this.getHibernateTemplate().execute(new HibernateCallback<Integer>() {

			@Override
			public Integer doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("from User where UUsername=?");
				query.setParameter(0, username);
				User user=(User) query.uniqueResult();
				return user.getRole().getRId();
			}
		});
	}

	@Override
	public int countPages() {
		return (int)this.getHibernateTemplate().execute(new HibernateCallback<Integer>() {

			@Override
			public Integer doInHibernate(Session session)
					throws HibernateException, SQLException {
				List<?> list=session.createQuery("select u.UId from User u left join u.role r where r.RId>1").list();
				int counts =list.size();
				return counts;
			}
		});
	}

	@Override
	public void delUser(Integer UId) {
		this.getHibernateTemplate().delete(findByUId(UId));
		
	}

	@Override
	public User findByUId(Integer UId) {
		return this.getHibernateTemplate().get(User.class, UId);
	}


	@Override
	public void updateUser(User user) {
		
		this.getHibernateTemplate().update(user);
		
	}

	@Override
	public User_Role selectOneUser(final Integer UId) {
		
		return (User_Role) this.getHibernateTemplate().execute(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select new com.zy.vo.User_Role(u.UId,u.UUsername,u.UPassword,u.UName,u.UTel,"
						+ "u.UEmail,r.RId,r.RName,r.RDesc) "
						+ "from User u left join u.role r where u.UId=?");
                query.setParameter(0, UId);
				return query.uniqueResult();
			}
		});
	}

	
}
