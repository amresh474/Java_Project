package com.nt.learning;

import java.util.Scanner;

public class FactorialInJava {
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num =sr.nextInt();
		System.out.println(factorialInjava(num));
	}
	
	public static int factorialInjava(int num) {
//		if(num<0) {
//			return  1;
//		}
		if(num==0) {
			return 1;
		}
		return num*factorialInjava(num-1);
	}
}
