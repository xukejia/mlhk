/**
 * com.direct.gn
 */
package com.direct.gn.component.admin.service;

import java.util.List;

import com.direct.gn.component.admin.model.AdminMenu;
import com.direct.gn.service.BaseService;

/**
 * @author cc
 *
 */
public interface AdminMenuService extends BaseService<AdminMenu, Integer>
{
	List<AdminMenu> getUserMenusByRoleId(Integer roleId);
	
	List<AdminMenu> getUserMenusList(Integer roleId);
}
