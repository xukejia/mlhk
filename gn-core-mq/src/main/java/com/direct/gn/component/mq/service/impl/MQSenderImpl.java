package com.direct.gn.component.mq.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.Producer;
import com.aliyun.openservices.ons.api.SendResult;
import com.aliyun.openservices.ons.api.exception.ONSClientException;
import com.direct.gn.component.mq.model.BaseMessage;
import com.direct.gn.component.mq.model.EhcacheMessage;
import com.direct.gn.component.mq.model.MessageConst;
import com.direct.gn.component.mq.service.MQSender;

//@Service
public class MQSenderImpl implements MQSender {
	private static Logger logger = LoggerFactory.getLogger(MQSenderImpl.class);

	@Autowired
	Producer producer;

	@Override
	public void sendEhMsg(EhcacheMessage message) {
		String topic = MessageConst.TOPIC_TEST;
		String tag = "modified";
		send(topic, tag, message);
	}
	
	
	
	private void send(String topic, String tag, BaseMessage message) {
		Message msg = new Message( //
				// Message所属的Topic
				topic,
				// Message Tag 可理解为Gmail中的标签，对消息进行再归类，方便Consumer指定过滤条件在MQ服务器过滤
				tag,
				// Message Body 可以是任何二进制形式的数据， MQ不做任何干预
				// 需要Producer与Consumer协商好一致的序列化和反序列化方式
				message.getBytes());
		// 设置代表消息的业务关键属性，请尽可能全局唯一
		// 以方便您在无法正常收到消息情况下，可通过MQ 控制台查询消息并补发
		// 注意：不设置也不会影响消息正常收发
		msg.setKey(message.getId());
		// 发送消息，只要不抛异常就是成功
		try {
			SendResult sendResult = producer.send(msg);
			assert sendResult != null;
			logger.info("send success: " + sendResult.getMessageId());
		} catch (ONSClientException e) {
			logger.error(e.getMessage(), e);
		}
	}

}
