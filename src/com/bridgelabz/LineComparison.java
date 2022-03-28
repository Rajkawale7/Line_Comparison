package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				//Taking Co-ordinates as a variables for Line 1
				int x1, y1, x2, y2;
				
				//Taking Inputs from users for line 1
				System.out.println("**Computation for line 1**");
				
				System.out.println("Enter the value of x1: ");
				x1 = sc.nextInt();
				
				System.out.println("Enter the value of x2: ");
				x2 = sc.nextInt();
				
				System.out.println("Enter the value of y1: ");
				y1 = sc.nextInt();
				
				System.out.println("Enter the value of y2: ");
				y2 = sc.nextInt();
				
				//Defining the Length of line
				double length1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
				
				System.out.println("The length of line1 is: " + length1);
				
				//Taking Co-ordinates as a variables for Line 2
				int x3, y3, x4, y4;
				
				//Taking Inputs from users for line 2
				System.out.println("**Computation for line 2**");
				
				System.out.println("Enter the value of x3: ");
				x3 = sc.nextInt();
				
				System.out.println("Enter the value of x4: ");
				x4 = sc.nextInt();
				
				System.out.println("Enter the value of y3: ");
				y3 = sc.nextInt();
				
				System.out.println("Enter the value of y4: ");
				y4 = sc.nextInt();
				
				//Defining the Length of line
				double length2 = Math.sqrt((x4 - x3)^2 + (y4 - y3)^2);
				
				System.out.println("The length of line2 is: " + length2);
				
				 //comparing the lengths of lines 1 & 2
		        if (length1 == length2) {
		            System.out.println("The given lines are equals: ");
		        } else {
		            System.out.println("The given lines are not equal: ");
		        }
		
	}
	}
