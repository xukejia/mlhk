/**
 * com.direct.gn
 */
package com.direct.gn.component.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.direct.gn.component.admin.dao.AdminMenuRoleMapper;
import com.direct.gn.component.admin.model.AdminMenuRole;
import com.direct.gn.component.admin.service.AdminMenuRoleService;
import com.direct.gn.dao.BaseDao;
import com.direct.gn.exception.CustomException;
import com.direct.gn.service.AbstractService;

/**
 * @author cc
 *
 */
@Service("adminMenuRoleService")
public class AdminMenuRoleServiceImpl extends AbstractService<AdminMenuRole, Integer> implements AdminMenuRoleService
{
	@Autowired
	private AdminMenuRoleMapper adminMenuRoleMapper;

	@Override
	protected BaseDao<AdminMenuRole, Integer> getDao()
	{
		return this.adminMenuRoleMapper;
	}

	@Override
	public int save(AdminMenuRole record) throws CustomException
	{
		return 0;
	}

	public void saveMenuRole(Integer roleId, List<AdminMenuRole> list) throws CustomException
	{
		this.deleteById(roleId);

		for (AdminMenuRole menuRole : list)
		{
			this.insert(menuRole);
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
