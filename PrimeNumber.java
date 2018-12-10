package com.perscholas.my_first_project;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 11;
long max = Math.round(Math.sqrt(a));
boolean flag = true;

for(int c = 2; c <= max; c++) 
{
	if(a%c == 0) 
	{
		flag = false;
		break;
	}
		
}
if (flag == true) 
System.out.println(" This number is prime");
else System.out.println(" This number is not prime");

	}
}
