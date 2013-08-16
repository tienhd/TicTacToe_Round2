package com.qsoft.kata5.ui.control;

import com.qsoft.kata5.ui.view.MainWindow;

/**
 * User: Admin
 * Date: 8/16/13
 * Time: 9:50 AM
 */
public class MainController
{
    private MainWindow mainWindow;


    public MainController()
    {
        mainWindow = new MainWindow(this);
        mainWindow.show();
    }

    public void doStartGame()
    {
        mainWindow.getLbStatus().setText(MainWindow.STT_STARTED);
    }

    public void doEndGame()
    {
        mainWindow.getLbStatus().setText(MainWindow.STT_ENDED);
    }
}
