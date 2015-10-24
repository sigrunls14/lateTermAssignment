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
		try
		{
			assertEquals(0, ticTacToe.checkRows());
		}
		catch (Exception e) 
		{
			assertEquals("Player X won!", e.getMessage());
		}
	}

	@Test
	public void testXWonColumns()
	{
		try
		{
			assertEquals(0, ticTacToe.checkColumns());
		}
		catch (Exception e) 
		{
			assertEquals("Player X won!", e.getMessage());
		}
	}

	@Test
	public void testXWonDiagonally()
	{
		try
		{
			assertEquals(0, ticTacToe.checkDiagonally());
		}
		catch (Exception e) 
		{
			assertEquals("Player X won!", e.getMessage());
		}
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



