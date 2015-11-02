package is.hr.ticTacToe;
import java.util.Scanner;


public class game
{
	ticTacToe tic = new ticTacToe();
	String ask4Number = "Enter a Number between 1 and 10 corresponding to a place on the board!";

	//System.out();
	
	int move = move();


	//Asks for move
 	public Integer move()
 	{
 		//Integer move;
		Scanner input = new Scanner(System.in);
		Integer move = input.nextInt();

		return move;
 	}
}