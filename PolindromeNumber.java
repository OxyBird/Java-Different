package com.perscholas.my_first_project;

public class PolindromeNumber {

	public static void main(String[] args)
	// подидромическое число - читается одинаково в обоих сторонахю Н-р: 101
	
	{
		int a = 12321;
		String b = Integer.toString(a);
		System.out.println(b);
		String c = new StringBuilder(b).reverse().toString();
		System.out.println(c);
		
		//если сранивать строки, то оно делает некорректно. 
		//Пришлось перевести обратно в число
		
		if(Integer.parseInt(b)==Integer.parseInt(c))
		{
		System.out.println("This number is polidromic ");
		}
		else
		{
		System.out.println("This number is not polidromic ");
		}
		
						

	}

}
