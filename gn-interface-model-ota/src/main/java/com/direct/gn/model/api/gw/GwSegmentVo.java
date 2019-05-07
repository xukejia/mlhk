package com.direct.gn.model.api.gw;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GwSegmentVo implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 6639163912974940034L;

    private String carrier; // 航司IATA二字码，必须与flightNumber航司相同
    private String flightNumber; // 航班号，如：CA123。
    private String depAirport; // 出发机场 IATA 三字码
    private String depTime; // 起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203100300 表示 2012 年 3 月 10 日 3 时 0 分
    private String arrAirport; // 到达机场 IATA 三字码
    private String arrTime; // 起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203101305 表示 2012 年 3 月 10 日 13 时 5 分
    private String stopCities=""; // 经停地，/分隔城市三字码
    private String codeShare; // 代码共享标识（true代码共享/false 非代码共享）
    private String sharingFlightNumber; // 共享航班号（非必须，codeShare为true时请提供）
    private String departureTerminal; // 出发航站楼(非必须)
    private String arrivingTerminal; // 到达航站楼(非必须)
    private String cabin; // 舱位
    private String aircraftCode; // 机型
    private String seatCount; // 舱位数（非必须）
    private String fareType; // GW报价类型,RP 公布运价,UP私有运价
    private String fareBasis; //GW 运价基础
    
    
    
    public String getFareBasis() {
		return fareBasis;
	}

	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}

	@Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    public String getCarrier()
    {
        return carrier;
    }

    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public String getFlightNumber()
    {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public String getDepAirport()
    {
        return depAirport;
    }

    public void setDepAirport(String depAirport)
    {
        this.depAirport = depAirport;
    }

    public String getDepTime()
    {
        return depTime;
    }

    public void setDepTime(String depTime)
    {
        this.depTime = depTime;
    }

    public String getArrAirport()
    {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport)
    {
        this.arrAirport = arrAirport;
    }

    public String getArrTime()
    {
        return arrTime;
    }

    public void setArrTime(String arrTime)
    {
        this.arrTime = arrTime;
    }

    public String getStopCities()
    {
        return stopCities;
    }

    public void setStopCities(String stopCities)
    {
        this.stopCities = stopCities;
    }

    public String getCodeShare()
    {
        return codeShare;
    }

    public void setCodeShare(String codeShare)
    {
        this.codeShare = codeShare;
    }

    public String getSharingFlightNumber()
    {
        return sharingFlightNumber;
    }

    public void setSharingFlightNumber(String sharingFlightNumber)
    {
        this.sharingFlightNumber = sharingFlightNumber;
    }

    public String getDepartureTerminal()
    {
        return departureTerminal;
    }

    public void setDepartureTerminal(String departureTerminal)
    {
        this.departureTerminal = departureTerminal;
    }

    public String getArrivingTerminal()
    {
        return arrivingTerminal;
    }

    public void setArrivingTerminal(String arrivingTerminal)
    {
        this.arrivingTerminal = arrivingTerminal;
    }

    public String getCabin()
    {
        return cabin;
    }

    public void setCabin(String cabin)
    {
        this.cabin = cabin;
    }

    public String getAircraftCode()
    {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode)
    {
        this.aircraftCode = aircraftCode;
    }

    public String getSeatCount()
    {
        return seatCount;
    }

    public void setSeatCount(String seatCount)
    {
        this.seatCount = seatCount;
    }

    public String getFareType()
    {
        return fareType;
    }

    public void setFareType(String fareType)
    {
        this.fareType = fareType;
    }

}
