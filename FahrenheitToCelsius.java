package assignment;
import java.util.Scanner;
public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
float fahrenheit,celsius;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Fahrenheit value");
fahrenheit=sc.nextFloat();
celsius=((fahrenheit-32)*0.5553f);
System.out.println(+fahrenheit+" Degree in fahrenheit is converted to "+celsius+" in celsius");
sc.close();

	}

}
