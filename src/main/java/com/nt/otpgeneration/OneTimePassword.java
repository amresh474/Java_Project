package com.nt.otpgeneration;

import java.util.Random;
import java.util.Scanner;

public class OneTimePassword {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter number");
		int length=src.nextInt();
		System.out.println(Otp(length));

	}
  public static char[] Otp(int len) {
	  System.out.println("Generating OTP using random() : "); 
      System.out.print("You OTP is : "); 
	  String number="0123456789";
	  String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
      String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
      String numbers = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; 
      String symbols = "!@#$%^&*_=+-/.?<>)";
      
//      String values=Capital_chars + Small_chars +  number + symbols;
	  Random random =new Random();
	  char [] otp= new char[len];
	  
	  for (int i = 0; i < otp.length; i++) {
		  otp[i]=number.charAt(random.nextInt(numbers.length()));
	}
	  return otp;
  }
}
