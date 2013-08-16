package com.qsoft.kata5.ui.control;

import com.qsoft.kata5.ui.view.Cell;
import com.qsoft.kata5.ui.view.MainWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: Admin
 * Date: 8/16/13
 * Time: 9:50 AM
 */
public class MainController implements ActionListener
{
    private MainWindow mainWindow;
    private boolean startXMoveFirst = true;

    public MainController()
    {
        mainWindow = new MainWindow(this);
        mainWindow.setVisible(true);
    }

    public void doStartGame()
    {
        mainWindow.getLbStatus().setText(MainWindow.STT_STARTED);
        buildCaroPanel();
    }

    private void buildCaroPanel()
    {
        Cell[][] cells = mainWindow.getCells();
        for (int i = 0; i < MainWindow.MAX_ROW; i++)
        {
            for (int j = 0; j < MainWindow.MAX_COL; j++)
            {
                cells[i][j] = new Cell(this);
                cells[i][j].setName(i + "_" + j);
                cells[i][j].setFont(new Font("", Font.BOLD, 25));
                mainWindow.getCaroPanel().add(cells[i][j]);
            }
        }
    }

    public void doEndGame()
    {
        mainWindow.getLbStatus().setText(MainWindow.STT_ENDED);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Cell cell = (Cell) e.getSource();
        if (cell.isCanTick())
        {
            if (isStartXMoveFirst())
            {
                cell.setText("X");
                cell.setEnabled(false);
                setStartXMoveFirst(false);
            }
            else
            {
                cell.setText("O");
                cell.setEnabled(false);
                setStartXMoveFirst(true);
            }
            cell.setCanTick(false);
        }
    }

    public boolean isStartXMoveFirst()
    {
        return startXMoveFirst;
    }

    public void setStartXMoveFirst(boolean startXMoveFirst)
    {
        this.startXMoveFirst = startXMoveFirst;
    }
}
