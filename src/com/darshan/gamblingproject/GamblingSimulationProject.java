package com.darshan.gamblingproject;
import java.util.Random;
public class GamblingSimulationProject {
	
	private static final int STACK_PER_DAY = 100;
	private static final int BET_PER_GAME = 1;
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	
	private static final int winAmount[]= new int[20];
	private static final int looseAmount[]= new int[20];
	
	private static int total_Win_Day = 0;
	private static int total_Loose_Day = 0;
	
	public static void gameStatus()
	{
		System.out.println("Satck Available :" +STACK_PER_DAY);
		System.out.println("Bet Per Game :" +BET_PER_GAME);
	}
	
	public static void gamePlay()
	{
		gameStatus();

		for(int i = 0; i < 20; i++ )
		{
			System.out.println("Day :"+(i+1));
		    int winStack = 0;
			int looseStack = 0;
			while(true)
			{
				Random random = new Random();
				int playStatus =random.nextInt(9)%2;
				
				if(playStatus == LOOSE)
				{
					looseStack = looseStack + 1;
				}
				else
				{
					winStack = winStack + 1;
				}
				if(looseStack == STACK_PER_DAY / 2)
				{
					total_Loose_Day = total_Loose_Day + 1;
					break;
				}
				if(winStack == STACK_PER_DAY / 2)
				{
					total_Win_Day = total_Win_Day + 1;
					break;
				}
			}
			winAmount[i] = winStack;
			looseAmount[i] = looseStack;
			
			System.out.println("Win Stack :" +winStack);
			System.out.println("Loose Stack :" +looseStack);
			System.out.println("------------------------------------");
		}
		System.out.println("Total Monthly Win Day :"+total_Win_Day);
		System.out.println("Total Monthly Loose Day :"+total_Loose_Day);
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling Simulation Project Developed by Darshan Mistari");
		
	    gamePlay();
	    
	}

}
