import java.util.Scanner;
import javax.swing.text.AbstractDocument.LeafElement;

public class Palindrome {

	public static void main(String[] args) {

		
		
		// get input from user
		Scanner getInputFromUser = new Scanner(System.in);
		System.out.print("Enter number:");

		// Initializing the variable to getInputFromUser
		int numberFromUser = getInputFromUser.nextInt();

		// Sets a maximum value
		int max = 1000000000;

		// Sets a minimum value
		int min = 0;

		// length of the number
		int LengthOfNumber = 1;

		// check if the number is correct
		for (int i = 0; i == 0; i++) {
			if (numberFromUser > max || numberFromUser < min) {
				System.out.print("Error: Please enter a number between 0 - 1,000,000,000 :");
				numberFromUser = getInputFromUser.nextInt();
				i--;

			}

		}

		// Calculates how many numbers there are in numberFromUser
		int temp = numberFromUser;
		int tempNumber = numberFromUser;
		for (int i = 0; tempNumber > 0; i++) {

			temp = tempNumber / 10;
			tempNumber = temp;
			LengthOfNumber = i + 1;
		}
        
		// set array for Length of number
		int[] Palindrome = new int[LengthOfNumber];
        tempNumber = numberFromUser;
        temp = 0;
        int result = 0;

        // loop to get "back number" of number 
		for (int i = 0; i < Palindrome.length; i++) {

			temp = tempNumber % 10;
			Palindrome[i] = temp;
			tempNumber = tempNumber / 10;
			result = 10 * result + Palindrome[i];

		}

		if (result == numberFromUser) {
			System.out.println("size = " + LengthOfNumber);
		} else {
			System.out.println("The number you entered is not Palindrome!");
			System.exit(0);

		}

		// check if Length Of Number double or not
		int firstPart = LengthOfNumber;
        if (firstPart % 2 != 0) {

			firstPart = (LengthOfNumber / 2) + 1;
		}

		else {
			firstPart = (LengthOfNumber / 2);
		}

        //loop to get the first Part
		for (int i = 0; i < firstPart; i++) {
			if (i == 0)
				System.out.print("First part = " + Palindrome[i] + "  ");

			else {
				System.out.print(Palindrome[i] + "  ");

			}

		}

		int secondPart = firstPart;
		//loop to get the second Part
		for (int i = secondPart; i != 0; i--) {
			if (i == secondPart) {
				System.out.print('\n' + "secondPart = " + Palindrome[i - 1] + "  ");
			} else {
				System.out.print(Palindrome[i - 1] + "  ");
			}
		}

	}

}
