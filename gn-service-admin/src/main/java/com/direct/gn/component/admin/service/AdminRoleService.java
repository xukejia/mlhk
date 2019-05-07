/**
 * com.direct.gn
 */
package com.direct.gn.component.admin.service;

import java.util.Map;

import com.direct.gn.component.admin.model.AdminRole;
import com.direct.gn.service.BaseService;

/**
 * @author cc
 *
 */
public interface AdminRoleService extends BaseService<AdminRole, Integer>
{
	Map<Integer, String> getRoleMap(AdminRole record);
}
