package com.snake.ladder;

import java.util.Scanner;

import com.snake.ladder.model.Entities;
import com.snake.ladder.service.PlaySnakeAndLadder;

// https://www.youtube.com/watch?v=na3DQv8ZAD8 
// https://workat.tech/machine-coding/practice/snake-and-ladder-problem-zgtac9lxwntg

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Entities entities = Entities.getInstance();

		int noOfSnakes = scan.nextInt();
		while (noOfSnakes > 0) {
			int startPosition = scan.nextInt();
			int endPosition = scan.nextInt();
			entities.setSnake(startPosition, endPosition);
			noOfSnakes--;
		}
		int noOfLadders = scan.nextInt();
		while (noOfLadders > 0) {
			int startPosition = scan.nextInt();
			int endPosition = scan.nextInt();
			entities.setLadder(startPosition, endPosition);
			noOfLadders--;
		}
		int noOfPlayers = scan.nextInt();
		int i = 0;
		while (noOfPlayers > 0) {
			String player = scan.next();
			entities.setPlayer(i++, player);
			noOfPlayers--;
		}
		PlaySnakeAndLadder playSnakeAndLadder = new PlaySnakeAndLadder(6);
		System.out.println(playSnakeAndLadder.PlayGame() + " wins the game");
	}
}

/*
9
62 5
33 6
49 9
88 16
41 20
56 53
98 64
93 73
95 75
8
2 37
27 46
10 32
51 68
61 79
65 84
71 91
81 100
2
Arijit
Arpan
Arijit rolled a 3 and moved from 0 to 3
Arpan rolled a 1 and moved from 0 to 1
Arijit rolled a 5 and moved from 3 to 8
Arpan rolled a 1 and moved from 1 to 37 after Ladder ride 
Arijit rolled a 1 and moved from 8 to 9
Arpan rolled a 6 and moved from 37 to 43
Arijit rolled a 1 and moved from 9 to 32 after Ladder ride 
Arpan rolled a 2 and moved from 43 to 45
Arijit rolled a 3 and moved from 32 to 35
Arpan rolled a 2 and moved from 45 to 47
Arijit rolled a 2 and moved from 35 to 37
Arpan rolled a 3 and moved from 47 to 50
Arijit rolled a 4 and moved from 37 to 20 after Snake dinner
Arpan rolled a 6 and moved from 50 to 53 after Snake dinner
Arijit rolled a 2 and moved from 20 to 22
Arpan rolled a 2 and moved from 53 to 55
Arijit rolled a 2 and moved from 22 to 24
Arpan rolled a 1 and moved from 55 to 53 after Snake dinner
Arijit rolled a 1 and moved from 24 to 25
Arpan rolled a 4 and moved from 53 to 57
Arijit rolled a 3 and moved from 25 to 28
Arpan rolled a 6 and moved from 57 to 63
Arijit rolled a 4 and moved from 28 to 32
Arpan rolled a 3 and moved from 63 to 66
Arijit rolled a 1 and moved from 32 to 6 after Snake dinner
Arpan rolled a 4 and moved from 66 to 70
Arijit rolled a 5 and moved from 6 to 11
Arpan rolled a 4 and moved from 70 to 74
Arijit rolled a 5 and moved from 11 to 16
Arpan rolled a 3 and moved from 74 to 77
Arijit rolled a 4 and moved from 16 to 20
Arpan rolled a 6 and moved from 77 to 83
Arijit rolled a 5 and moved from 20 to 25
Arpan rolled a 4 and moved from 83 to 87
Arijit rolled a 4 and moved from 25 to 29
Arpan rolled a 3 and moved from 87 to 90
Arijit rolled a 2 and moved from 29 to 31
Arpan rolled a 1 and moved from 90 to 91
Arijit rolled a 2 and moved from 31 to 6 after Snake dinner
Arpan rolled a 6 and moved from 91 to 97
Arijit rolled a 4 and moved from 6 to 32 after Ladder ride 
Arpan
Arijit rolled a 1 and moved from 32 to 6 after Snake dinner
Arpan rolled a 1 and moved from 97 to 64 after Snake dinner
Arijit rolled a 3 and moved from 6 to 9
Arpan rolled a 1 and moved from 64 to 84 after Ladder ride 
Arijit rolled a 1 and moved from 9 to 32 after Ladder ride 
Arpan rolled a 3 and moved from 84 to 87
Arijit rolled a 3 and moved from 32 to 35
Arpan rolled a 6 and moved from 87 to 73 after Snake dinner
Arijit rolled a 3 and moved from 35 to 38
Arpan rolled a 4 and moved from 73 to 77
Arijit rolled a 2 and moved from 38 to 40
Arpan rolled a 1 and moved from 77 to 78
Arijit rolled a 2 and moved from 40 to 42
Arpan rolled a 3 and moved from 78 to 100 after Ladder ride 
Arpan wins the game

*/
