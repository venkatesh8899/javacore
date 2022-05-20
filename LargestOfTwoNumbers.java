package assignment;
import java.util.Scanner;
public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		x=sc.nextInt();
		System.out.println("Enter the second number");
		y=sc.nextInt();
		if(x>y) {
			System.out.println("Largest number is"+x);
			
		}
		
		else {
			System.out.println("Largest number is "+y);
		}
	}

}
