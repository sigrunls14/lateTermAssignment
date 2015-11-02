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

	static public void addMove(Integer move, char currentPlayer)
	{
		switch(move)
		{
			case 1: board[0][0] = currentPlayer;
					break;
			case 2: board[0][1] = currentPlayer;
					break;
			case 3: board[0][2] = currentPlayer;
					break;
			case 4: board[1][0] = currentPlayer;
					break;
			case 5: board[1][1] = currentPlayer;
					break;
			case 6: board[1][2] = currentPlayer;
					break;
			case 7: board[2][0] = currentPlayer;
					break;
			case 8: board[2][1] = currentPlayer;
					break;
			case 9: board[2][2] = currentPlayer;
					break;
		}
	}
}