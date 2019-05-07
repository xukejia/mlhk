package com.direct.gn.component.admin.dao;

import java.util.List;

import com.direct.gn.component.admin.model.AdminUser;
import com.direct.gn.dao.BaseDao;

public interface AdminUserMapper extends BaseDao<AdminUser, Integer>
{
	int deleteById(Integer id);

	int insert(AdminUser record);

	AdminUser selectById(Integer id);

	int selectListCount(AdminUser record);

	List<AdminUser> selectList(AdminUser record);

	int updateById(AdminUser record);
}