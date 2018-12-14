package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String type;
	private String loginId;
	private String password;
	private int score;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public User(String name,String type,String loginId,String password) {
		this.name=name;
		this.type=type;
		this.loginId=loginId;
		this.password=password;
		//System.out.println("User "+name+" created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		

}
