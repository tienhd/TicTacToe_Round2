package endtoendtest;

import org.junit.Before;

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
        applicationRunner.startGame();
    }
}
