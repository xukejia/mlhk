package com.direct.gn.component.admin.model;

import java.util.ArrayList;
import java.util.List;

import com.direct.gn.model.AbstractModel;

/**
 * 管理菜单
 * @author cc
 *
 */
public class AdminMenu extends AbstractModel{
    /**
     * 
     */
    private static final long serialVersionUID = -3261194409337794832L;
                                                             
    private Integer id;           // 菜单id                    
    private Integer parentId;     // 上级菜单id                  
    private String menuName;      // 菜单名称                    
    private String menuLevel;     // 菜单层次(菜单层次,如1,2,3)       
    private String url;           // 菜单URL                   
    private String remark;        // 菜单描述                    
    private Integer sort;         // 排序                
    private String type;
    
    private boolean check = false; //页面使用
    
    private boolean childFlag = false;
    private List<AdminMenu> childMenus = new ArrayList<AdminMenu>();
    
    public void addChileMenu(AdminMenu childMenu)
    {
    	childMenus.add(childMenu);
    }
    
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getParentId()
    {
        return parentId;
    }
    public void setParentId(Integer parentId)
    {
        this.parentId = parentId;
    }
    public String getMenuName()
    {
        return menuName;
    }
    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }
    public String getMenuLevel()
    {
        return menuLevel;
    }
    public void setMenuLevel(String menuLevel)
    {
        this.menuLevel = menuLevel;
    }
    public String getUrl()
    {
        return url;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }
    public String getRemark()
    {
        return remark;
    }
    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    public Integer getSort()
    {
        return sort;
    }
    public void setSort(Integer sort)
    {
        this.sort = sort;
    }
	public List<AdminMenu> getChildMenus()
	{
		return childMenus;
	}
	public void setChildMenus(List<AdminMenu> childMenus)
	{
		this.childMenus = childMenus;
	}
	public boolean isChildFlag()
	{
		return childFlag;
	}
	public void setChildFlag(boolean childFlag)
	{
		this.childFlag = childFlag;
	}

	public boolean isCheck()
	{
		return check;
	}

	public void setCheck(boolean check)
	{
		this.check = check;
	}

	public String getType()
	{
		return this.type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

}