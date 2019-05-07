package com.direct.gn.model.api.gw;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GwOrderVo implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -2320918881558422874L;

    private String cid; // 接口身份标识用户名（渠道唯一标识）
    private String tripType; // 行程类型， 1：单程； 2：往返； 3：多程；
    private String sessionId; // 会话标识：标记服务接口调用的唯一标识，相应的 调用结果中会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
    private GwRouteVo routing; // 报价信息，参考搜索返回结果中的 Routing Elements。 只含航班信息，不含价格信息.不包含CabinClass
    private List<GwPassengerVo> passengers; // 乘机人信息，参考下面的Passenger Element
    private GwContactVo contact; // 联系人信息，参考下面的Contact Element

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    public String getCid()
    {
        return cid;
    }

    public void setCid(String cid)
    {
        this.cid = cid;
    }

    public String getTripType()
    {
        return tripType;
    }

    public void setTripType(String tripType)
    {
        this.tripType = tripType;
    }

    public String getSessionId()
    {
        return sessionId;
    }

    public void setSessionId(String sessionId)
    {
        this.sessionId = sessionId;
    }

    public GwRouteVo getRouting()
    {
        return routing;
    }

    public void setRouting(GwRouteVo routing)
    {
        this.routing = routing;
    }

    public List<GwPassengerVo> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(List<GwPassengerVo> passengers)
    {
        this.passengers = passengers;
    }

    public GwContactVo getContact()
    {
        return contact;
    }

    public void setContact(GwContactVo contact)
    {
        this.contact = contact;
    }

}
