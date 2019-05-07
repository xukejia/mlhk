package com.direct.gn.component.admin.dao;


import java.util.List;

import com.direct.gn.component.admin.model.AdminMenuRole;
import com.direct.gn.dao.BaseDao;

public interface AdminMenuRoleMapper extends BaseDao<AdminMenuRole, Integer>
{
	int deleteById(Integer id);

	int insert(AdminMenuRole record);

	AdminMenuRole selectById(Integer id);

	int selectListCount(AdminMenuRole record);

	List<AdminMenuRole> selectList(AdminMenuRole record);

	int updateById(AdminMenuRole record);
}