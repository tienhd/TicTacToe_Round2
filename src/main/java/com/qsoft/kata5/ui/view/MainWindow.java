package com.qsoft.kata5.ui.view;

import javax.swing.*;

/**
 * User: Admin
 * Date: 8/16/13
 * Time: 9:01 AM
 */
public class MainWindow extends JFrame
{
    public static final String MAIN_WINDOW_NAME = "mainWindow";
    public static final String BTN_STARTGAME = "btnStartGame";
    public static final String BTN_ENDGAME = "btnEndGame";
    public static final String LB_STATUS = "lbStatus";
    public static final String STT_STARTED = "GAME STARTED !";
    public static final String STT_ENDED = "GAME ENDED !";

    public MainWindow()
    {
        super(MAIN_WINDOW_NAME);
    }
}
