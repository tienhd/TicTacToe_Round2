package endtoendtest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * User: tienhd
 * Date: 8/16/13
 * Time: 8:40 AM
 */
public class EndToEndTest
{
    ApplicationRunner applicationRunner = new ApplicationRunner();

    @Before
    public void setUp()
    {
        applicationRunner.setUpFrame();
    }

    @After
    public void tearDown()
    {
        applicationRunner.tearDownFrame();
    }

    @Test
    public void testStartGameThenEndGame()
    {
        applicationRunner.startGame();
        applicationRunner.showsStatusGameStarted();
        applicationRunner.endGame();
        applicationRunner.showsStatusGameEnded();
    }

    @Test
    public void testStartGameAndPlaySomeStepThenEndGame()
    {
        applicationRunner.startGame();
        applicationRunner.tickCell("1_1");
        applicationRunner.tickCell("1_2");
        applicationRunner.endGame();
    }
}
