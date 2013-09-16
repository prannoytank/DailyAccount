package com.dailyaccount.util;


	
	 
	public class user {
	 
	    private int userid;
	     
	    private String name;
	     
	   

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		private int age;
	    
	 
	    public user() {
	         
	    }
	     
	    public user(String name , int age) {
	        this.name = name;
	        this.age = age;
	        
	         
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	     
	    // Getter and Setter methods
	 
	}


