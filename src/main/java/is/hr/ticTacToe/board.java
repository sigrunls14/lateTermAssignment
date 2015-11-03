package is.hr.ticTacToe;

public class board
{
	private static char [][] board = new char [3][3];

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

	//Calls the setUpBoard to reset all places on board
	public void resetBoard()
	{
		setUpBoard();
	}

	// makes it possible for other classes to see the board
	public char[][] getBoard()
	{
		return board;
	}

	// Takes in the Currentplayer and move to place that player on square
	public static void addMove(Integer move, char currentPlayer)
	{
		// Takes in the integer move and finds a corresponding place on board
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

	//Huge check to see if place is occupied
	public static boolean isOccupied(Integer move)
	{

		boolean occupied = false;

		//Takes in an integer for a place and then checks if it has either X or O
		//if place is not - then it is occupied
		switch(move)
		{
			case 1: 
				if(board[0][0] != '-')
				{
					occupied = true;
				}
				break;
			case 2: 
				if(board[0][1] != '-')
				{
					occupied = true;
				}
				break;
			case 3: 
				if(board[0][2] != '-')
				{
					occupied = true;
				}
				break;
			case 4: 
				if(board[1][0] != '-')
				{
					occupied = true;
				}
				break;
			case 5: 
				if(board[1][1] != '-')
				{
					occupied = true;
				}
				break;
			case 6: 
				if(board[1][2] != '-')
				{
					occupied = true;
				}
				break;
			case 7: 
				if(board[2][0] != '-')
				{
					occupied = true;
				}
				break;
			case 8: 
				if(board[2][1] != '-')
				{
					occupied = true;
				}
				break;
			case 9: 
				if(board[2][2] != '-')
				{
					occupied = true;
				}
				break;
		}
		return occupied;
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
		//set checkWinner to -
		char checkWinner = '-';

		//checks if place 1,5 and 9 have -, if not then check if that row has the same player mark
		if((board[0][0] != '-') && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
		{
			//Changes the checkWinner to that player if 1,5 and 9 have the same mark
			checkWinner = board[0][0];
		}
		//Checks if place 3 has -, if not then check if place 3,5 and 7 have the same mark
		else if ( (board[0][2] != '-') && (board[0][2] == board[1][1]) && (board[1][1] == board[2][0])) 
		{
			//Changes the checkWinner to that player if 3,5,7 have the same mark
			checkWinner = board[0][2];
		}

		//Returns either - or X or O depending on status on winner 
		return checkWinner;
	}

	//Prints out the board on screen
	public void printBoard()
	{
		//X-axis
		for (int i = 0; i < 3; i++)
		{
			//Y-axis
			for(int j = 0; j < 3; j++)
			{
				System.out.print(board[i][j]);
				if(j < 2)
				{
					//Puts a pipe between squares to make the board pretty
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