package com.darshan.gamblingproject;

public class GamblingSimulationProject {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1;
	
	public static void gameStatus()
	{
		System.out.println("Satck Available :" +STACK_PER_DAY);
		System.out.println("Bet Per Game :" +BET_PER_GAME);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling Simulation Project Developed by Darshan Mistari");
	    gameStatus();
	}

}
