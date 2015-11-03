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
		char player;

		//Loop the game	until player wants to quit	
		do
		{
			//Loops until tie or gameover
			do
			{
				//check if turns is equal to 9, then it is a tie
				if(turns == 9)
				{
					//Print out tie msg
					System.out.print("It is a Tie!! Do you want to start a new game?");
					move = input.next();
					
					//If player wants to quit
					if((move == "n") || (move == "N"))
					{
						move = input.next();
						gameOver = true;
					}
					//else start a new game
					else
					{
						turns = 0;
						tic.resetBoard();
					}
				}
				//This is the real game check
				else
				{
					player = tic.getPlayer();
					//Print out msg for number
					System.out.println(ask4Number);
					System.out.println("It is player: " + player + " turn");
					//Take in number
					tic.printBoard();	
					move = input.next();

					//Send number to the game
					tic.input(Integer.parseInt(move));
					//Check if winner, returns false if there is no winner
					gameOver = tic.checkWinner();
					if(gameOver == true)
					{
						System.out.println("Player: " + player + " Has won");
					}
					else
					{
						//1 more turn over
						turns++;
					}

				}

			}while(gameOver != true);
			tic.printBoard();

		}while((move != "n") || (move != "N"));
				
	}

	
}
