package is.hr.ticTacToe;

public class ticTacToe
{
	static board Board = new board();
	private char currentPlayer = 'X';

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

	static public void resetBoard()
	{
		Board.resetBoard();
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

	public static boolean checkWinner()
	{
		Board.getBoard();
		if( (Board.checkRows() != '-' ) || (Board.checkDiagnoally() != '-') || (Board.checkColumns() != '-') )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void printBoard()
	{
		Board.getBoard();
		System.out.println();
		for (int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(board[i][j]);
				if(j < 2)
				{
					System.out.print("|");
				}
				else
				{
					System.out.println();
				}
			}
		}
	}
	
}
