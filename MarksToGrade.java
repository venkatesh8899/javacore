package assignment;
 import java.util.Scanner;
 
public class MarksToGrade {

	public static void main(String[] args) {
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark");
		mark=sc.nextInt();
			if(mark>90 && mark<=100) {
				System.out.println(+mark+" the grade is A");
			}
			else if(mark>=60 && mark<=89) {
				System.out.println(+mark+" the grade is B");
			}
			else if(mark>=40 && mark<=59) {
				System.out.println(+mark+" the grade is C");
			}
			else if(mark>=0 && mark<=39) {
				System.out.println(+mark+" the grade is D");
			}
			else {
				System.out.println(" The given mark is invalid"); 
			}
			sc.close();
			
	}

}
