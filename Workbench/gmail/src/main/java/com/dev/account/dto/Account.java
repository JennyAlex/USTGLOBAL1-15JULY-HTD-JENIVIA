package com.dev.account.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="account")
public class Account {
	@Override
	public String toString() {
		return "Account [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", email="
				+ email + ", inbox=" + inbox + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@GeneratedValue
	@Column
	private int user_id;
	@Column
	private String user_name;
	@Column
	private String password;
	@Column
	private String email;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="message_id")
	private Inbox inbox ;

	public Inbox getInbox() {
		return inbox;
	}

	public void setInbox(Inbox inbox) {
		this.inbox = inbox;
	}

	public static void main(String[] args) {


	}

}
