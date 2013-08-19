package logicgametest;

import com.qsoft.kata5.ui.view.Cell;
import org.junit.Before;

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

}
