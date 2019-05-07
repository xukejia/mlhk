package com.direct.gn.component.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.direct.gn.component.admin.dao.AdminRoleMapper;
import com.direct.gn.component.admin.model.AdminRole;
import com.direct.gn.component.admin.service.AdminRoleService;
import com.direct.gn.dao.BaseDao;
import com.direct.gn.exception.CustomException;
import com.direct.gn.service.AbstractService;

@Service("adminRoleService")
public class AdminRoleServiceImpl extends AbstractService<AdminRole, Integer> implements AdminRoleService
{
	@Autowired
	private AdminRoleMapper adminRoleMapper;

	@Override
	protected BaseDao<AdminRole, Integer> getDao()
	{
		return adminRoleMapper;
	}

	////////////////////

	public Map<Integer, String> getRoleMap(AdminRole record)
	{
		List<AdminRole> list = this.adminRoleMapper.selectList(record);

		Map<Integer, String> resMap = new HashMap<Integer, String>(list.size());

		for (AdminRole role : list)
		{
			resMap.put(role.getId(), role.getRoleName());
		}

		return resMap;
	}

	@Override
	public int save(AdminRole record) throws CustomException
	{
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
