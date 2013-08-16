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

    @Test
    public void testStartGameThenPlayUtilTickFullCaroCell()
    {
        applicationRunner.startGame();
        applicationRunner.tickCell("0_0");
        applicationRunner.tickCell("0_1");
        applicationRunner.tickCell("0_2");
        applicationRunner.tickCell("2_0");
        applicationRunner.tickCell("2_1");
        applicationRunner.tickCell("2_2");
        applicationRunner.tickCell("1_0");
        applicationRunner.tickCell("1_1");
        applicationRunner.tickCell("1_2");
        applicationRunner.showsStatusGameDrawed();
    }

    @Test
    public void testStartGameThenPlayUtilXWin()
    {
        applicationRunner.startGame();
        applicationRunner.tickCell("0_0");
        applicationRunner.tickCell("1_1");
        applicationRunner.tickCell("0_1");
        applicationRunner.tickCell("1_2");
        applicationRunner.tickCell("0_2");
        applicationRunner.showsStatusXWon();
    }

    @Test
    public void testChooseSymbolXThenStartGameWithSomeStep()
    {
        applicationRunner.chooseSymbolXFirstPlay();
        applicationRunner.startGame();
        applicationRunner.tickCell("0_0");
        applicationRunner.tickCell("1_1");
    }

    @Test
    public void testChooseSymbolOThenStartGameWithSomeStep()
    {
        applicationRunner.chooseSymbolOFirstPlay();
        applicationRunner.startGame();
        applicationRunner.tickCell("0_0");
        applicationRunner.tickCell("1_1");
    }
}
