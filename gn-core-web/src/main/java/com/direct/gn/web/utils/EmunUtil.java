/**
 * com.direct.gn
 */
package com.direct.gn.web.utils;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.direct.gn.enums.BaseEmun;
import com.direct.gn.enums.GeneralStatusEmum;
import com.direct.gn.enums.GeneralTaskStatusEmum;
import com.direct.gn.enums.PolicyStatusEnum;
import com.direct.gn.enums.business.*;

import org.springframework.stereotype.Component;

/**
 * @author cc
 *
 */
@Component("emunUtil")
public class EmunUtil
{
	final private Map<String, BaseEmun[]> emunMap = new HashMap<String, BaseEmun[]>();

	@PostConstruct
	public void init()
	{
		emunMap.put("GeneralStatusEmum", GeneralStatusEmum.values());
		emunMap.put("PolicyStatusEnum", PolicyStatusEnum.values());
		emunMap.put("AirlineCodeEmun", AirlineCodeEmun.values());
		emunMap.put("AirlineRuleFlagEmun", AirlineRuleFlagEmun.values());
		emunMap.put("PlatformEmun", PlatformEmun.values());
		emunMap.put("PolicyTypeEmun", PolicyTypeEmun.values());
		
		emunMap.put("AirTypeEmun", AirTypeEmun.values());
		emunMap.put("YesNoEmun", YesNoEmun.values());
		
		emunMap.put("CrawlerTaskTypeEmun", CrawlerTaskTypeEmun.values());
		emunMap.put("LogCrawlerTypeEmun", LogCrawlerTypeEmun.values());
		emunMap.put("LogTaskTypeEmun", LogTaskTypeEmun.values());
		emunMap.put("ProxyFlagEmun", ProxyFlagEmun.values());
		emunMap.put("DepreciateTaskStatusEmun", DepreciateTaskStatusEmun.values());
		emunMap.put("ServiceOFFEmun", ServiceOFFEmun.values());

		emunMap.put("GWServiceSwitch", GWServiceSwitch.values());
		emunMap.put("LCCServiceSwitch", LCCServiceSwitch.values());
		emunMap.put("OrderStatusEmun", OrderStatusEmun.values());

		emunMap.put("TransitEmun", TransitEmun.values());
		emunMap.put("OperateActionEmun", OperateActionEmun.values());
		emunMap.put("DataSourceEmun", DataSourceEmun.values());
		emunMap.put("RouteTypeEmun", RouteTypeEmun.values());
		emunMap.put("CCPriceLogTypeEmun", CCPriceLogTypeEmun.values());
		emunMap.put("GeneralTaskStatusEmum", GeneralTaskStatusEmum.values());
		emunMap.put("CreateByEmun", CreateByEmun.values());
		emunMap.put("LostFalgEmun", LostFalgEmun.values());
		emunMap.put("CGEmun", CGEmun.values());
		emunMap.put("ExchangeRateEmun", ExchangeRateEmun.values());
		emunMap.put("RebateTypeEmun", RebateTypeEmun.values());

		emunMap.put("GwStatTypeEnum", GwStatTypeEnum.values());
		emunMap.put("GwTypeEmun", GwTypeEmun.values());
		emunMap.put("GetTypeEmun", GetTypeEmun.values());
		emunMap.put("OtaApiLogStatusEmun", OtaApiLogStatusEmun.values());
		emunMap.put("OtaApiLogTypeEmun", OtaApiLogTypeEmun.values());
		emunMap.put("LogRemarkEmun", LogRemarkEmun.values());
		
	}

	@PreDestroy
	public void destroy()
	{
		emunMap.clear();
	}

	public BaseEmun[] getBaseEmuns(String emunName)
	{
		return emunMap.get(emunName);
	}

	public BaseEmun getBaseEmun(String emunName, String code)
	{
		BaseEmun result = null;
		BaseEmun[] es = emunMap.get(emunName);
		if (null != es)
		{
			for (BaseEmun e : es)
			{
				if (e.getCode().equals(code))
				{
					result = e;
					break;
				}
			}
		}
		return result;
	}
}
