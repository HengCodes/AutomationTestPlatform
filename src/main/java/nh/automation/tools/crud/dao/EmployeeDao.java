package nh.automation.tools.crud.dao;

import nh.automation.tools.crud.entity.Employee;

/**
 * 项目 ：UI自动化测试 SSM 类描述：
 * 
 * @author Eric
 * @date 2017年3月7日 nh.automation.tools.crud.dao
 */
public interface EmployeeDao {
	public Employee getEmployeeById(int id);
}
