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
		if(( Board.checkRows() || Board.checkColumns(); || Board.checkDiagonally() ) != '-')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}