package com.dev.account.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="inbox")
public class Inbox {
	@Override
	public String toString() {
		return "Inbox [message_id=" + message_id + ", user_id=" + user_id + ", message=" + message + ", account="
				+ account + "]";
	}
	public int getMessage_id() {
		return message_id;
	}
	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Id
	@GeneratedValue
	@Column
	private int message_id;
	@Column
	private int user_id;
	@Column
	private String message;
	@OneToOne(mappedBy ="inbox")     
	private Account account;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
