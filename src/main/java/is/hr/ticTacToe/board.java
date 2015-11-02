package is.hr.ticTacToe;

public class board
{
	private static char [][] board;

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

	public static void addMove(Integer move, char currentPlayer)
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

	//Checks the rows on the board and returns either - if no winner, X if X won a row and O if O won a row
	public static char checkRows()
	{
		char checkWinner = '-';

		for(int i = 0; i < 3; i++)
		{
			//Checks if the first column in the row is either X or O, then compares the row to check if either of them won
			if((board[i][0] != '-') && (board[i][0] == board[i][1]) && (board[i][1] == board[i][2]))
			{
				checkWinner = board[i][0];
			}
		}	

		return checkWinner;
	}

	// Same as checkRows function, returns either -, X or O
	public static  char checkColumns()
	{
		char checkWinner = '-';

		for(int i = 0; i < 3; i++)
		{
			//Checks if the first column in the row is either X or O, then compares the row to check if either of them won
			if((board[0][i] != '-') && (board[0][i] == board[1][i]) && (board[1][i] == board[2][i]))
			{
				checkWinner = board[0][i];
			}
		}	

		return checkWinner;
	}


	public static char checkDiagnoally()
	{
		char checkWinner = '-';

		if((board[0][0] != '-') && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
		{
			checkWinner = board[0][0];
		}
		else if ( (board[0][2] != '-') && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0])) 
		{
			checkWinner = board[0][2];
		}

		return checkWinner;
	}
}