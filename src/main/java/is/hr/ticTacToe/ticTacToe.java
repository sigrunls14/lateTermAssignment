package is.hr.ticTacToe;

public class ticTacToe
{
	private char [][] board;
	private char currentPlayer;

	public ticTacToe()
	{
		board = new char [3][3];
		currentPlayer = 'x';
		setUpBoard();
	}	
}

public void setUpBoard()
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

