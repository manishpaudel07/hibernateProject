package com.hibernate.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.entity.EmployeeEntity;


@Repository("EmployeeOrmImpl")
public class EmployeeOrmImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession()
	{
		return sessionFactory.openSession();
	}
	
	@Override
	public void insertEmployee(EmployeeEntity employeeEntity)
	{
		getSession().save(employeeEntity);
	}

}
