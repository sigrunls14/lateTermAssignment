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
			assertEquals(0, ticTacToe.game(3, testNumbers));
		}
		catch(Exception e)
		{
			assertEquals("Tile is occupied please pick a different tile", e.getMessage());
		}
	}


	@Test
	public void testXWon123()
	{
		try
		{
			assertEquals(0, ticTacToe.game(testNumbers));
		}
		catch
		{
			assertEquals("Player x has won the game");
		}
	}
	
	@Test
	public void testXWon456()
	{
		try
		{
			assertEquals(0, ticTacToe.game(testNumbers));
		}
		catch
		{
			assertEquals("Player x has won the game");
		}
	}

	@Test
	public void testXWon789()
	{
		try
		{
			assertEquals(0, ticTacToe.game(testNumbers));
		}
		catch
		{
			assertEquals("Player x has won the game");
		}
	}

	@Test
	public void testXWon147()
	{
		try
		{
			assertEquals(0, ticTacToe.game(testNumbers));
		}
		catch

			assertEquals("Player x has won the game");
		}
	}

	@Test
	public void testXWon258()
	{
		try
		{
			assertEquals(0, ticTacToe.game(testNumbers));
		}
		catch
		{
			assertEquals("Player x has won the game");
		}
	}

