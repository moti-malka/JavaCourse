package Pacakage;

import java.util.Scanner;

public class players {

	private String playername;

	/*
	 * this constructor create new player get String player name
	 */
	public players(String playername) {
		this.playername = playername;
		
	}
	
	public String ToString() {
		return this.playername;
		
	}

}
