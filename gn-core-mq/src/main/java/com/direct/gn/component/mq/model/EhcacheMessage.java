package com.direct.gn.component.mq.model;

/**
 * EhcacheMessage 设置对cacheName的标志，如清空该缓存
 * 
 * @author w2017
 *
 */
public class EhcacheMessage extends BaseMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1272633639821650984L;
	
	// Message Constants
	public static final String EH_MSG_MODIFY = "1";
	public static final String EH_MSG_NORMAL = "0";

	private String cacheName; // 缓存名称
	private String message;   // 消息标志  EH_MSG_MODIFY -> 已修改，请清空 ;  EH_MSG_NORMAL -> 未有改动

	public EhcacheMessage(String cacheName, String message) {
		super();
		this.cacheName = cacheName;
		this.message = message;
	}

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		EhcacheMessage msg1 = new EhcacheMessage("foo111", "b");
		byte[] bs1 = msg1.getBytes();
		EhcacheMessage msg2 = (EhcacheMessage) EhcacheMessage.fromBytes(bs1);
		System.out.println(msg2.getCacheName());
	}

}
