package com.pojo;

public class User {

	private String username;
	private String userid;
	private String pwd;
	private String memid;

	public User() {

	}

	public User(String username, String userid, String pwd, String memid) {
		this.username = username;
		this.userid = userid;
		this.pwd = pwd;
		this.memid = memid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + ", pwd=" + pwd + ", memid=" + memid + "]";
	}

}
