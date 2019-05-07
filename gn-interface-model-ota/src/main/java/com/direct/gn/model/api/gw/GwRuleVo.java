package com.direct.gn.model.api.gw;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GwRuleVo implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -4692034537441792775L;

    private String refund; // 退票规定，最⼤大 300 个字符
    private String endorse; // 改签规定，最⼤大 300 个字符
    private String baggage; // 行李额规定，最⼤大 300 个字符
    private String other; // 其他说明，最⼤大 300 个字符

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    public String getRefund()
    {
        return refund;
    }

    public void setRefund(String refund)
    {
        this.refund = refund;
    }

    public String getEndorse()
    {
        return endorse;
    }

    public void setEndorse(String endorse)
    {
        this.endorse = endorse;
    }

    public String getBaggage()
    {
        return baggage;
    }

    public void setBaggage(String baggage)
    {
        this.baggage = baggage;
    }

    public String getOther()
    {
        return other;
    }

    public void setOther(String other)
    {
        this.other = other;
    }

}
