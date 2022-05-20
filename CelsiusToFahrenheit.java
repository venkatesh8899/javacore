package assignment;
 	import java.util.Scanner;
 	
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float celsius,fahrenheit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Celsius value");
		celsius=sc.nextFloat();
		fahrenheit=((celsius*1.8f)+32);
		System.out.println(+fahrenheit+" Degree in Celsius is converted to "+celsius+" in Fahrenheit");
		sc.close();
	}

}
