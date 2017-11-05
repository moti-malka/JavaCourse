package Pacakage;

import java.util.Scanner;

public class AppTicTac {

	public static void main(String[] args) {

        //create new user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hello, Enter name for X player: ");
		players X = new players(scanner.nextLine());
		System.out.print("Hello, Enter name for O player: ");
		players O = new players(scanner.nextLine());
		String playerX = X.ToString();
		String playerO = O.ToString();
		
		

		Board TicTacBoard = new Board();
		TicTacBoard.startNewGame(playerX, playerO);

	}

}