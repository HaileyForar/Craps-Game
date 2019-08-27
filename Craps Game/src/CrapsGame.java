import java.util.Scanner;

public class CrapsGame
	{

		public static void main(String[] args)
			{
				nameAndRules();
				randomNumberGenerator();
				initialRollAndResults();
				introIntoTheSecondPart();
				secondRandomNumberGenerator();
				playerRolling();
				winOrLose();

			}
		
		//test commit from home - didn't change anything
		
		//Global Method - available in all of the methods, not just local
		static String name;
		static int totalDice;
		static int dice1;
		static int dice2;
		static int totalDice1;
		static int dice3;
		static int dice4;
		
		
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
			int totalDice = dice1 + dice2;
		}	
		
		//first roll of the player and the results from that roll 
		public static void initialRollAndResults()
		{
			
			if(totalDice == 7 || totalDice == 11)
				{
					System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + totalDice +  "You win, " + name + "!");
				}
			
			else if(totalDice == 2 || totalDice == 12)
				{
					System.out.println("You rolled a " + dice1 + " and a" + dice2 + " for a total of " + totalDice + ". I'm sorry, you lost, " + name + "!" );
				}
			
			else
				{
					System.out.println("You rolled a " + dice1 + " and a " + dice2 + ". Your point is " + totalDice + ", " + name);

				}
			}
			
		//intro into the second part of the program and extended rules
		public static void introIntoTheSecondPart()
		{
			System.out.println("Alright " + name + ", now you are rolling for your point!");
			System.out.println("Note: if you roll a 7 then you automatically lose. If you roll your point, then you win!");
			System.out.println("Good Luck!");
		}
		
		//second number generator for the second round or rolls 
		public static void secondRandomNumberGenerator() 
		{
			int dice3 = (int) (Math.random() * 7 + 1);
			int dice4 = (int) (Math.random() * 7 + 1);
			int totalDice1 = dice3 + dice4;
		}
		
		//initiating the player's last rolls
		public static void playerRolling()
		{
			System.out.println("Your point is " + totalDice + ", and you rolled a " + dice3 + " and a " + dice4);
		}
		
		//code that will decide whether the player will win or lose
		public static void winOrLose()
		{
			if(totalDice1 == 7)
				{
					System.out.println("You rolled a 7, so you lose.");
				}
			
			else if(totalDice1 == totalDice)
				{
					System.out.println("You rolled your point, so you win!");
				}
		}

}
