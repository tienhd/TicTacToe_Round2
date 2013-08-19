package logicgametest;

import com.qsoft.kata5.ui.common.LogicGame;
import com.qsoft.kata5.ui.view.Cell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Admin
 * Date: 8/19/13
 * Time: 8:31 AM
 */
public class LogicGameTest
{
    Cell[][] cells = new Cell[3][3];

    @Before
    public void setUp()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                cells[i][j] = new Cell();
            }
        }
    }

    @Test
    public void testLogicGameForOWinInRow()
    {
        cells[0][0].setText("O");
        cells[1][0].setText("X");
        cells[0][1].setText("O");
        cells[1][1].setText("X");
        cells[0][2].setText("O");
        assertEquals("O", LogicGame.getWinner(cells));
    }

    @Test
    public void testLogicGameForOWinInColumn()
    {
        cells[0][0].setText("O");
        cells[2][2].setText("X");
        cells[1][0].setText("O");
        cells[1][1].setText("X");
        cells[2][0].setText("O");
        assertEquals("O", LogicGame.getWinner(cells));
    }

    @Test
    public void testLogicGameForXWinInRightCross()
    {
        cells[0][0].setText("X");
        cells[1][0].setText("O");
        cells[1][1].setText("X");
        cells[2][1].setText("O");
        cells[2][2].setText("X");
        assertEquals("X", LogicGame.getWinner(cells));
    }

    @Test
    public void testLogicGameForXWinInLeftCross()
    {
        cells[2][0].setText("X");
        cells[1][0].setText("O");
        cells[1][1].setText("X");
        cells[2][1].setText("O");
        cells[0][2].setText("X");
        assertEquals("X", LogicGame.getWinner(cells));
    }
}
