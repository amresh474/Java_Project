package com.nt.FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	public static void main(String[] args) {
		System.out.println("without supplier ");
		System.out.println(getDBConnectionURl());
		
		System.out.println(" with supplier ");
		System.out.println(getDBConnectionURlSupplier.get());
		System.out.println(getDBConnectionURlsSupplier.get());
		
	}
	
	
	public static String getDBConnectionURl() {
		return "jdbc://localhost:5432/user";
	}

	
	public static Supplier<String> getDBConnectionURlSupplier=()
											->"jdbc://localhost:5432/user";
											
    public static Supplier<List<String>>getDBConnectionURlsSupplier=()
    									->List.of(
    											"jdbc://localhost:5432/user",
    											"jdbc://localhost:5432/customer",
    											"jdbc://localhost:5432/login"
    											);
}
