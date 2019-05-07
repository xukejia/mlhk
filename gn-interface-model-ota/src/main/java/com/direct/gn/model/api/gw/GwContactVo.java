package com.direct.gn.model.api.gw;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GwContactVo implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 9074403055934955417L;

    private String name; // 联系人姓名，不单独区分姓和名
    private String address; // 详细地址
    private String postcode; // 邮编
    private String email; // 联系人邮箱（留空）
    private String mobile; // 联系人手机号，接口方提供固定手机号，不使用用 户手机

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

}
