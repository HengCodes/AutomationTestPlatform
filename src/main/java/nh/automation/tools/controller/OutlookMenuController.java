package nh.automation.tools.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import nh.automation.tools.entity.OutlookMenu;
import nh.automation.tools.service.OutlookMenuService;

/**
 * 项目    ：UI自动化测试 SSM
 * 类描述：
 * @author Eric
 * @date 2017年3月9日
 * nh.automation.tools.contorller
 */
@Controller
public class OutlookMenuController {

	@Autowired
	private OutlookMenuService service;
	
	@RequestMapping(value="getMenuJson")
	public @ResponseBody List<OutlookMenu> getAllMenuJson(){
		return service.outlookMenus();
	}
	
	@RequestMapping(value="getMenuGirdJson")
	public @ResponseBody PageInfo<OutlookMenu> getMenuList(Map<String, Object> map){
		return service.queryByPage(null, 1, 20);
	}
}
