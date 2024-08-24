package tasks;

import java.util.Scanner;

public class StudentGradeCal {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of subjects:"); 
		Scanner sc = new Scanner(System.in);
		int totalSubjects = sc.nextInt();
		
		int i,totalMarks=0;
		int [] marks = new int[totalSubjects];	//marks array to store the marks obtained in each subject
		
		System.out.println("\nEnter the marks of those "+totalSubjects+" subjects"); // Assuming that there are 6 subjects and each subject is out of 100 marks
		
		for(i=0; i<totalSubjects; i++) {
			marks[i] = sc.nextInt();
		}		
		
		for(i=0; i<totalSubjects; i++) {
			totalMarks += marks[i]; 			//calculates the total marks
		}
		
		double percentage = totalMarks/totalSubjects; // calculates the average percentage
		
		System.out.println("\nTotal Marks: "+totalMarks+"\n");
		
		System.out.println("Average Percentage: "+percentage+"\n");
		
		if( percentage >= 85 )
			System.out.println("Your Grade is O");
		else if (percentage >= 70)
			System.out.println("Your Grade is A");
		else if (percentage >= 60)
			System.out.println("Your Grade is B");
		else if (percentage >= 50)
			System.out.println("Your Grade is C");
		else if (percentage >= 40)
			System.out.println("Your Grade is D");
		else
			System.out.println("Your Grade is F");			// F - Fail
		
		
	}

}
