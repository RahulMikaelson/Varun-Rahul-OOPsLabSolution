package com.gl.UserINF;

public class User_Details {
	private String FirstName;
	private String LastName;

	public User_Details(String firstName, String lastName) {
		
		FirstName = firstName;
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
