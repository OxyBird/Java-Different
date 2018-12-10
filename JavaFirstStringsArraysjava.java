package com.perscholas.my_first_project;

public class JavaFirstStringsArraysjava {
public static void main(String[] args) {
			
	String lower="hello world!";
	String upper="HELLO WORLD!";
	
	System.out.println(lower.toUpperCase()); //convert in upper
	System.out.println(upper.toLowerCase()); //convert to lower
	System.out.println(lower.contains("lo wo")); //boolean true or false	
	System.out.println(upper.equals(lower)); 
	System.out.println(lower.equalsIgnoreCase(upper));
	
		}

}
