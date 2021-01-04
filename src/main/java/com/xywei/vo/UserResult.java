package com.xywei.vo;

import java.io.Serializable;

public class UserResult implements Serializable {

	/**
	 * @Datetime 2021年1月4日 下午8:04:55<br/>
	 */
	private static final long serialVersionUID = 45485916394110044L;
	// 参与抢票的用户
	private Integer userId;
	// 用户抢票的结果信息
	private String resultMessage;

	private Integer status;

	public UserResult() {
	}

	public UserResult(Integer userId, String resultMessage, Integer status) {
		this.userId = userId;
		this.resultMessage = resultMessage;
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserResult [userId=" + userId + ", resultMessage=" + resultMessage + ", status=" + status + "]";
	}
}
