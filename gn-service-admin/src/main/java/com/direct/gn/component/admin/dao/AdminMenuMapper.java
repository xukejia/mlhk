package com.direct.gn.component.admin.dao;

import java.util.List;

import com.direct.gn.component.admin.model.AdminMenu;
import com.direct.gn.dao.BaseDao;


public interface AdminMenuMapper extends BaseDao<AdminMenu, Integer>
{
    int deleteById(Integer id);

    int insert(AdminMenu record);

    int selectListCount(AdminMenu record);

    List<AdminMenu> selectList(AdminMenu record);

    AdminMenu selectById(Integer id);

    int updateById(AdminMenu record);
    
    List<AdminMenu> getUserMenusByRoleId(Integer roleId);
}