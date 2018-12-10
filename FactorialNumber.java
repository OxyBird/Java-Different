package com.perscholas.my_first_project;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 6;
long Factorial = 1; //for 1st member = 1, 1! = 1

for(int a = 2; a <= n; a++) 
{
	Factorial = Factorial * a;
}

System.out.println(Factorial);
	}
	
}
