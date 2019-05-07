/**
 * com.direct.gn
 */
package com.direct.gn.component.admin.service;

import java.util.List;

import com.direct.gn.component.admin.model.AdminMenuRole;
import com.direct.gn.exception.CustomException;
import com.direct.gn.service.BaseService;

/**
 * @author cc
 *
 */
public interface AdminMenuRoleService extends BaseService<AdminMenuRole, Integer>
{
	void saveMenuRole(Integer roleId, List<AdminMenuRole> list) throws CustomException;
}
