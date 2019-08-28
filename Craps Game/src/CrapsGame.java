import java.util.Scanner;

public class CrapsGame
	{

		public static void main(String[] args)
			{
				nameAndRules();
				randomNumberGenerator();
				introIntoTheSecondPart();
				secondRandomNumberGenerator();
				
			}
		
		//test commit from home - didn't change anything
		
		//Global Method - available in all of the methods, not just local
		static int totalDice;
		static int totalDice1;
		static int point;
		
		//name of the player and the rules of the game
		public static void nameAndRules()
		{
			System.out.println("What is your name?");
			Scanner userInput = new Scanner (System.in);
			String name = userInput.nextLine();
			System.out.println("Hello " + name + " Let's play a game of Craps.");
			System.out.println("The rules are simple...In the first part, if you roll a 7 or an 11 then you win automatically. If you roll a 2 or a 12, then you lose.");
			System.out.println("If you roll anything else, then that becomes your point that you will keep rolling for.");
		}	
		
		//random number generator for rolling the dice
		public static void randomNumberGenerator()
		{
			int dice1 = (int) (Math.random() * 7 + 1);
			int dice2 = (int) (Math.random() * 7 + 1);
			int totalDice = 0;
			totalDice = dice1 + dice2;
			point = totalDice;
			
			if(totalDice == 7 || totalDice == 11)
				{
					System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice +  " You win!");
				}
			
			else if(totalDice == 2 || totalDice == 12)
				{
					System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice + ". I'm sorry, you lost.");
				}
			
			else
				{
					System.out.println("You rolled a " + dice1 + " and a " + dice2 + ". Your point is " + totalDice);

				}
			
			
	   }
			
		//intro into the second part of the program and extended rules
		public static void introIntoTheSecondPart()
		{
			System.out.println("Alright, now you are rolling for your point!");
			System.out.println("Note: if you roll a 7 then you automatically lose. If you roll your point, then you win!");
			System.out.println("Good Luck!");
		}
		
		//second number generator for the second round or rolls 
		public static void secondRandomNumberGenerator() 
		{
			
			int dice3 = (int) (Math.random() * 7 + 1);
			int dice4 = (int) (Math.random() * 7 + 1);
			int totalDice1 = 0;
			totalDice1 = dice3 + dice4;

			System.out.println("Your point is " + point + ", and you rolled a " + dice3 + " and a " + dice4);
	        	
			if(totalDice1 == 7)
				{
					System.out.println("You rolled a 7, so you lose.");
				}
			
			else if(totalDice1 == point)
				{
					System.out.println("You rolled your point, so you win!");
				}
			
	       }
	        

	}
		

