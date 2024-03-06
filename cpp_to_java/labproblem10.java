package cpp_to_java;
import java.util.Scanner;

public class labproblem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Enter Exam Score: ");
			int examScore = sc.nextInt();
			System.out.print("Enter Student Roll No: ");
			int studNo = sc.nextInt();
			if (examScore < 0 || examScore >100) {
				System.out.println("Invalid Score (Must be between 0-100)");
				return;}
			 	char grade;
			if (examScore >= 90)
				 grade = 'A';
			else if(examScore >= 80)
				grade = 'B';
			else if (examScore >= 70)
				grade = 'C';
			else if (examScore >= 60)
				grade = 'D';
			else 
				grade = 'F';
			
			System.out.println("The Student Roll No." + studNo + " has Grade\s"+ "'"+grade+"'" +" in the exam.");
			
			
			
			
		}
	}

}
