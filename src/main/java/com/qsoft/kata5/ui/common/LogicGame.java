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
            if (checkEquals(cells[i][0], cells[i][1]) && checkEquals(cells[i][0], cells[i][2]))
            {
                return value(cells[i][0]);
            }

            if (checkEquals(cells[0][i], cells[1][i]) && checkEquals(cells[0][i], cells[2][i]))
            {
                return value(cells[0][i]);
            }
        }

        if (checkEquals(cells[0][0], cells[1][1]) && checkEquals(cells[0][0], cells[2][2]))
        {
            return value(cells[0][0]);
        }

        return null;
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
