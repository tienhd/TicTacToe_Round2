package com.qsoft.kata5.ui.common;

import com.qsoft.kata5.ui.view.Cell;

/**
 * User: Admin
 * Date: 8/19/13
 * Time: 8:36 AM
 */
public class LogicGame
{
    public static String getWinner(Cell[][] cells)
    {
        for (int i = 0; i < 3; i++)
        {
            if (checkWin(cells[i][0], cells[i][1], cells[i][2]))
            {
                return value(cells[i][0]);
            }

            if (checkWin(cells[0][i], cells[1][i], cells[2][i]))
            {
                return value(cells[0][i]);
            }
        }

        if (checkWin(cells[0][0], cells[1][1], cells[2][2]))
        {
            return value(cells[0][0]);
        }

        if (checkWin(cells[2][0], cells[1][1], cells[0][2]))
        {
            return value(cells[2][0]);
        }

        return null;
    }

    public static boolean checkWin(Cell cell1, Cell cell2, Cell cell3)
    {
        if (checkEquals(cell1, cell2) && checkEquals(cell1, cell3))
        {
            return true;
        }
        return false;
    }

    public static boolean checkEquals(Cell cell1, Cell cell2)
    {
        if (value(cell1).equals(value(cell2)))
        {
            return true;
        }
        return false;
    }

    public static String value(Cell cell)
    {
        return cell.getText();
    }
}
