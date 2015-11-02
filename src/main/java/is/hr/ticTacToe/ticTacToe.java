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

	//Checks the rows on the board and returns either - if no winner, X if X won a row and O if O won a row
	static public char checkRows(char [][] board)
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
	static public char checkColumns(char [][] board)
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

	// Same as checkColumns and checkRows function, returns either -, X or O
	static public char checkDiagonally(char [][] board)
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

	public boolean checkWinner()
	{
		if((checkRows() || checkColumns() || iacheckDiagonally()) != '-')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}