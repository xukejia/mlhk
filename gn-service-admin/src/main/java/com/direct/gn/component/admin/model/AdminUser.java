package com.direct.gn.component.admin.model;

import com.direct.gn.model.AbstractModel;


/**
 * 后台管理用户
 * @author cc
 *
 */
public class AdminUser extends AbstractModel{
    /**
     * 
     */
    private static final long serialVersionUID = 2238553050014175744L;
                                               
    private Integer id;            // 后台用户id   
    private String username;       // 用户名      
    private String passwd;         // 密码       
    private String email;          // 邮箱       
    private String telphone;       // 手机       
    private String status;         // 状态       
    private Integer roleId;    //后台角色id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public Integer getRoleId()
	{
		return roleId;
	}

	public void setRoleId(Integer roleId)
	{
		this.roleId = roleId;
	}
    
}