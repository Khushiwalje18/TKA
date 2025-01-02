package com.tka.dec24;

public class Player {
	private int jerseyNo;
	private int runs;
	private int wckts;
	private String PName;

	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", runs=" + runs + ", wckts=" + wckts + ", PName=" + PName + "]";
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWckts() {
		return wckts;
	}

	public void setWckts(int wckts) {
		this.wckts = wckts;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public Player() {
		super();
	}

	public Player(int jerseyNo, int runs, int wckts, String pName) {
		super();
		this.jerseyNo = jerseyNo;
		this.runs = runs;
		this.wckts = wckts;
		PName = pName;
	}
}
