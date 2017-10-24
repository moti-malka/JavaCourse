import java.util.Scanner;

public class GradesCalculator {

	public static void main(String[] args) {

		// set Scanner for get input from user
		Scanner inputFromUser = new Scanner(System.in);
		
		// ask user for numbers of students
		System.out.print("Enter the number of students: ");
		byte allStudents = inputFromUser.nextByte();
		
		// Set Array For Student
		byte[] sumStudent = new byte[allStudents];
		
		// Set Location for count student
		byte Location = 1;
		
		// set variable for Outstanding student
		byte Outstandingstudent = sumStudent[0];
		
		// set variable for topGrades student
		byte topGrades = sumStudent[0];
		
		// loop for set Grade to all students
		for (byte i = 0; i < sumStudent.length; i++) {
			
			// ask user to enter Grade
			System.out.print("Enter Grades for student #" + Location++ + ": ");
            byte Grades = inputFromUser.nextByte();
			
			// Check if Grade big proper
			if (Grades < 0 || Grades > 100) {

				// if Grade not proper, ask user to enter Grade again
				System.out.print("Error: Enter a range of numbers between 0-100\n");
             	// The value of i goes down in 1
				i--;
             	// The value of Location goes down in 1
				Location--;

			} else {
				// set sumStudent to Grades
				sumStudent[i] = Grades;
				
				if (sumStudent[i] > topGrades) {
					
					topGrades = sumStudent[i];
					Outstandingstudent = (byte) (i + 1);
				}

			}

		}

		// set variable for failed student
		byte studentfailed = sumStudent[0];

		// set variable for min Grades
		byte minGrades = sumStudent[0];

		// loop to Check the low Grades
		for (byte i = 0; i < sumStudent.length; i++) {

			if (i != 0) {
				// System.out.println(i);
				if (sumStudent[i] < minGrades) {
					minGrades = sumStudent[i];
					studentfailed = i;
				} else {
					;
				}
			}

			else {
				
				minGrades = sumStudent[i];
				studentfailed = i;
			}

		}

		double sum = 0;
		double average = 0;

		// loop to count the all Grades and Department all student
		for (int number : sumStudent) {
			sum = (double) (sum + number);
			average = (double) (sum / allStudents);
		}

		// print to user The average score
		System.out.println("\nThe grade of all students is: " + average + '\n');

		// print to user the high grade
		System.out.println(
				"the student number# " + Outstandingstudent + " got the highest grade and it's: " + topGrades + '\n');

		// print to user the low grade
		System.out.println(
				"the student number# " + (studentfailed + 1) + " got the low grade and it's: " + minGrades + '\n');
	}
}