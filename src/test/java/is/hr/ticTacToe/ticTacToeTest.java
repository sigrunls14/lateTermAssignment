package is.hr.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ticTacToeTest
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.hr.ticTacToe.ticTacToeTest");
	}

	@Test
	public void testLegalInput()
	{
		assertEquals(false, ticTacToe.legalInput(10));
	}

	/*
	@Test
	public void testIsOccupied()
	{
		try
		{
			assertEquals(0, ticTacToe.game(3));
		}
		catch(Exception e)
		{
			assertEquals("Tile is occupied please pick a different tile", e.getMessage());
		}
	}

	@Test
	public void testWantsToQuit()
	{
		assertEquals(false, ticTacToe.game("q"));
	}

	@Test
	public void testIsTie()
	{
		try
		{
			assertEquals(false, ticTacToe.isTie());
		}
		catch
		{
			assertEquals("Tie", e.getMessage());
		}
	}

	@Test
	public void testCorrectPosition()
	{
		assertEquals("")
	}*/


	@Test
	public void testChangePlayer()
	{
		assertEquals("O", ticTacToe.changePlayer());
	}

	@Test
	public void testXWonRows()
	{

		char[][] board = new char[3][3];

		// looping through X-axis
		for(int i = 0; i < 3; i++)
		{
			// Looping through Y-axis
			for(int j = 0; j < 3; j++)
			{
				board[i][j] = '-';
			}
		}	

		board[0][0] = 'X';
		board[0][1] = 'X'; 
		board[0][2] = 'X';

		assertEquals('X', ticTacToe.checkRows(board));
	}

	@Test
	public void testXWonColumns()
	{
		char[][] board = new char[3][3];
		
		// looping through X-axis
		for(int i = 0; i < 3; i++)
		{
			// Looping through Y-axis
			for(int j = 0; j < 3; j++)
			{
				board[i][j] = '-';
			}
		}	

		board[0][0] = 'X';
		board[1][0] = 'X'; 
		board[2][0] = 'X';

		assertEquals('X', ticTacToe.checkColumns(board));
	}

	@Test
	public void testXWonDiagonally()
	{
		char[][] board = new char[3][3];
		
		// looping through X-axis
		for(Integer i = 0; i < 3; i++)
		{
			// Looping through Y-axis
			for(Integer j = 0; j < 3; j++)
			{
				board[i][j] = '-' ;
			}
		}	

		board[0][0] = 'X';
		board[1][1] = 'X'; 
		board[2][2] = 'X';

		assertEquals('X', ticTacToe.checkDiagonally(board));

	}

	@Test
	public void testOWonRows()
	{
		char[][] board = new char[3][3];

		// looping through X-axis
		for(int i = 0; i < 3; i++)
		{
			// Looping through Y-axis
			for(int j = 0; j < 3; j++)
			{
				board[i][j] = '-';
			}
		}	

		board[2][0] = 'O';
		board[2][1] = 'O'; 
		board[2][2] = 'O';

		assertEquals('O', ticTacToe.checkRows(board));
	}

	@Test
	public void testOWonColumns()
	{
		char[][] board = new char[3][3];
		
		// looping through X-axis
		for(int i = 0; i < 3; i++)
		{
			// Looping through Y-axis
			for(int j = 0; j < 3; j++)
			{
				board[i][j] = '-';
			}
		}	

		board[0][1] = 'O';
		board[1][1] = 'O'; 
		board[2][1] = 'O';

		assertEquals('O', ticTacToe.checkColumns(board));
	}

	@Test
	public void testOWonDiagonally()
	{
		char[][] board = new char[3][3];
		
		// looping through X-axis
		for(Integer i = 0; i < 3; i++)
		{
			// Looping through Y-axis
			for(Integer j = 0; j < 3; j++)
			{
				board[i][j] = '-' ;
			}
		}	

		board[0][2] = 'O';
		board[1][1] = 'O'; 
		board[2][0] = 'O';

		assertEquals('O', ticTacToe.checkDiagonally(board));
	}
}



