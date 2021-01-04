package com.xywei.vo;

public class UserResult {

	// 参与抢票的用户
	private Integer userId;
	// 用户抢票的结果信息
	private String resultMessage;

	public UserResult() {
	}

	public UserResult(Integer userId, String resultMessage) {
		this.userId = userId;
		this.resultMessage = resultMessage;
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

	@Override
	public String toString() {
		return "UserResult [userId=" + userId + ", resultMessage=" + resultMessage + "]";
	}
	

}
