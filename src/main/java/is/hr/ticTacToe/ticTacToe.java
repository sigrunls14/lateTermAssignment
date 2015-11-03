package is.hr.ticTacToe;

public class ticTacToe
{
	static board Board = new board();
	private char currentPlayer = 'X';

	//Validates the input and puts it on the board
	public void input(Integer move)
	{
		//Check if place is occupied
		if(Board.isOccupied(move) != true)
		{
			//Check if the input is between 1 and 10 and then add it to the board
			if(legalInput(move) == true)
			{	
				board.addMove(move, currentPlayer);
				currentPlayer = changePlayer(currentPlayer);
			}
			//Throws an error if it is illegal input
			else
			{
				throw new RuntimeException("Illegal input");
			}
		}
		//More errors for occupied
		else
		{
			throw new RuntimeException("Occupied!!");
		}
		
	}

	//Calls the function resetBoard from Board class
	static public void resetBoard()
	{
		Board.resetBoard();
	}
	//Changes the player
	static public char changePlayer(char playerMark)
	{
		//If X then it is player O's turn
		if(playerMark == 'X')
		{
			return 'O';
		}
		//Otherwise it is Player X's turn
		else
		{
			return 'X';
		}
	}

	//Checks if input is an Integer between 0 and 10
	static public boolean legalInput(Integer move)
	{
		if((move >= 1) && (move <= 10))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//Checks if there is any winner on rows, columns or diagnoally
	public static boolean checkWinner()
	{
		//Fetches the board
		Board.getBoard();
		//Checks if there is any place where X or O is a winner
		if( (Board.checkRows() != '-' ) || (Board.checkDiagnoally() != '-') || (Board.checkColumns() != '-') )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// Prints the board on screen
	public void printBoard()
	{
		//Fetches the printBoard function from board class
		Board.printBoard();
		
	}
	
}
