package com.tictactoe.validations;

import java.util.HashMap;

import com.tictactoe.model.Board;

public class GameValidator {

	Board board;
	HashMap<Integer, Boolean> playerCheck;

	public GameValidator(Board board, HashMap<Integer, Boolean> playerCheck) {
		this.board = board;
		this.playerCheck = playerCheck;
	}

	public boolean validateCoordinates(int x, int y) {
		return x < board.getBoard().length && y < board.getBoard().length && x >= 0 && y >= 0;
	}

	public boolean validateIsBoardPositionEmpty(int x, int y) {
		return board.getposition(x, y).equals("-");
	}

}
	