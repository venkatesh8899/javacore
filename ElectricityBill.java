package assignment;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		String customername;
		float billamount,surch;
		int units;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		customername=sc.nextLine();
		System.out.println("No of units");
		units=sc.nextInt();
		if(units <= 100)
		{
			billamount = units*2; 
		}
		else if(units>100 && units<=300)
		{
			billamount= 100*2.0f+(units-100)*3.0f;
		}
		
		else
		{
			billamount=100*2.0f +200*3.0f+(units-300)*5.0f;
			surch=(billamount*2.5f)/100;
			billamount=billamount+surch;
		}
		System.out.println("Customer Name : " +customername);
		System.out.println("No of units consumed : " +units);
		System.out.println("Bill amount is " +billamount);
		sc.close();

		// TODO Auto-generated method stub

	}

}
