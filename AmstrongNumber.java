package com.perscholas.my_first_project;

public class AmstrongNumber {

	public static void main(String[] args) {
		// Число, которое равно сумме своих членов,возведеннух ы степень количества цифр в числе
		// Например: 153=1(в степени)**3 +5 (в степени)**3 +3(встепени)**3 
		//т е 153 = сумме произведений своих чисел==153 - амстронг число
		
		int a = 153;
		int ostatok = a; //считает 
		int stepen = 0; // считает кол-во циклов=степени возведения
		int c;
		int result;
		int b;
		
		
		while (ostatok != 0)  
		{
			ostatok = (int)Math.floor(ostatok/10); //определяет первую цифру вместе со след выражением.
			                            //она всегда выдает double формат
		stepen++;			
		}
			
		ostatok  = a;
		result = 0;
		
		while (ostatok != 0)  
	    {
		c = (int) Math.floor(ostatok/10);//в первой итерации равно 15(округленное 15.3)
		b = ostatok - (c * 10);  //мы определяем первое число: отнимаем от 153 150 (15*10)
				
		result = result + (int)Math.pow(b, stepen);//возводит в степень полученную цифру
		// и аккумулируется. На первой итерации reult=0. после второй итерации ==27 (3**3) и т.д.
		ostatok = c; //определяем тот остаток от деления, который идет в начало цикла. 
		//по первой итераации = 15
	    }
if(result == a)
{
	System.out.println("Amstrong number "); 
}
	else
	{
		System.out.println("Not amstrong number ");
		
}
	
	}
}