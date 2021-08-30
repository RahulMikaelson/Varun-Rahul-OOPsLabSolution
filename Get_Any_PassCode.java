package com.gl.PassWordGen;

import java.util.Random;

public class Get_Any_PassCode {

	String char1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String char2 = "abcdepghijklmnopqrstuvwxyz";
	String char3 = "!@#$%^&*";
	String char4 = "0123456789";
	String Pass1 = "" ;
	String Pass2 = "" ;
	String Pass3 = "" ;
	String Pass4 = "" ;
	int l1=2;
	int l2=3;
	int l3=1;
	int l4=2;
	Random rand1 = new Random();
	Random rand2 = new Random();
	Random rand3= new Random();
	Random rand4 = new Random();
	char[] text1 = new char[l1];
	char[] text2 = new char[l2];
	char[] text3 = new char[l3];
	char[] text4 = new char[l4];
	
	// GENERATING RANDOM CAPITAL i.e for PASS1 
	public  String gp1() {
		
		for(int i=0; i< l1; i++) {
			text1[i] = char1.charAt(rand1.nextInt(char1.length()));
		}
		
	for(int i=0; i<text1.length; i++) {
		Pass1 += text1[i];
		
		}
	return Pass1;

		}
	// GENERATING RANDOM SMALL i.e for PASS2
	public  String gp2() {
		
		for(int i=0; i< l2; i++) {
			text2[i] = char2.charAt(rand2.nextInt(char2.length()));
		}
		
	for(int i=0; i<text2.length; i++) {
		Pass2 += text2[i];
		
		}
	return Pass2;

		}
	// GENERATING RANDOM SPECIAL KEY i.e for PASS3
	public  String gp3() {
		
		for(int i=0; i< l3; i++) {
			text3[i] = char3.charAt(rand3.nextInt(char3.length()));
		}
		
	for(int i=0; i<text3.length; i++) {
		Pass3 += text3[i];
		
		}
	return Pass3;

		}
	// GENERATING RANDOM NUMBER i.e for PASS4
	public  String gp4() {
		
		for(int i=0; i< l4; i++) {
			text4[i] = char4.charAt(rand4.nextInt(char4.length()));
		}
		
	for(int i=0; i<text4.length; i++) {
		Pass4 += text4[i];
		
		}
	return Pass4;

		}
	
}
