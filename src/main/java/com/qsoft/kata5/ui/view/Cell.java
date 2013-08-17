package com.qsoft.kata5.ui.view;

import com.qsoft.kata5.ui.control.MainController;

import javax.swing.*;

/**
 * User: Admin
 * Date: 8/16/13
 * Time: 10:15 AM
 */
public class Cell extends JButton
{
    private boolean canTick = true;

    public Cell()
    {
    }

    public Cell(MainController mainController)
    {
        super();
        addActionListener(mainController);
    }

    public boolean isCanTick()
    {
        return canTick;
    }

    public void setCanTick(boolean canTick)
    {
        this.canTick = canTick;
    }
}
