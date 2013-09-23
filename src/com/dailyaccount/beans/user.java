package com.dailyaccount.beans;

public class user {

	private int userid;
	private String nickname;
	private String name;
	private char gender;
	private String dob;
	private String contactnumber;
	private String permanentnumber;
	private String address;
	private String password;

	
	public user() {

	}

	public user(String name, String nickname, String password,char gender, String dob,
			String contactnumber, String permanentnumber, String address) {
		this.name = name;
		this.nickname = nickname;
		this.gender = gender;
		this.dob = dob;
		this.contactnumber = contactnumber;
		this.permanentnumber = permanentnumber;
		this.address = address;
		this.password=password;

	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getPermanentnumber() {
		return permanentnumber;
	}

	public void setPermanentnumber(String permanentnumber) {
		this.permanentnumber = permanentnumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
