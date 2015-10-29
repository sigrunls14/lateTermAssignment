package is.hr.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ticTacToeTest
{
	
	private char[][] board;
	board[][] = new char [3][3];

	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.hr.ticTacToe.ticTacToeTest");
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

	@Test
	public void testLegalInput()
	{
		try
		{
			assertEquals(0, ticTacToe.game(10));
		}
		catch(Exception e)
		{
			assertEquals("Illegal input", e.getMessage());
		}
	}

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
	}

	@Test
	public void testXWonRows()
	{

		setUpBoard();

		board[0][0] = 'X';
		board[0][1] = 'X'; 
		board[0][2] = 'X';

		assertEquals('X', ticTacToe.checkRows(board));
	}

	@Test
	public void testXWonColumns()
	{
		
		setUpBoard();

		board[0][0] = 'X';
		board[1][0] = 'X'; 
		board[2][0] = 'X';

		assertEquals('X', ticTacToe.checkColumns(board));
	}

	@Test
	public void testXWonDiagonally()
	{
		setUpBoard();
		board[0][0] = 'X';
		board[1][1] = 'X'; 
		board[2][2] = 'X';

		assertEquals('X', ticTacToe.checkDiagonally(board));

	}

	@Test
	public void testOWonRows()
	{
		try
		{
			assertEquals(0, ticTacToe.checkRows());
		}
		catch (Exception e) 
		{
			assertEquals("Player O won!", e.getMessage());
		}
	}

	@Test
	public void testOWonColumns()
	{
		try
		{
			assertEquals(0, ticTacToe.checkColumns());
		}
		catch (Exception e) 
		{
			assertEquals("Player O won!", e.getMessage());
		}
	}

	@Test
	public void testOWonDiagonally()
	{
		try
		{
			assertEquals(0, ticTacToe.checkDiagonally());
		}
		catch (Exception e) 
		{
			assertEquals("Player O won!", e.getMessage());
		}
	}
}



