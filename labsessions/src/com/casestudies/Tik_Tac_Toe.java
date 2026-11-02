package com.casestudies;

import java.util.Scanner;

public class Tik_Tac_Toe {

	static Scanner sc = new Scanner(System.in);
	static char[][] board = new char[3][3];

//	Method that gives empty board.
	public static void boardSetup() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = ' ';
			}
		}
	}

//	Method that displays board.
	public static void displayBoard() {
		System.out.println("================================");
		System.out.println("-------------");
		for (int i = 0; i < board.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
		System.out.println("================================");
	}

//	Method to check whether given cell is empty or not..!
	public static boolean checkFreeCell(int num) {
		boolean cellStatus = false;
		int count = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (count == num && board[i][j] == ' ') {
					cellStatus = true;
					break;
				}
				count++;
			}
		}
		return cellStatus;
	}

// Method that asks a player to enter choice!
	public static int getMove(String name1) {
		int choice;
		while (true) {
			System.out.println(name1 + " Enter your choice !");
			try {
				choice = Integer.parseInt(sc.nextLine().trim());
				if (choice >= 1 && choice <= 9) {
					if (checkFreeCell(choice)) {
						return choice;
					} else {
						System.out.println(choice + " Cell Is Already Marked!");
					}
				} else {
					System.out.println("Please Enter Numbers From 1-9 only");
				}
			} catch (NumberFormatException e) {
				System.out.println("Please Enter Valid Input Only!");
			}

		}
	}

//	Method that place his symbol in the board at the given position.
	public static void placeMove(int choice, char symbol) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				count++;
				if (count == choice) {
					board[i][j] = symbol;
					break;
				}

			}
		}
	}

	public static boolean checkWinnerMove() {

//		checking rows for mathcing symbols.
		for (int i = 0; i < 3; i++) {
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}

//		checking Columns for mathcing symbols.
		for (int i = 0; i < 3; i++) {
			if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return true;
			}
		}

//		Checking diagonals for matching symbols.
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
				|| board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		boolean status;
		do {

			System.out.println("================================");
			System.out.println("      |TIk_TAC_TOE GAME|");
			System.out.println("================================");
			System.out.println("1. Play With A Friend");
			System.out.println("2. Play With A Computer");
			System.out.println("3. Exit");
			System.out.println("================================");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				int playerChoice;

				sc.nextLine();
				System.out.println("Enter your name of the player1");
				String player1 = sc.nextLine();

				System.out.println("Enter your name of the player2");
				String player2 = sc.nextLine();

				boardSetup();
				displayBoard();
				boolean won = false;

				for (int move = 1; move <= 9; move++) {
					boolean player1Turn = (move % 2 == 1);
					String currentName = player1Turn ? player1 : player2;
					char symbol = player1Turn ? 'X' : 'O';

					playerChoice = getMove(currentName);
					placeMove(playerChoice, symbol);
					displayBoard();

					if (checkWinnerMove()) {
						System.out.println(currentName + " Congratulations !! You WON...!!!");
						won = true;
						break;
					}
				}

				if (!won) {
					System.out.println("Match Tie. Play Again!");
				}
			}
			case 2 -> {
				System.out.println("Game is under development!");
			}
			case 3 -> {
				System.out.println("You Exited From The GAME...!");
				return;
			}
			}
			System.out.println("Do You Want To Play Again? YES/No");

			String selectedChoice = sc.next();
			if (selectedChoice.equalsIgnoreCase("YES")) {
				status = true;
			} else {
				System.out.println("Thank You For Playing!!");
				status = false;
			}
			
		} while (status);

	}

}
