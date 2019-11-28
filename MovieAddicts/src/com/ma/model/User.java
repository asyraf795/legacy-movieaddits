package com.ma.model;

public class User {
	private String userid;
	private String userpassword;
	
	public String getUserid() {
return userid;	
	}
	public String getUserpassword() {
		return userpassword;	
	}
	
	public void setUserid(String userid) {
		this.userid = userid;	
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;	
	}
    @Override
    public String toString() {
    	return "User [userid=" + userid + ", userpassword=" + userpassword + "]";
    	

    }

}
