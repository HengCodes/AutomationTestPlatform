package nh.automation.tools.crud.contorller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import nh.automation.tools.crud.entity.Employee;
import nh.automation.tools.crud.service.EmployeeDaoImp;

/**
 * 项目    ：UI自动化测试 SSM
 * 类描述：
 * @author Eric
 * @date 2017年3月7日
 * nh.automation.tools.crud.contorller
 */
@Controller
public class EmployContorller {
	
	@Autowired
	private EmployeeDaoImp employeeService;
	
	@RequestMapping(value="queryUserById/{id}")
	public String getEmployById(@PathVariable("id") Integer id,Map<String, Object> map){
		Employee employee = employeeService.getEmployeeById(id);
		map.put("employee", employee);
		return "queryInfo";
	}
}
