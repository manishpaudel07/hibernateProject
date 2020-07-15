package com.hibernate.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.dao.dto.EmployeeDTO;
import com.hibernate.entity.EmployeeEntity;

@Service
@Transactional
public class EmployeeServiceDao implements EmployeeService {

	@Autowired
	@Qualifier("EmployeeOrmImpl")
	private EmployeeDao employeeDao; 
	@Override
	public void insertEmployee(EmployeeDTO employeeDTO) {
			EmployeeEntity employeeEntity=new EmployeeEntity();
			BeanUtils.copyProperties(employeeDTO, employeeEntity);
			employeeDao.insertEmployee(employeeEntity);
	}


}
