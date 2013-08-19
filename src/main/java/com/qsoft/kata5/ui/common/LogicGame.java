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
            if (value(cells[i][0]).equals(value(cells[i][1])) && value(cells[i][0]).equals(value(cells[i][2])))
            {
                return value(cells[i][0]);
            }

            if (value(cells[0][i]).equals(value(cells[1][i])) && value(cells[0][i]).equals(value(cells[2][i])))
            {
                return value(cells[0][i]);
            }
        }

        return null;
    }

    public static String value(Cell cell)
    {
        return cell.getText();
    }
}
