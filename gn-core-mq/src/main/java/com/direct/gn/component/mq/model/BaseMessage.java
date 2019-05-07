package com.direct.gn.component.mq.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.UUID;

public class BaseMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -395519855540003281L;

	private String id;

	public String getId() {
		return null == id ? UUID.randomUUID().toString() : id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getBytes() {
		byte[] bytes = null;
		if (null != this) {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			try {
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(this);
				oos.flush();
				bytes = bos.toByteArray();
				oos.close();
				bos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return bytes;
	}

	public static BaseMessage fromBytes(byte[] bytes) {
		Object obj = null;
		if (null != bytes) {
			try {
				ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
				ObjectInputStream ois = new ObjectInputStream(bis);
				obj = ois.readObject();
				ois.close();
				bis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			} catch (ClassNotFoundException ex) {
				ex.printStackTrace();
			}
		}
		return (BaseMessage) obj;
	}
	
}
