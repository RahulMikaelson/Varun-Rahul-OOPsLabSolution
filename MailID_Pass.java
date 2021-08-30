package com.gl.UserAccMain;

import java.util.Scanner;

import com.gl.CreatingMail_ID.Creat_MailID;
import com.gl.PassWordGen.Get_Any_PassCode;
//import com.gl.UserINF.User_Details;
import com.gl.UserINF.User_Details;

public class MailID_Pass {
	public static void main(String[] args) {
		
		User_Details emp =new User_Details("VARUN","RAHUL");
		Get_Any_PassCode obj = new Get_Any_PassCode();
		Creat_MailID id = new Creat_MailID();
		System.out.println("HELLO"+" " +emp.getFirstName()+" "+emp.getLastName());
    int choice;
	System.out.println("Please Choose The Department");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Hr");
	System.out.println("4.Legal");
	Scanner sc = new Scanner(System.in);
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		
		System.out.println(id.emid1());
		System.out.println("PassWord :" +obj.gp1()+obj.gp2()+obj.gp3()+obj.gp4());
		break;
	case 2:
		System.out.println(id.emid2());
		System.out.println("PassWord :" +obj.gp1()+obj.gp2()+obj.gp3()+obj.gp4());
		break;
	case 3:
		System.out.println(id.emid3());
		System.out.println("PassWord :" +obj.gp1()+obj.gp2()+obj.gp3()+obj.gp4());
		break;
	case 4:
		System.out.println(id.emid4());
		System.out.println("PassWord :" +obj.gp1()+obj.gp2()+obj.gp3()+obj.gp4());
		break;
	default:
		System.out.println(" Choose Valid Options");
			
	}
	
	}
}
