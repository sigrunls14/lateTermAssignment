package is.hr.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ticTacToeTest
{
	
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.hr.ticTacToe.ticTacToeTest");
	}


	//Test if input is between 1 and 10
	@Test
	public void testLegalInput()
	{
		assertEquals(false, ticTacToe.legalInput(11));
	}

	//Test if selection is occupied
	@Test
	public void testIsOccupied()
	{
		//Creates a new object of the board
		board Board = new board();
		//Adds move to the board
		Board.addMove(5, 'X');
		//Check if occupied
		assertEquals(true, board.isOccupied(5));
	}

	/*
	@Test
	public void testWantsToQuit()
	{
		assertEquals(false, ticTacToe.game("q"));
	}*/

	/*@Test
	public void testIsTie()
	{
		Board.addMove();

		assertEquals(false, ticTacToe.checkWinner());
		
	}*/


	@Test
	public void testChangePlayer()
	{
		assertEquals('O', ticTacToe.changePlayer('X'));
	}

	@Test
	public void testXWonRows()
	{	
		board Board = new board();

		Board.addMove(1, 'X');
		Board.addMove(2, 'X');
		Board.addMove(3, 'X');

		assertEquals('X', board.checkRows());
	}

	@Test
	public void testXWonColumns()
	{
		board Board = new board();

		Board.addMove(1, 'X');
		Board.addMove(4, 'X');
		Board.addMove(7, 'X');

		assertEquals('X', board.checkColumns());
	}

	@Test
	public void testXWonDiagonally()
	{
		board Board = new board();

		Board.addMove(1, 'X');
		Board.addMove(5, 'X');
		Board.addMove(9, 'X');
		assertEquals('X', board.checkDiagnoally());
	}

	@Test
	public void testOWonRows()
	{
		board Board = new board();

		Board.addMove(7, 'O');
		Board.addMove(8, 'O');
		Board.addMove(9, 'O');
		

		assertEquals('O', board.checkRows());
	}

	@Test
	public void testOWonColumns()
	{
		board Board = new board();

		Board.addMove(2, 'O');
		Board.addMove(5, 'O');
		Board.addMove(8, 'O');

		assertEquals('O', board.checkColumns());
	}

	@Test
	public void testOWonDiagonally()
	{
		board Board = new board();

 		Board.addMove(3, 'O');
		Board.addMove(5, 'O');
		Board.addMove(7, 'O');

		assertEquals('O', board.checkDiagnoally());
	}

	@Test
	public void testCheckWinner()
	{
		assertEquals(false, ticTacToe.checkWinner());
	}
}



