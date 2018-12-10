package com.perscholas.my_first_project;
import java.util.Scanner;

public class JavaFirstScanner {

	public static void main(String[] args) {
        String name ;
        int age;
        long mobile;
        Scanner s = new Scanner(System.in);
        
		// output name
		System.out.println("Please input your name: ");		
		name = s.nextLine();
		System.out.println("You have enteres your name as:  " + name);
		
		//output age
		System.out.println("Input your age: ");
		age=s.nextInt();
		System.out.println("Your age is: " + age);
		
		//output mobile
		System.out.println("What is your mobile number?");
		mobile=s.nextLong();	
		System.out.println("Thank you for your mobile phone: " + mobile);
		s.close();
							
		
	}
}