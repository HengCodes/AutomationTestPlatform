package nh.automation.tools.crud.mapper;

import nh.automation.tools.crud.entity.Employee;

public interface EmployeeMapper {
	int insert(Employee record);

	Employee getEmployeeById(int id);

	int insertSelective(Employee record);
}