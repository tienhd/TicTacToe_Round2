package endtoendtest;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JButtonDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import com.qsoft.kata5.ui.view.MainWindow;

import javax.swing.*;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * User: Admin
 * Date: 8/16/13
 * Time: 8:54 AM
 */
public class TicTacToeDriver extends JFrameDriver
{
    public TicTacToeDriver(int timeoutMillis)
    {
        super(new GesturePerformer(),
                JFrameDriver.topLevelFrame(
                        named(MainWindow.MAIN_WINDOW_NAME),
                        showingOnScreen()),
                new AWTEventQueueProber(timeoutMillis, 100));
    }

    public void clickButtonStartGame()
    {
        JButtonDriver buttonStartGameDriver = new JButtonDriver(this, JButton.class, named(MainWindow.BTN_STARTGAME));
        buttonStartGameDriver.click();
    }


    public void clickButtonEndGame()
    {
        JButtonDriver buttonEndGameDriver = new JButtonDriver(this, JButton.class, named(MainWindow.BTN_ENDGAME));
        buttonEndGameDriver.click();
    }

    public void showsStatusGameStarted()
    {
        JLabelDriver labelStatusDriver = new JLabelDriver(this, named(MainWindow.LB_STATUS));
        labelStatusDriver.hasText(equalTo(MainWindow.STT_STARTED));
    }

    public void showsStatusGameEnded()
    {
        JLabelDriver labelStatusDriver = new JLabelDriver(this, named(MainWindow.LB_STATUS));
        labelStatusDriver.hasText(equalTo(MainWindow.STT_ENDED));
    }

    public void doTickCell(String nameCell)
    {
        JButtonDriver cellButtonDriver = new JButtonDriver(this, JButton.class, named(nameCell));
        cellButtonDriver.click();
    }

    public void showsStatusGameDrawed()
    {
        JLabelDriver labelStatusDriver = new JLabelDriver(this, named(MainWindow.LB_STATUS));
        labelStatusDriver.hasText(equalTo(MainWindow.STT_DRAWED));
    }
}
