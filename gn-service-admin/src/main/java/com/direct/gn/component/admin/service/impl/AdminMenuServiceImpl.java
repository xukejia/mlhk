package com.direct.gn.component.admin.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.direct.gn.component.admin.dao.AdminMenuMapper;
import com.direct.gn.component.admin.model.AdminMenu;
import com.direct.gn.component.admin.model.AdminMenuRole;
import com.direct.gn.component.admin.service.AdminMenuRoleService;
import com.direct.gn.component.admin.service.AdminMenuService;
import com.direct.gn.dao.BaseDao;
import com.direct.gn.exception.CustomException;
import com.direct.gn.service.AbstractService;

@Service("adminMenuService")
public class AdminMenuServiceImpl extends AbstractService<AdminMenu, Integer> implements AdminMenuService
{
	@Autowired
	private AdminMenuMapper adminMenuMapper;

	@Autowired
	private AdminMenuRoleService adminMenuRoleService;
	
	@Override
	protected BaseDao<AdminMenu, Integer> getDao()
	{
		return adminMenuMapper;
	}

	@Override
	public int save(AdminMenu record) throws CustomException
	{
		if (null == record.getId())
		{
			return this.insert(record);
		} else
		{
			return this.updateById(record);
		}
	}

	////////////////////

	public List<AdminMenu> getUserMenusByRoleId(Integer roleId)
	{
		List<AdminMenu> list = new ArrayList<AdminMenu>();

		List<AdminMenu> menusList = this.adminMenuMapper.getUserMenusByRoleId(roleId);

		for (AdminMenu menu : menusList)
		{
			if (-1 == menu.getParentId())
			{
				// Parent
				list.add(menu);

				for (AdminMenu childMenu : menusList)
				{
					// child
					if (childMenu.getParentId().equals(menu.getId()))
					{
						menu.addChileMenu(childMenu);
					}
				}
			}
		}

		List<AdminMenu> result = new ArrayList<AdminMenu>(list.size());
		for(AdminMenu a : list)
		{
		    List<AdminMenu> childMenus = a.getChildMenus();
		    if (null != childMenus && childMenus.size() != 0)
		    {
		        result.add(a);
		    }
		}
		return result;
	}

	public List<AdminMenu> getUserMenusList(Integer roleId)
	{
		AdminMenu query = new AdminMenu();
		List<AdminMenu> menusList = this.adminMenuMapper.selectList(query);

		AdminMenuRole queryRole = new AdminMenuRole();
		queryRole.setRoleId(roleId);
		List<AdminMenuRole> roleMenus = adminMenuRoleService.selectList(queryRole , null);
		for (AdminMenuRole mr : roleMenus)
		{
			for (AdminMenu m : menusList)
			{
				if (mr.getMenuId().equals(m.getId())) {
					m.setCheck(true);
					break;
				}
			}
		}
		return menusList;
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
