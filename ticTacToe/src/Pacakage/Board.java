package Pacakage;

public class Board {

	private String[][] Board;

	public Board() {
		Board = new String[3][3];
		initializeBoard(" __ ");

	}

	private void initializeBoard(String setCesll) {

		for (int i = 0; i < 3; i++) {
			Board[0][i] = setCesll;
			printBoard(0, i);
		}
		System.out.println('\n');
		for (int i = 0; i < 3; i++) {
			Board[1][i] = setCesll;
			printBoard(1, i);
		}
		System.out.println('\n');
		for (int i = 0; i < 3; i++) {
			Board[2][i] = setCesll;
			printBoard(2, i);
		}

	}

	public void setXO(int mainArray, int secondArray, String XO) {
		if (this.Board[mainArray][secondArray] == " __ ") {

			this.Board[mainArray][secondArray] = " " + XO + "  ";
			System.out.println('\n');
			System.out.println('\n');

			for (int i = 0; i < 3; i++) {
				printBoard(0, i);
			}
			System.out.println('\n');
			for (int i = 0; i < 3; i++) {
				printBoard(1, i);
			}
			System.out.println('\n');
			for (int i = 0; i < 3; i++) {
				printBoard(2, i);
			}
		} else {
			System.out.print('\n' + "The cell -" + mainArray + " " 
		+ secondArray + "- is already occupied!!");
		}

	}

	private void printBoard(int mainArray, int secondArray) {
		System.out.print(Board[mainArray][secondArray]);

	}

}