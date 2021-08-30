package com.gl.CreatingMail_ID;

import com.gl.UserINF.User_Details;

public class Creat_MailID {
String tech;
String admin;
String hr;
String legal;

static User_Details emp =new User_Details("VARUN","RAHUL");
public   String emid1() {
	return "Email-Id :" +emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"."+"tech@greatlearning.com" ;
}
public   String emid2() {
	return "Email-Id :" +emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"."+"admin@greatlearning.com" ;
}
public  String emid3() {
	return "Email-Id :" +emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"."+"hr@greatlearning.com" ;
}
public   String emid4() {
    return "Email-Id :" +emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"."+"legal@greatlearning.com" ;
	}
}