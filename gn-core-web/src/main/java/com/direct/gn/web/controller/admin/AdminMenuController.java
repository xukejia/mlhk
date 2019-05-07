/**
 * com.direct.gn
 */
package com.direct.gn.web.controller.admin;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.direct.gn.component.admin.model.AdminMenu;
import com.direct.gn.component.admin.service.AdminMenuService;
import com.direct.gn.exception.CustomException;
import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;
import com.direct.gn.web.controller.BaseController;

/**
 * @author cc
 *
 */
@Controller
@RequestMapping(value = "/admin/adminMenu")
public class AdminMenuController extends BaseController
{
	@Autowired
	private AdminMenuService adminMenuService;

	// ////////////////////

	@RequestMapping(value = "list", method = { RequestMethod.POST, RequestMethod.GET })
	public String list(AdminMenu record, PageQuery page, ModelMap modelMap)
	{
		page.setOrderBy("parent_id , sort");
		QueryResult<AdminMenu> result = adminMenuService.selectListByPage(record , page);
		
		AdminMenu query = new AdminMenu();
		query.setParentId(-1);
		List<AdminMenu> menus = adminMenuService.selectList(query , null);
		Map<Integer , String> menuMap = new TreeMap<Integer, String>();
		
		menuMap.put(-1, "父级菜单");
		for (AdminMenu m : menus){
			menuMap.put(m.getId(), m.getMenuName());
		}
		modelMap.put("menuMap", menuMap);
		modelMap.put("resultList", result.getResults());
		modelMap.put("page", result.getPageResult());
		modelMap.put("record", record);

		return "adminMenu/list";
	}

	@ResponseBody
	@RequestMapping(value = "add", method = { RequestMethod.POST, RequestMethod.GET })
	public Object add(AdminMenu record, ModelMap modelMap)
	{
		AdminMenu vo = null;
		if (null == record.getId() || -1 == record.getId().intValue())
		{
			vo = new AdminMenu();
		} else
		{
			vo = this.adminMenuService.selectById(record.getId());
		}

		return vo;
	}

	@RequestMapping(value = "save", method = { RequestMethod.POST, RequestMethod.GET })
	public String save(AdminMenu record, ModelMap modelMap, HttpSession session)
	{
		try
		{
			this.adminMenuService.save(record);
		} catch (CustomException e)
		{
			logger.error(e.getMessage(), e);
		}

		return "redirect:/admin/adminMenu/list";
	}

	@RequestMapping(value = "del", method = { RequestMethod.POST, RequestMethod.GET })
	public String del(AdminMenu record, ModelMap modelMap)
	{
		try
		{
			if (null != record.getId())
				this.adminMenuService.deleteById(record.getId());
		} catch (CustomException e)
		{
			logger.error(e.getMessage(), e);
		}

		return "redirect:/admin/adminMenu/list";
	}
}
