package endtoendtest;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

/**
 * User: Admin
 * Date: 8/16/13
 * Time: 8:54 AM
 */
public class TicTacToeDriver extends JFrameDriver
{
    public TicTacToeDriver(int timeoutMillis, String name)
    {
        super(new GesturePerformer(),
                JFrameDriver.topLevelFrame(
                        named(MainWindow.MAIN_WINDOW_NAME),
                        showingOnScreen()),
                new AWTEventQueueProber(timeoutMillis, 100));
    }
}
