package is.hr.ticTacToe;

public class board
{
	private char [][] board;

	public board()
	{
		setUpBoard();
	}


	private void setUpBoard()
	{
		// looping through X-axis
		for(int i = 0; i < 3; i++)
		{
			// Looping through Y-axis
			for(int j = 0; j < 3; j++)
			{
				board[i][j] = '-';
			}
		}
	}

	public char[][] getBoard()
	{
		return board;
	}
}