package com.perscholas.my_first_project;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class JavaFirst_If {

	public static void main(String[] args) {
		
		if (3 < 5 ) {
			System.out.println("Three really less then 5");
			}
		
		String location="Per Scholas";
		if (location==("Per Scholas")) {
			System.out.println ("This is right location");
			}
			else { System.out.println("You are in the wrong place");
		
		}
		
		int score = 80;
		if (score >= 90) {
			System.out.println("You made A");
		}
		else if (score <= 90) {
			System.out.println("You made B");
		}
		
		else System.out.println("You made C or worse");
		}
	
}




