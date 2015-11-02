package is.hr.ticTacToe;
import java.util.Scanner;


public class game
{
	public static void main()
	{
		ticTacToe tic = new ticTacToe();
		String ask4Number = "Enter a Number between 1 and 10 corresponding to a place on the board!";
		boolean gameOver = false;
		Integer turns = 0;
		char continueGame;

		//Do while loop
		if(turns == 9)
		{
			System.out.print("Tie, Do you want to start new game y/n?:");

		}
		else
		{
			System.out.println(ask4Number);	
			int move = move();
			tic.input(move);
			gameOver = tic.checkWinner();
			turns++;
		}
		
	}

	//Asks for move
 	public static Integer move()
 	{
 		//Integer move;
		Scanner input = new Scanner(System.in);
		Integer move = input.nextInt();

		return move;
 	}
}