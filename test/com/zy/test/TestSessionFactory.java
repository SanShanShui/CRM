package com.zy.test;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zy.vo.Follow;
import com.zy.vo.Privilege;
import com.zy.vo.Remove;
import com.zy.vo.Role;
import com.zy.vo.Student;
import com.zy.vo.User;
import com.zy.vo.User_Role;


public class TestSessionFactory {

	@Test
	public void test() {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		
		User user=new User();
		user.setUName("test1");
		user.setUPassword("test");
		Role role=(Role) session.get(Role.class, 2);
		user.setRole(role);
		session.save(user);
		ts.commit();
	}
	@Test
	public void testDel(){
		
		
	}
//查询user用户
	@SuppressWarnings("unchecked")
	@Test
	public void testselectUser(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		List<User> list=session.createQuery("from User").list();
		List<User_Role> newlist=new ArrayList<User_Role>();
//		System.out.println(list);
		for (User user : list) {
			Role role=user.getRole();
			User_Role ur=new User_Role();
			ur.setUId(user.getUId());
			ur.setUName(user.getUName());
			ur.setRId(role.getRId());
			ur.setRName(role.getRName());
			ur.setRDesc(role.getRDesc());
			newlist.add(ur);
		}
		System.out.println(newlist);
	}
//查询权限（单个用户）
	@SuppressWarnings("unchecked")
	@Test
	public void testFind(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		List<String> prilist=new ArrayList<String>();
		Query query=session.createQuery("from User where UName=?");
		query.setParameter(0, "test");
		User user=(User) query.uniqueResult();
//		System.out.println(user);
		int RId=user.getRole().getRId();
//		System.out.println(RId);
		
        query=session.createQuery("select new com.zy.vo.Privilege(p.PId, p.PName,p.PDesc) from Privilege p "
				+ "left join p.roles r where r.RId=?");
		query.setParameter(0, RId);
		List<Privilege> list=query.list();
		for (Privilege privilege : list) {
			System.out.println(privilege.getPName());
			prilist.add(privilege.getPName());
		}
		System.out.println(prilist);
	}
 
	@Test
	public void fenye(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Long counts=(Long) session.createQuery("select count(u.UName) from User u left join u.role r where r.RId>1").uniqueResult();
		
		System.out.println(counts);
	}

	
	@Test
	public void test01(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select new com.zy.vo.Role(RId, RName, RDesc) from Role where RId>?");
//		query.setParameter(0, "RId");错  ？=？
		query.setParameter(0, 1);
         System.out.println(query.list());
	}
	@Test
	public void test2(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Student stu=new Student();
		stu.setSName("张0");
		stu.setSStatus("首次咨询");
		stu.setSZxr("li");
		Follow f=new Follow();
		f.setFZxr("li");
		f.setFStatus("首次咨询");
		f.setStudent(stu);
		session.save(f);
		ts.commit();
	}
	@Test
	public void test3(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Student stu=(Student) session.get(Student.class, 1);
		stu.setSName("张1");
		stu.setSZxr("li01");
		Follow f=new Follow();
		f.setFZxr("li01");
		f.setFStatus("咨询费用");
		f.setStudent(stu);
		session.save(f);
		ts.commit();
	}
	@Test
	public void test4(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Student stu=(Student) session.get(Student.class, 1);
		
		Remove r=new Remove();
		r.setROldzxr(stu.getSZxr());
		stu.setSZxr("li");
		r.setRNewzxr("li");
		r.setRCase("交流");
		r.setStudent(stu);
		session.save(r);
		ts.commit();
	}
	
	@Test
	public void test5(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Student stu=(Student) session.get(Student.class, 1);
		
		stu.setSName("张里");

		session.save(stu);
		ts.commit();
	}
//错误	（未建立关系）
	@Test
	public void test6(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Remove remove=new Remove();		
		Follow follow=new Follow();
		
		follow.setFZxr("001");
		
		Student student=(Student) session.get(Student.class, 1);
		remove.setROldzxr(student.getSZxr());
		student.setSZxr("001");
		remove.setRNewzxr("001");
//		remove.setStudent(student);
		Set<Remove> sRemove=new HashSet<Remove>();
		
		sRemove.add(remove);
		student.setRemoves(sRemove);
		Set<Follow> sFollow=new HashSet<Follow>();
		
		sFollow.add(follow);
		student.setFollows(sFollow);
		session.save(student);
		ts.commit();
	}
	@Test
	public void test7(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Remove remove=new Remove();		
		Follow follow=new Follow();
		
		follow.setFZxr("001");
		
		Student student=(Student) session.get(Student.class, 1);
		remove.setROldzxr(student.getSZxr());
		student.setSZxr("001");
		remove.setRNewzxr("001");
		remove.setStudent(student);
        follow.setStudent(student);
		session.save(remove);
		session.save(follow);
		ts.commit();
	}@Test
	public void test8(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
//		Remove remove=new Remove();		
//		Follow follow=new Follow();
		Query query=session.createQuery("select new com.zy.vo.Stu_Fo_Remove(s.SId,s.SName,s.SQq,s.SStatus,"
                +"s.STel,f.FId,f.FDate,r.RId,r.ROldzxr,r.RNewzxr,r.RCase)from Follow f  join f.student inner Remove r");
		System.out.println(query.uniqueResult());
//		follow.setFZxr("001");
		
//		Student student=(Student) session.get(Student.class, 1);
//		remove.setROldzxr(student.getSZxr());
//		student.setSZxr("001");
//		remove.setRNewzxr("001");
//		remove.setStudent(student);
//        follow.setStudent(student);
//		session.save(remove);
//		session.save(follow);
		ts.commit();
	}
//查询最新stuRemove	
	@SuppressWarnings("unchecked")
	@Test
	public void test9(){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		List<Integer> list=session.createQuery("select max(y.RId) from Remove y left join y.student s  group by s.SId  ").list();
		List<Remove> listYJ=new ArrayList<Remove>();
		for (Integer it : list) {
			
			Remove yj=(Remove) session.get(Remove.class, it);				
			listYJ.add(yj);
		}			
		for (Remove yijiao : listYJ) {
			System.out.println(yijiao.getRNewzxr());
		}

//		session.save(stu);
		ts.commit();
	}
}
