package com.Forever.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Forever.po.DrUser;
import com.Forever.po.HibernateSessionFactory;

public class Userdao {

	public static void main(String[] args) {
		new Userdao().queryByCanShu();
	}
	
	public void queryByCanShu(){
		try {
			
			Session session=HibernateSessionFactory.getSession();
			
			Query query=session.createQuery("from DrUser where username like :p1");
			query.setString("p1", "永恒%");
			List<DrUser> list=query.list();
			Iterator<DrUser> it=list.iterator();
			while(it.hasNext()){
				System.out.println(it.next().getUsername());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	
	public void queryByUsername(){
		try {
			Session session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from DrUser as u where username like '%玮艺'");
			List<DrUser> list=query.list();
			Iterator<DrUser> it=list.iterator();
			while(it.hasNext()){	
				System.out.println(it.next().getUsername());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public void queryall(){
		try {

			Session session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from DrUser");//HQL:Hibernate Query Language
			List<DrUser> list=query.list();				   //SQL:Structed Query Language
			Iterator<DrUser> it=list.iterator();
			while(it.hasNext()){
				System.out.println(it.next().getUsername());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
		
	}
	
	public void queryById(){
		try {
			Session session=HibernateSessionFactory.getSession();

			//DrUser user=(DrUser)session.load(DrUser.class, 10); //如果主键为空 加载出现异常
			DrUser user=(DrUser)session.get(DrUser.class, 10);    //如果主键为空 没有异常 输出为null
			
			System.out.println(user.getUsername());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	
	public void update(){
		Transaction trans=null;
		try {

			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();

			DrUser user=(DrUser)session.load(DrUser.class, 10);
			user.setUsername("永恒玮艺");
			user.setEmail("15704602359@163.com");
			user.setNickname("ForeverSuper");
			user.setOnline("yes");
			user.setPassword("asdasd321321");
			user.setRank(3);
			user.setSex("men");
			session.update(user);
			
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}


	}

	public void del(){
		Transaction trans=null;
		try {

			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();

			DrUser user=(DrUser)session.load(DrUser.class, 11);
			session.delete(user);

			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}

	}

	public void add(){
		Transaction trans=null;
		try {

			Session session=HibernateSessionFactory.getSession();
			trans=session.beginTransaction();

			DrUser user=new DrUser();
			user.setUsername("asd");
			user.setEmail("15704602359@163.com");
			user.setNickname("ForeverSuper");
			user.setOnline("yes");
			user.setPassword("asdasd321321");
			user.setRank(3);
			user.setSex("men");
			session.save(user);

			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();
		}

	}
}
