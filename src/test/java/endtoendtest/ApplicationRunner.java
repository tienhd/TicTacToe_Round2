package endtoendtest;

import com.qsoft.kata5.MainApp;

/**
 * User: Admin
 * Date: 8/16/13
 * Time: 8:50 AM
 */
public class ApplicationRunner
{
    TicTacToeDriver ticTacToeDriver;

    public void setUpFrame()
    {
        MainApp.main();
        ticTacToeDriver = new TicTacToeDriver(2000);
    }

    public void tearDownFrame()
    {
        ticTacToeDriver.dispose();
    }
}
