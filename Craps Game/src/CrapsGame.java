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
			
			int randomRoll = (int) (Math.random() * 7 + 1);
		}
		
		public static void part2()
		{
			
		}

	}
