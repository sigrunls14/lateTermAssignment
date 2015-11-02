package is.hr.ticTacToe;
import java.util.Scanner;

public class game
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ticTacToe tic = new ticTacToe();
		String ask4Number = "Enter a Number between 1 and 10 corresponding to a place on the board!";
		boolean gameOver = false;
		Integer turns = 0;
		String move;

		do
		{
			if(turns == 9)
			{
				System.out.print("It is a Tie!!");
				move = input.next();
				if((move == "n") || (move == "N"))
				{
					move = input.next();
					gameOver = true;
				}
				else
				{
					turns = 0;
					tic.resetBoard();
				}
			}
			else
			{
				System.out.println(ask4Number);	
				move = input.next();
				tic.input(Integer.parseInt(move));
				gameOver = tic.checkWinner();
				turns++;
			}
		}while(gameOver != true);		
	}

	/*public static String continueGame()
	{
		String reply = input.nextLine();

		return reply;
	}

	//Asks for move
 	public static Integer move()
 	{
 		//Integer move;
		Integer move = input.nextInt();

		return move;
 	}*/
}