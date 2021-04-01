package view;

import controlers.ControlersGame;

public class Main {
	
	public static void main(String[] args) {
		DrawPositionBoard drawBoard = new DrawPositionBoard();
		ControlersGame.getInstance().iniciarJogo();
	}
}
