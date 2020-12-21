package com.tyjw.inspectline.wogrid.client;

import lombok.Data;

@Data
public class CloudMessage {

	private int head=0x8ae5;
	private byte version=1;
	private byte commType=3;
	private short dataType;
	private byte clientType=5;
	private int userId;
	private int taskId;
	private short state=0;
	private short length;
	private byte[] data;



	/*public int getHead() {
		return head;
	}
	public void setHead(int head) {
		this.head = head;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getCommType() {
		return commType;
	}
	public void setCommType(int commType) {
		this.commType = commType;
	}
	public int getDataType() {
		return dataType;
	}
	public void setDataType(int dataType) {
		this.dataType = dataType;
	}
	public int getClientType() {
		return clientType;
	}
	public void setClientType(int clientType) {
		this.clientType = clientType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CloudMessage [head=" + head + ", version=" + version + ", commType=" + commType + ", dataType="
				+ dataType + ", clientType=" + clientType + ", userId=" + userId + ", taskId=" + taskId + ", state="
				+ state + ", length=" + length + "]";
	}*/
}
