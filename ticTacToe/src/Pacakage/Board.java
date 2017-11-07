package Pacakage;

import java.util.Scanner;

/**
 * @author Motim class to create Board for TikTaktoe
 */
public class Board {

	private final String[][] Board;
	private String Player;
	private String validXO;
	private int[] length;
	private int[] width;
	private int conter;
	private int continueGame;{
		
	}

	public Board() {
		Board = new String[3][3];

	}

	public void startNewGame(String playerX, String playerO) {
		initialazationBoard(0);
		initialazationBoard(1);
		initialazationBoard(2);
		setXO(playerX, playerO);
	}

	private void initialazationBoard(int mainArray) {
		System.out.println('\n');
		for (int i = 0; i < Board.length; i++) {
			Board[mainArray][i] = " [ ] ";
			printBoard(mainArray, i);
		}

	}

	private void setXO(String playerX, String playerO) {
		this.continueGame = 0;
		int nextPlayer = 1;
		int mainArray = 0;
		int secondArray = 0;
		this.validXO = "";
		while (this.continueGame == 0) {
			if (nextPlayer == 1) {
				this.Player = playerX;
				this.validXO = "  X  ";

			} else {
				this.Player = playerO;
				this.validXO = "  O  ";
			}

			Scanner Scanner = new Scanner(System.in);
			System.out.print('\n');
			System.out.print('\n');
			System.out.print("Hi " + this.Player + " Select a cell (Example: 11 for The left corner) ");
			int cell = Scanner.nextInt();
			int indec = 0;
			while (indec == 0) {
				int tempCell = cell % 10;
				secondArray = tempCell - 1;
				cell = cell / 10;
				mainArray = cell - 1;
				indec++;
			}
			if (checkIfCellvalid(mainArray, secondArray)) {
				Board[mainArray][secondArray] = this.validXO;
				checkWinner();
				showBoard();

			} else {
				System.out.println('\n' + "The cell you selected is not valid!!");
				continue;
			}
			if (nextPlayer == 1) {
				nextPlayer++;
			} else {
				nextPlayer = 1;
			}

		}

	}

	private void showBoard() {
		System.out.println('\n');
		setLengthWidth();
		for (int LengthWidth : length) {
			System.out.print("     " + LengthWidth);
		}
		System.out.print('\n');

		System.out.print("  " + this.width[0]);
		for (int i = 0; i < Board.length; i++) {
			printBoard(0, i);

		}
		System.out.print('\n');
		System.out.print('\n');
		System.out.print("  " + this.width[1]);

		for (int i = 0; i < Board.length; i++) {
			printBoard(1, i);

		}
		System.out.print('\n');
		System.out.print('\n');
		System.out.print("  " + this.width[2]);
		for (int i = 0; i < Board.length; i++) {
			printBoard(2, i);

		}
	}

	private void checkWinner() {

		this.conter = 0;

		indexMainArray(0);
		indexMainArray(1);
		indexMainArray(2);
		indexSecondArray(0);
		indexSecondArray(1);
		indexSecondArray(2);

		for (int i = 0; i < 3; i++) {
			if (Board[i][i] == this.validXO) {
				this.conter++;
			} else {
				this.conter = 0;
			}
		}

		Ccounter(this.conter);
		int j = 0;
		for (int i = 0; i < Board.length; i++) {
			if (Board[j][i] == this.validXO) {
				j++;

				this.conter++;

			} else {
				this.conter = 0;
			}
		}

		Ccounter(this.conter);

		int i = 0;
		while (i == 0) {
			if (Board[0][2] == this.validXO && Board[1][1] == this.validXO && Board[2][0] == this.validXO) {
				this.conter = 3;
				System.out.println(this.conter);
				i++;

			} else {
				this.conter = 0;
				i++;

			}
		}
		Ccounter(this.conter);

	}

	private void indexMainArray(int indexMainArray) {
		this.conter = 0;
		for (int i = 0; i < 3; i++) {
			if (Board[indexMainArray][i] == this.validXO) {
				this.conter++;

			} else {
				this.conter = 0;
			}

		}
		Ccounter(this.conter);

	}

	private void indexSecondArray(int indexSecondArray) {
		this.conter = 0;
		for (int i = 0; i < 3; i++) {
			if (Board[i][indexSecondArray] == this.validXO) {
				this.conter++;

			} else {
				this.conter = 0;
			}

		}
		Ccounter(this.conter);

	}

	private void setLengthWidth() {
		this.length = new int[3];
		this.width = new int[3];
		for (int i = 0; i < 3; i++) {
			this.length[i] = i + 1;
			this.width[i] = i + 1;
		}

	}

	private void Ccounter(int conter) {

		if (conter == 3 || conter > 6) {

			System.out.println("Congratulations the player " + this.Player + " won");
			showBoard();
			this.continueGame = 1;
			
		} else {
			;
		}

	}

	private boolean checkIfCellvalid(int mainArray, int secondArray) {

		if (mainArray >= 3 || secondArray >= 3) {
			return false;
		}

		if (Board[mainArray][secondArray] != " [ ] ") {
			return false;
		} else {
			return true;
		}

	}

	private void printBoard(int mainArray, int secondArray) {
		System.out.print(Board[mainArray][secondArray] + " ");

	}

}