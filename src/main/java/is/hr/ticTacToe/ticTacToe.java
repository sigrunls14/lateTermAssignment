package is.hr.ticTacToe;

public class ticTacToe
{
	board Board = new board();
	private char currentPlayer = 'X';

	/*public ticTacToe()
	{
		board = Board.getBoard();
		//Board.setUpBoard();
	}*/


	public void input(Integer move)
	{

		if(Board.isOccupied(move) != true)
		{
			if(legalInput(move) == true)
			{	
				board.addMove(move, currentPlayer);
				currentPlayer = changePlayer(currentPlayer);
			}
			else
			{
				throw new RuntimeException("Illegal input");
			}
		}
		else
		{
			throw new RuntimeException("Occupied!!");
		}
		
	}

	static public char changePlayer(char playerMark)
	{
		if(playerMark == 'X')
		{
			return 'O';
		}
		else
		{
			return 'X';
		}
	}

	//Checks if input is an Integer between 0 and 10
	static public boolean legalInput(Integer move)
	{
		if((move > 0) && (move <= 10))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean checkWinner()
	{
		if( (Board.checkRows() != '-' ) || (Board.checkDiagnoally() != '-') || (Board.checkColumns() != '-') )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}