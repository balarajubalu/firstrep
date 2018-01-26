package com.raju.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
private SessionFactory sessionFactory;
	public static final Logger logger=Logger.getLogger(EmployeeDaoImpl.class.getName());
	public void addEmployee(Employee e) {
     Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Integer count=(Integer) session.save(e);
		if(count>0) {
			logger.info("registration succes..................................");
		}
		tx.commit();
		session.close();
	}

	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
