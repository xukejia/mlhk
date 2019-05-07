package com.direct.gn.component.admin.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.direct.gn.component.admin.dao.AdminUserMapper;
import com.direct.gn.component.admin.model.AdminUser;
import com.direct.gn.component.admin.service.AdminUserService;
import com.direct.gn.dao.BaseDao;
import com.direct.gn.exception.CustomException;
import com.direct.gn.service.AbstractService;
import com.direct.gn.utils.Constant;
import com.direct.gn.utils.MD5Util;

@Service("adminUserService")
public class AdminUserServiceImpl extends AbstractService<AdminUser, Integer> implements AdminUserService
{
	@Autowired
	private AdminUserMapper adminUserMapper;

	@Override
	protected BaseDao<AdminUser, Integer> getDao()
	{
		return adminUserMapper;
	}

	public AdminUser getUser(AdminUser user)
	{
		List<AdminUser> userList = this.adminUserMapper.selectList(user);

		AdminUser adminUser = null;
		if (userList.size() > 0)
		{
			adminUser = userList.get(0);
		}

		return adminUser;
	}

	public void saveAdminUser(AdminUser user) throws CustomException
	{
		AdminUser queryUser = new AdminUser();
		queryUser.setUsername(user.getUsername());
		List<AdminUser> userList = this.adminUserMapper.selectList(queryUser);

		if (userList.size() > 0)
		{
			user.setId(userList.get(0).getId());
			this.updateById(user);
		} else
		{
			this.insert(user);
		}

	}

	public int save(AdminUser record) throws CustomException
	{
		if (!StringUtils.isEmpty(record.getPasswd()))
		{
			record.setPasswd(MD5Util.MD5Encode(record.getPasswd(), Constant.CHARACTER_ENCODING_UTF8));
		}
		if (null == record.getId())
		{
			return this.insert(record);
		} else
		{
			return this.updateById(record);
		}
	}

	/* (non-Javadoc)
	 * @see com.direct.gn.service.BaseService#deleteByIdOnLogic(java.lang.Long)
	 */
	@Override
	public int deleteByIdOnLogic(Long id, String modifyBy) throws CustomException
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
