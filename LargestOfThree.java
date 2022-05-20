package assignment;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		System.out.println("Enter the second number");
		z=sc.nextInt();
		if(x>y && x>z) {
			System.out.println("Largest number is"+x);
			
		}
		else if (y>z) {
			System.out.println("Largest number is"+y);
		}
		else {
			System.out.println("Largest number is "+z);
		}
		sc.close();
		}
}
