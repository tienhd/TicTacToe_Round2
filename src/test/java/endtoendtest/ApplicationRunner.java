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

    public void startGame()
    {
        ticTacToeDriver.clickButtonStartGame();
    }

    public void endGame()
    {
        ticTacToeDriver.clickButtonEndGame();
    }

    public void showsStatusGameStarted()
    {
        ticTacToeDriver.showsStatusGameStarted();
    }

    public void showsStatusGameEnded()
    {
        ticTacToeDriver.showsStatusGameEnded();
    }

    public void tickCell(String nameCell)
    {
        ticTacToeDriver.doTickCell(nameCell);
    }
}
