/**
 * com.direct.gn
 */
package com.direct.gn.web.controller.admin;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.direct.gn.component.admin.model.AdminMenu;
import com.direct.gn.component.admin.model.AdminMenuRole;
import com.direct.gn.component.admin.model.AdminRole;
import com.direct.gn.component.admin.service.AdminMenuRoleService;
import com.direct.gn.component.admin.service.AdminMenuService;
import com.direct.gn.component.admin.service.AdminRoleService;
import com.direct.gn.exception.CustomException;
import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;
import com.direct.gn.web.controller.BaseController;

/**
 * @author cc
 *
 */
@Controller
@RequestMapping(value = "/admin/adminRole")
public class AdminRoleController extends BaseController
{
	@Autowired
	private AdminRoleService adminRoleService;

	@Autowired
	private AdminMenuRoleService adminMenuRoleService;
	
	@Autowired
	private AdminMenuService adminMenuService;
	// ////////////////////

	@RequestMapping(value = "list", method = { RequestMethod.POST, RequestMethod.GET })
	public String list(AdminRole record, PageQuery page, ModelMap modelMap)
	{
		QueryResult<AdminRole> result = adminRoleService.selectListByPage(record , page);
		modelMap.put("resultList", result.getResults());
		modelMap.put("page", result.getPageResult());
		modelMap.put("record", record);

		return "adminRole/list";
	}

	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST, RequestMethod.GET })
	public Object add(AdminRole record, ModelMap modelMap)
	{
		AdminRole vo = null;
		if (null == record.getId() || -1 == record.getId().intValue())
		{
			vo = new AdminRole();
		} else
		{
			vo = this.adminRoleService.selectById(record.getId());
		}

		modelMap.addAttribute("record", vo);
		return vo;
	}

	@RequestMapping(value = "save", method = { RequestMethod.POST, RequestMethod.GET })
	public String save(AdminRole record, ModelMap modelMap)
	{
		try
		{
			this.adminRoleService.save(record);
		} catch (CustomException e)
		{
			logger.error(e.getMessage(), e);
		}

		return "redirect:/admin/adminRole/list";
	}

	@RequestMapping(value = "del", method = { RequestMethod.POST, RequestMethod.GET })
	public String del(AdminRole record, ModelMap modelMap)
	{
		try
		{
			if (null != record.getId())
				this.adminRoleService.deleteById(record.getId());
		} catch (CustomException e)
		{
			logger.error(e.getMessage(), e);
		}

		return "redirect:/admin/adminRole/list";
	}
	
	@ResponseBody
	@RequestMapping(value = "toSetRoleMenu", method = { RequestMethod.POST, RequestMethod.GET })
	public Object toSetRoleMenu(AdminRole record, ModelMap modelMap , HttpServletRequest request)
	{
		List<AdminMenu> list = this.adminMenuService.getUserMenusList(record.getId());

		modelMap.addAttribute("menuList", list);
		return list;
	}
	
	@RequestMapping(value = "setRoleMenu", method = { RequestMethod.POST, RequestMethod.GET })
	public String setRoleMenu(Integer roleId, String[] menuIds , HttpServletRequest request)
	{
		if (null != roleId && null != menuIds)
		{
			List<AdminMenuRole> list = new ArrayList<AdminMenuRole>(menuIds.length);
			for (String menuId : menuIds)
			{
				AdminMenuRole menuRole = new AdminMenuRole();
				menuRole.setRoleId(roleId);
				menuRole.setMenuId(Integer.parseInt(menuId));
				list.add(menuRole);
			}

			try
			{
				this.adminMenuRoleService.saveMenuRole(roleId, list);
			} catch (CustomException e)
			{
				logger.error(e.getMessage() ,e);
			}
		}
		
		return "redirect:/admin/adminRole/list";
	}
}
