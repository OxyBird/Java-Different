package com.perscholas.my_first_project;
import java.util.Scanner;
public class JavaFirstSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
System.out.print("Please enter 1,2 or 3: ");	
int day = s.nextInt();
s.close();

switch(day) {
case 1: System.out.println("Today is Sunday");
break;
case 2: System.out.println("Today is Monday");
break;
case 3: System.out.println("Tuesday");
break;
default:
	System.out.println("Invalid entry");
		}
	}
}
