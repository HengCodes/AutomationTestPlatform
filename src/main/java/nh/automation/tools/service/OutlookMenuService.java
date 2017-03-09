package nh.automation.tools.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import nh.automation.tools.dao.OutlookMenuMapper;
import nh.automation.tools.entity.OutlookMenu;

/**
 * 项目 ：UI自动化测试 SSM 类描述：
 * 
 * @author Eric
 * @date 2017年3月9日 nh.automation.tools.ervice
 */
@Service
@Transactional
public class OutlookMenuService {

	@Autowired
	private OutlookMenuMapper mapper;

	/*
	 * @see nh.automation.tools.dao.OutlookMenuMapper#outlookMenus()
	 */
	public List<OutlookMenu> outlookMenus() {
		return mapper.getAll();
	}

	public PageInfo<OutlookMenu> queryByPage(Integer id, Integer pageNo, Integer pageSize) {
		pageNo = pageNo == null ? 1 : pageNo;
		pageSize = pageSize == null ? 10 : pageSize;
		PageHelper.startPage(pageNo, pageSize);
		List<OutlookMenu> list = mapper.selectMenuById(id);
		// 用PageInfo对结果进行包装
		PageInfo<OutlookMenu> page = new PageInfo<OutlookMenu>(list);
		// 测试PageInfo全部属性
		System.out.println(page.getPageNum());
		System.out.println(page.getPageSize());
		System.out.println(page.getStartRow());
		System.out.println(page.getEndRow());
		System.out.println(page.getTotal());
		System.out.println(page.getPages());
		System.out.println(page.isHasPreviousPage());
		System.out.println(page.isHasNextPage());
		return page;
	};

}
