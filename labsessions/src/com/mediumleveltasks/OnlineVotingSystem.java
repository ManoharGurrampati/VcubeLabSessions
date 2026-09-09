package com.mediumleveltasks;

import java.util.Scanner;

public class OnlineVotingSystem {

	static Scanner sc = new Scanner(System.in);

	public static void castYourVote() {
		System.out.println("| ====> Welcome to Online Voting System <==== |");
		System.out.println("\nEnter Your Age: ");
		byte age = sc.nextByte();
//		Age Validation
		if (age < 18) {
			System.out.println("Your Not Eligible For Voting. (UnderAge)");
		} else {
			System.out.println("Enter Your Gender: ");
			char gender = sc.next().toUpperCase().charAt(0);
//			Gender Validation
			if (gender == 'M' || gender == 'F') {
				System.out.println("Your Eligible To Cast Your Vote Now.");
				System.out.println("Enter Your VoterID: ");
				int voterID = sc.nextInt();
				boolean isVoted = true;
				do {
					System.out.println("-----> Candidates <------");
					System.out.println("1. Manohar G");
					System.out.println("2. Sai V");
					System.out.println("3. Yogesh B");
					System.out.println("4. Abhinav E");
					System.out.println("--------------------------");
					System.out.println("Select The Profile To Cast Your Vote !");
					int vote = sc.nextInt();
					switch (vote) {
					case 1 -> {
						System.out.println("Your Vote Is Captured For Manohar G | With VoterID " + voterID);
						isVoted = false;
					}

					case 2 -> {
						System.out.println("Your Vote Is Captured For Sai V | With VoterID " + voterID);
						isVoted = false;
					}
					case 3 -> {
						System.out.println("Your Vote Is Captured For Yogesh B | With VoterID " + voterID);
						isVoted = false;
					}
					case 4 -> {
						System.out.println("Your Vote Is Captured For Abhinav E | With VoterID " + voterID);
						isVoted = false;
					}
					default -> {
						if (vote <= 0) {
							System.out.println("Please Vote To A Proper Candidate !");
							isVoted = true;
						} else {
							System.out.println("Your Vote Is Captured For NOTA | With VoterID " + voterID);
							isVoted = false;
						}
					}
					}

				} while (isVoted);
				System.out.println("Thank You For Voting!!!");
			} else {
				System.out.println("Your Not Eligible For Voting. ( Gender Problem! )");
			}

		}
	}

	public static void main(String[] args) {
		castYourVote();
	}
}
