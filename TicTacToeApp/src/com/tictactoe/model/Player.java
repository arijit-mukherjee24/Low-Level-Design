package com.tictactoe.model;

public class Player {

	private String playerName;
	private int id;
	private String symbol;

	public Player(String playerName, int id, String symbol) {
		this.id = id;
		this.playerName = playerName;
		this.symbol = symbol;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
