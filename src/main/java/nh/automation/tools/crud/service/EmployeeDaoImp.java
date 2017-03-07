package nh.automation.tools.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nh.automation.tools.crud.dao.EmployeeDao;
import nh.automation.tools.crud.entity.Employee;
import nh.automation.tools.crud.mapper.EmployeeMapper;

/**
 * 项目 ：UI自动化测试 SSM 类描述：
 * 
 * @author Eric
 * @date 2017年3月7日 nh.automaiton.tools.crud.dao.impl
 */
@Service
@Transactional
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private EmployeeMapper employeeMapper;

	/*
	 * @see nh.automation.tools.crud.dao.EmployeeDao#getEmployeeById(int)
	 */
	public Employee getEmployeeById(int id) {
		Employee employee = employeeMapper.getEmployeeById(id);
		return employee;
	}

}
