package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("**Welcome to The Line Comparison Computation Program**");
		Scanner sc = new Scanner(System.in);
		
		//Taking Co-ordinates as a variables
		int x1, y1, x2, y2;
		
		//Taking Inputs from users 
		System.out.println("Enter the value of x1: ");
		x1 = sc.nextInt();
		
		System.out.println("Enter the value of x2: ");
		x2 = sc.nextInt();
		
		System.out.println("Enter the value of y1: ");
		y1 = sc.nextInt();
		
		System.out.println("Enter the value of y2: ");
		y2 = sc.nextInt();
		
		//Defining the Length of line
		double length = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
		
		System.out.println("The length of line is: " + length);
		
		
	
	}
}
