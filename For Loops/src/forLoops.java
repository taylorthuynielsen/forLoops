import java.util.Scanner;

public class forLoops {

	public static void main(String[] args) 
	{
		//challengeOne();
		//challengeTwo();
		//challengeThree();
		//challengeFour();
		//challengeFive();
		challengeSix();

	}
	
	public static void challengeOne()
	{
		for (int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void challengeTwo()
	{
		for (int i=2; i<=10; i=i+2)
		{
			System.out.println(i + " I love Mullen!");
		}
	}
	
	public static void challengeThree()
	{
		for (int i=1; i<=5; i++)
		{
			System.out.print(i);
		}
	}
	
	public static void challengeFour()
	{
		for (int i = 10; i>=1; i--)
		{
			System.out.println(i);
		}
		System.out.println("Liftoff!");
	}
	
	public static void challengeFive()
	{
		for (int i=5; i<=100; i=i+5)
		{
			System.out.println(i);
		}
	
	}
	
	public static void challengeSix()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose a number to be your lowerbound.");
		int lowerbound = userInput.nextInt();
		System.out.println("Choose a number to ber you upperbound.");
		
		
	}

}
