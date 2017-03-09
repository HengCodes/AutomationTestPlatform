package nh.automation.tools.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import nh.automation.tools.entity.OutlookMenu;

public interface OutlookMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OutlookMenu record);

    int insertSelective(OutlookMenu record);

    OutlookMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OutlookMenu record);

    int updateByPrimaryKey(OutlookMenu record);
    
    List<OutlookMenu> getAll();
    
    List<OutlookMenu> selectMenuById(@Param("id") Integer id);
}