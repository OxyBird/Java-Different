package com.perscholas.my_first_project;

public class JavaFirstFibonacciLoop {

	public static void main(String[] args)
	//фибоначи -число, где первые два числа равны 0 и 1 или 1 и 1, а последующие равны сумме предыдущих 2х цифр
	{
		// без рекурсии (рекурсия - когда функция вызывает саму себя)
		
		int n = 10;
		int[] Massiv = new int[n];		
		
		Massiv[0] = 0;
		Massiv[1] = 1;
		// calculated Array values  and put it into memory
		for(int i = 2; i <= (n-1); i++) 
		{   
		Massiv[i] = Massiv[i-2] + Massiv[i-1];
		}
		// printed Array values		
		for(int i = 0; i <= (n-1); i++)
		{
		System.out.print(Massiv[i] + " ");
	    }

	}
}

