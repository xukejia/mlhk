package com.direct.gn.component.admin.dao;

import java.util.List;

import com.direct.gn.component.admin.model.AdminRole;
import com.direct.gn.dao.BaseDao;

public interface AdminRoleMapper extends BaseDao<AdminRole, Integer>
{
	int deleteById(Integer id);

	int insert(AdminRole record);

	AdminRole selectById(Integer id);

	int selectListCount(AdminRole record);

	List<AdminRole> selectList(AdminRole record);

	int updateById(AdminRole record);
}