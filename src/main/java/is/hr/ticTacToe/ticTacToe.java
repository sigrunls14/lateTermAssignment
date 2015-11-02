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
			throw new RuntimeException("this place is occupied!!");
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

	private boolean checkRows()
	{
		if( Board.checkRows() != '-')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean checkColumns()
	{
		if( Board.checkColumns() != '-')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean checkDiagnoally()
	{
		if( Board.checkDiagnoally() != '-')
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
		if( (checkRows() == true ) || (checkDiagnoally() == true) || (checkColumns() == true) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}