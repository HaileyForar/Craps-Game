import java.util.Scanner;

public class CrapsGame
	{

		public static void main(String[] args)
			{
				part1();
				part2();

			}
		
		public static void part1()
		{
			System.out.println("What is your name?");
			Scanner userInput = new Scanner (System.in);
			String name = userInput.nextLine();
			System.out.println("Hello " + name + " Let's play a game of Craps.");
			
			int dice1 = (int) (Math.random() * 7 + 1);
			int dice2 = (int) (Math.random() * 7 + 1);
			int totalDice = dice1 + dice2;
			
			if(totalDice == 7 || totalDice == 11)
				{
					System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of 7. You win, " + name + "!");
				}
			
			else if(totalDice == 2 || totalDice == 12)
				{
					System.out.println("You rolled a " + dice1 + " and a" + dice2 + " for a total of " + totalDice + ". You win, " + name + "!" );
				}
		}
		
		public static void part2()
		{
			
		}

	}
