package com.direct.gn.model.api.gw;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GwRouteVo implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 6561872615986467280L;

    private String data; // 可保存必要信息，之后生单按原值回转。最大 1000 个字符
    private String adultPrice; // 1：成人单价（以元为单位）
    private String adultTax; // 1：成人税费（以元为单位）
    private String childPrice; // 1：儿童单价（以元为单位）
    private String childTax; // 1：儿童税费（以元为单位）
    private String priceType = "0"; // 报价类型：0 普通价 / 1 留学生价
    private String applyType = "0"; // 报价类型：0 预定价 / 1 申请价/2 预约
    private String adultTaxType = "0"; // 成人税费类型：0 未含税 / 1 已含税
    private String childTaxType = "0"; // 儿童税费类型：0 未含税 / 1 已含税
    private GwRuleVo rule; // 退改签信息，参考 Rule Element
    
    private String seatCount;
    private String packageFlag="1"; //行李标识 1有行李  0没有行李
    private String validatingCarrier=""; //运价出票航司  如果没有默认第一段行程航司
    private String officeId="";
    private String gwType="";
    private List<GwSegmentVo> fromSegments; // 去程航段按顺序，参考下面的 Segment Element 如果为多程第一程、第二程的信息，全输出到此节点。
    private List<GwSegmentVo> retSegments; // 回程航段按顺序，参考下面的 Segment Element（单程搜索 为空）

    private String changePenalty;  // Galileo新加
    private String cancelPenalty;  // Galileo新加
    
    private String low_cabin_falg;
    
	private String officeIdQuery;//查询OfficeID
    private String officeIdOrder;//预订OfficeID

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }
    
    public String getKey()
    {
    	
    	if (null== fromSegments || fromSegments.size()==0)
    		return "";
    	String fromCity=fromSegments.get(0).getDepAirport();
    	String toCity=fromSegments.get(fromSegments.size()-1).getArrAirport();
    	String fromDate=fromSegments.get(0).getDepTime().substring(0, 8);
    	String retDate="";
    	if (null != retSegments && retSegments.size()>0)
    	{
    		retDate=retSegments.get(0).getDepTime().substring(0, 8);
    	}
        StringBuilder key = new StringBuilder();
        key.append(fromCity).append('-').append(toCity).append('-').append(fromDate);
        if (!"".equals(retDate.trim()))
        {
            key.append('-').append(retDate);
        }
        
        return key.toString();
    }
    
    public String getEXCKey()
    {
    	if (null== fromSegments || fromSegments.size()==0)
    		return "";
    	String fromCity=fromSegments.get(0).getDepAirport();
    	String toCity=fromSegments.get(fromSegments.size()-1).getArrAirport();
    	String airline=fromSegments.get(0).getCarrier();
        StringBuilder key = new StringBuilder();
        key.append(fromCity).append('-').append(toCity).append('-').append(airline);
        return key.toString();
    }

    
    
    public String getGwType() {
		return gwType;
	}

	public void setGwType(String gwType) {
		this.gwType = gwType;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public String getValidatingCarrier() {
		return validatingCarrier;
	}

	public void setValidatingCarrier(String validatingCarrier) {
		this.validatingCarrier = validatingCarrier;
	}

	public String getPackageFlag() {
		return packageFlag;
	}

	public void setPackageFlag(String packageFlag) {
		this.packageFlag = packageFlag;
	}

	public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public String getAdultPrice()
    {
        return adultPrice;
    }

    public void setAdultPrice(String adultPrice)
    {
        this.adultPrice = adultPrice;
    }

    public String getAdultTax()
    {
        return adultTax;
    }

    public void setAdultTax(String adultTax)
    {
        this.adultTax = adultTax;
    }

    public String getChildPrice()
    {
        return childPrice;
    }

    public void setChildPrice(String childPrice)
    {
        this.childPrice = childPrice;
    }

    public String getChildTax()
    {
        return childTax;
    }

    public void setChildTax(String childTax)
    {
        this.childTax = childTax;
    }

    public String getPriceType()
    {
        return priceType;
    }

    public void setPriceType(String priceType)
    {
        this.priceType = priceType;
    }

    public String getApplyType()
    {
        return applyType;
    }

    public void setApplyType(String applyType)
    {
        this.applyType = applyType;
    }

    public String getAdultTaxType()
    {
        return adultTaxType;
    }

    public void setAdultTaxType(String adultTaxType)
    {
        this.adultTaxType = adultTaxType;
    }

    public String getChildTaxType()
    {
        return childTaxType;
    }

    public void setChildTaxType(String childTaxType)
    {
        this.childTaxType = childTaxType;
    }

    public GwRuleVo getRule()
    {
        return rule;
    }

    public void setRule(GwRuleVo rule)
    {
        this.rule = rule;
    }

    public String getSeatCount()
    {
        return seatCount;
    }

    public void setSeatCount(String seatCount)
    {
        this.seatCount = seatCount;
    }

    public String getLow_cabin_falg() {
		return low_cabin_falg;
	}

	public void setLow_cabin_falg(String low_cabin_falg) {
		this.low_cabin_falg = low_cabin_falg;
	}

	public List<GwSegmentVo> getFromSegments()
    {
        return fromSegments;
    }

    public void setFromSegments(List<GwSegmentVo> fromSegments)
    {
        this.fromSegments = fromSegments;
    }

    public List<GwSegmentVo> getRetSegments()
    {
        return retSegments;
    }

    public void setRetSegments(List<GwSegmentVo> retSegments)
    {
        this.retSegments = retSegments;
    }

    public String getChangePenalty() {
        return changePenalty;
    }

    public void setChangePenalty(String changePenalty) {
        this.changePenalty = changePenalty;
    }

    public String getCancelPenalty() {
        return cancelPenalty;
    }

    public void setCancelPenalty(String cancelPenalty) {
        this.cancelPenalty = cancelPenalty;
    }

	public String getOfficeIdQuery() {
		return officeIdQuery;
	}

	public void setOfficeIdQuery(String officeIdQuery) {
		this.officeIdQuery = officeIdQuery;
	}

	public String getOfficeIdOrder() {
		return officeIdOrder;
	}

	public void setOfficeIdOrder(String officeIdOrder) {
		this.officeIdOrder = officeIdOrder;
	}
}
