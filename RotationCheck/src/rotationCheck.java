	import java.security.AllPermission;
	import java.util.Scanner;
	
	public class rotationCheck {
	
		public static void main(String[] args) {
	
			Scanner getInputFromUser = new Scanner(System.in);
	
			int firstNumber = 0;
	
			int secondNumber = 0;
	
			int getNumber = 1;
	
			long maxCanGet = 1000000000;
	
			for (int i = 0; i < 2; i++) {
				System.out.print("Enter number #" + getNumber + ": ");
				getNumber++;
	
				if (i == 0) {
					firstNumber = getInputFromUser.nextInt();
					while (firstNumber > maxCanGet) {
						System.out.print("The range of number you can use is 0 - 1,000,000,000" + ":");
						firstNumber = getInputFromUser.nextInt();
					}
				} else if (i > 0) {
					secondNumber = getInputFromUser.nextInt();
					while (secondNumber > maxCanGet || firstNumber == secondNumber) {
						System.out.print("The numbers your enter it is not corrent, please enter again : ");
						secondNumber = getInputFromUser.nextInt();
					}
				} else {
					secondNumber = getInputFromUser.nextInt();
	
				}
	
			}
	
			int indexLengthFirst = 0;
	
			int tempFrirsNumber = firstNumber;
	
			while (tempFrirsNumber != 0) {
				tempFrirsNumber = tempFrirsNumber / 10;
				indexLengthFirst++;
			}
	
			int[] firstNumberArray = new int[indexLengthFirst];
	
			tempFrirsNumber = firstNumber;
	
			int indexFirst = indexLengthFirst - 1;
	
			for (int i = 0; i < firstNumberArray.length; i++) {
				firstNumberArray[indexFirst] = tempFrirsNumber % 10;
				tempFrirsNumber = tempFrirsNumber / 10;
				indexFirst = indexFirst - 1;
	
			}
	
			int indexLengthscond = 0;
			int tempScondNumber = secondNumber;
			while (tempScondNumber != 0) {
				tempScondNumber = tempScondNumber / 10;
				indexLengthscond++;
			}
	
			if (indexLengthFirst != indexLengthscond) {
				System.out.print("You must enter numbers at the same length");
				System.exit(0);
	
			}
	
			int[] secondNumberArray = new int[indexLengthscond];
	
			int tempSecondNumber = secondNumber;
	
			int indexSecond = indexLengthscond - 1;
	
			for (int i = 0; i < secondNumberArray.length; i++) {
				secondNumberArray[indexSecond] = tempSecondNumber % 10;
				tempSecondNumber = tempSecondNumber / 10;
				indexSecond = indexSecond - 1;
	
			}
	
			int tempNumber = 0;
			int position = firstNumberArray.length - 1;
			int tempBeforeLast = firstNumberArray.length - 1;
			int tempnumber2 = 0;
	
			int tempindex = 0;
			int count = 0;
			// System.out.println(firstNumberArray[tempBeforeLast]);
	
			for (int i = 0; i < firstNumberArray.length; i++) {
	
				if (i == 0) {
					// System.out.println(i);
					tempNumber = firstNumberArray[i];
					firstNumberArray[i] = firstNumberArray[position];
	
				}
	
				else if (i == (position)) {
					firstNumberArray[i] = tempBeforeLast;
					for (int index = 0; index < firstNumberArray.length; index++) {
	
						if (firstNumberArray[index] == secondNumberArray[index]) {
							count++;
	
							if (count == position) {
								i = count;
								count = count - 1;
	
								System.out.println("The number " + firstNumber + " can be rotated " + count
										+ " time(s) to get the " + secondNumber);
								System.exit(0);
							} else {
								i--;
							}
	
						}
	
					}
				} else {
					if (tempnumber2 == 0) {
						tempnumber2 = firstNumberArray[i];
						firstNumberArray[i] = tempNumber;
						firstNumberArray[i + 1] = tempnumber2;
						tempnumber2++;
	
					}
	
				}
	
			}
			System.out.println("We cannot get from " + firstNumber + " to " + secondNumber
					+ " by performing any number of rotations.");
		}
	}