package com.raju.dao;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.DTO.Loginproperties;
import com.raju.DTO.UserLogin;
import com.raju.model.User;



@Repository
public class UserDaoImp implements UserDao {
	public static final Logger logger=Logger.getLogger(UserDaoImp.class.getName());

	@Autowired
	public SessionFactory sessionFactory;
	public Integer userRegister(User user) {


		
		Session session=null;
		Integer count=null;
		Transaction tx=null;
		
		try {
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
		    count= (Integer) session.save(user);
					
					tx.commit();
					session.close();

		} catch (Exception e) {
			logger.info("session factory is "+e.getMessage());
		}
	
		return count;
	}

	
	public List<User> getAllUsers() {
		Session session=null;
		Integer count=null;
		Transaction tx=null;

		List<User> user=null;
		try {
			session=sessionFactory.openSession();
			tx=session.beginTransaction();

			Criteria  cretaria=  session.createCriteria(User.class);
			user=(List<User>)cretaria.list();
		
			tx.commit();
			session.close();

		} catch (Exception e) {
			logger.info("session factory is "+e.getMessage());
		}
		return  user;
	}
	public UserLogin userLogin(Loginproperties loginproperties) {

		Session session=null;

		Transaction tx=null;
		UserLogin userLogin=new UserLogin();
		try {
			session=sessionFactory.openSession();
			tx=session.beginTransaction();

			Query q=  session.createQuery("from User as u where u.name=? or u.mailId=? or u.mobile=? and u.password=?");
			q.setParameter(0, loginproperties.getUsername());
			q.setParameter(1, loginproperties.getUsername());  //
			q.setParameter(2, loginproperties.getUsername());
			q.setParameter(3, loginproperties.getPassword());
		
			List userlist=q.list();
			Iterator itr=userlist.iterator();

			while(itr.hasNext()) {
				User o= (User) itr.next();
				userLogin.setUsername(o.getName());
			}
			tx.commit();
			session.close();

		} catch (Exception e) {
			logger.info("session factory is "+e.getMessage());
		}
		return userLogin;
	}

	public List<User> findByName(String name) {
	Session session=	sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	Query q=session.createQuery("from User u where name=?");
	    q.setParameter(0, name);
	List<User> l=(List<User>)q.list();
	
	tx.commit();
	session.close();
		return l;
	}
}
