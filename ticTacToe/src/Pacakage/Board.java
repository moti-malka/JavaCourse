package Pacakage;

import java.util.Scanner;

/**
 * @author Motim class to create Board for TikTaktoe
 */
public class Board {

	private String[][] Board;
	private String Player;
	private String validXO;

	public Board() {
		Board = new String[3][3];

	}

	public void startNewGame(String playerX, String playerO) {
		System.out.println('\n');
		for (int i = 0; i < 3; i++) {
			Board[0][i] = " [ ] ";
			printBoard(0, i);
		}
		System.out.println('\n');
		for (int i = 0; i < 3; i++) {
			Board[1][i] = " [ ] ";
			printBoard(1, i);
		}
		System.out.println('\n');
		for (int i = 0; i < 3; i++) {
			Board[2][i] = " [ ] ";
			printBoard(2, i);
		}
		setXO(playerX, playerO);

	}

	private void setXO(String playerX, String playerO) {
		int continueGame = 0;
		int nextPlayer = 1;
		int mainArray = 0;
		int secondArray = 0;
		this.validXO = "";
		while (continueGame == 0) {
			if (nextPlayer == 1) {
				this.Player = playerX;
				this.validXO = " x ";

			} else {
				this.Player = playerO;
				this.validXO = " o ";
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

			} else {
				System.out.println('\n' + "The cell you selected is not valid!!");
			}

		}

	}

	private void checkWinner() {

		int conter = 0;
		for (int i = 0; i < 3; i++) {
			if (Board[0][i] == this.validXO) {
				conter++;
				if (conter == 3) {
					System.out.println("Congratulations the player " + this.Player + " won");
					System.exit(0);
				}

			} else {
				conter = 0;

			}

		}
		for (int i = 0; i < 3; i++) {
			if (Board[1][i] == this.validXO) {
				conter++;
				if (conter == 3) {
					System.out.println("Congratulations the player " + this.Player + " won");
					System.exit(0);
				} else {
					;
				}

			} else {
				conter = 0;

			}
		}
		for (int i = 0; i < 3; i++) {
			if (Board[2][i] == this.validXO) {
				conter++;
				if (conter == 3) {
					System.out.println("Congratulations the player " + this.Player + " won");
					System.exit(0);
				} else {
					;
				}

			} else {
				conter = 0;

			}
		}
		for (int i = 0; i < 3; i++) {
			if (Board[i][i] == this.validXO) {
				conter++;
				if (conter == 3) {
					System.out.println("Congratulations the player " + this.Player + " won");
					System.exit(0);

				}
			}

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
		System.out.print(Board[mainArray][secondArray]);

	}

}