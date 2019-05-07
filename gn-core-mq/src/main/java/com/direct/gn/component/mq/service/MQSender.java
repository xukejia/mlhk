package com.direct.gn.component.mq.service;

import com.direct.gn.component.mq.model.EhcacheMessage;

/**
 * MQ消息发送
 * @author w2017
 *
 */
public interface MQSender {

	/** 发送ehcache消息 */
	void sendEhMsg(EhcacheMessage msg);
	
}
