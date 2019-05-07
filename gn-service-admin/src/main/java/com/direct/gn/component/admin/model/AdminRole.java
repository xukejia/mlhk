package com.direct.gn.component.admin.model;

import com.direct.gn.model.AbstractModel;

/**
 * 管理角色
 * @author cc
 *
 */
public class AdminRole extends AbstractModel{
    /**
     * 
     */
    private static final long serialVersionUID = 6175862205540443965L;

    private Integer id;        //后台角色id
    private String roleName;   //角色名称
    private String remark;     //角色描述
    private String status;     //状态(0--停用;1--启用)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}