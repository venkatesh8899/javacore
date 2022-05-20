package assignment;
	import java.util.Scanner;
	
public class GradeToMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Grade");
		grade=sc.next().charAt(0);
		if(grade == 'a') {
			System.out.println(+grade+" The mark is 90 to 100");
		}
		else if(grade== 'b') {
			System.out.println(+grade+" The mark is 60 to 89");
		}
		else if(grade=='c') {
			System.out.println(+grade+" The mark is 40 to 59");
		}
		else if(grade=='d') {
			System.out.println(+grade+" The mark is 0 to 39");
		}
		else {
			System.out.println(+grade+" The mark is invalid");
		}
		sc.close();
	}

}
