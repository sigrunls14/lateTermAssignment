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
		char cont;

		//Do while loop
		if(turns == 9)
		{
			System.out.print("Tie, Do you want to start new game y/n?:");
			cont = continueGame();
			if((cont == 'n') || (cont == 'N'))
			{
				gameOver = true;
			}
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

	public static char continueGame()
	{
		Scanner input = new Scanner(System.in);
		char reply = input.next().charAt(0);

		return reply;
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