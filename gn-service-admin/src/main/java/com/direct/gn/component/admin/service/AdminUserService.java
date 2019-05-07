/**
 * com.direct.gn
 */
package com.direct.gn.component.admin.service;

import com.direct.gn.component.admin.model.AdminUser;
import com.direct.gn.exception.CustomException;
import com.direct.gn.service.BaseService;

/**
 * @author cc
 *
 */
public interface AdminUserService extends BaseService<AdminUser, Integer>
{
	 AdminUser getUser(AdminUser user);
	 void saveAdminUser(AdminUser user) throws CustomException;
}
