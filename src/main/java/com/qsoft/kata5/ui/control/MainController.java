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
    private int numberCellTicked = 0;

    public MainController()
    {
        mainWindow = new MainWindow(this);
        mainWindow.setVisible(true);
    }

    public void doStartGame()
    {
        mainWindow.getLbStatus().setText(MainWindow.STT_STARTED);
        buildCaroPanel();
        numberCellTicked = 0;
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
                mainWindow.getLbStatus().setText("Let's O turn !");
            }
            else
            {
                cell.setText("O");
                cell.setEnabled(false);
                setStartXMoveFirst(true);
                mainWindow.getLbStatus().setText("Let's X turn !");
            }
            cell.setCanTick(false);
            checkWin();
            numberCellTicked++;
            if (numberCellTicked == 9)
            {
                mainWindow.getLbStatus().setText(MainWindow.STT_DRAWED);
            }
        }
    }

    private void checkWin()
    {
        String winnerSymbol = getWinner(mainWindow.getCells());
        if (winnerSymbol != null && !winnerSymbol.equals(""))
        {
            mainWindow.getLbStatus().setText(winnerSymbol + " WON !");
        }
    }

    public static String getWinner(Cell[][] cells)
    {
        for (int i = 0; i < 3; i++)
        {
            if (cells[i][0].getText().equals(cells[i][1].getText()) &&
                    cells[i][0].getText().equals(cells[i][2].getText()))
            {
                return cells[i][0].getText();
            }
        }
        for (int j = 0; j < 3; j++)
        {
            if (cells[0][j].getText().equals(cells[1][j].getText()) &&
                    cells[0][j].getText().equals(cells[2][j].getText()))
            {
                return cells[0][j].getText();
            }
        }
        //
        if (cells[0][0].getText().equals(cells[1][1].getText()) &&
                cells[0][0].getText().equals(cells[2][2].getText()))
        {
            return cells[0][0].getText();
        }
        //
        if (cells[2][0].getText().equals(cells[1][1].getText()) &&
                cells[2][0].getText().equals(cells[0][2].getText()))
        {
            return cells[2][0].getText();
        }
        return null;
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
