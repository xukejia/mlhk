package com.direct.gn.component.admin.model;

import com.direct.gn.model.AbstractModel;

/**
 * 管理菜单与管理角色关联
 * @author cc
 *
 */
public class AdminMenuRole extends AbstractModel{
    /**
     * 
     */
    private static final long serialVersionUID = 6090157375709081449L;

    private Integer id;
    private Integer roleId; //后台管理角色id
    private Integer menuId; //菜单id
    
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getRoleId()
    {
        return roleId;
    }
    public void setRoleId(Integer roleId)
    {
        this.roleId = roleId;
    }
    public Integer getMenuId()
    {
        return menuId;
    }
    public void setMenuId(Integer menuId)
    {
        this.menuId = menuId;
    }

 
}