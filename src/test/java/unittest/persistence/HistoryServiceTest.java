package unittest.persistence;

import com.qsoft.kata5.persistence.dao.IHistoryDAO;
import com.qsoft.kata5.persistence.entity.TicTacToeMatch;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 8/17/13
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-config-test.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class HistoryServiceTest
{
    @Autowired
    IHistoryDAO historyDAO;

    @Test
    public void testCreateNewMatchThenSaveToDB()
    {
        TicTacToeMatch ticTacToeMatch = new TicTacToeMatch(1999900000L, "X", "X", "0_0,1_0,1_1,2_1,2_2");
        TicTacToeMatch getMatch = historyDAO.create(ticTacToeMatch);
        Assert.assertNotNull(getMatch.getId());
    }
    @Test
    public void testGetAllMatchFromDB()
    {
        List<TicTacToeMatch> getList = historyDAO.getAll();
        TicTacToeMatch ticTacToeMatch1 = new TicTacToeMatch(1999999999L, "X", "X", "0_0,1_0,1_1,2_1,2_2");
        TicTacToeMatch ticTacToeMatch2 = new TicTacToeMatch(2999999999L, "X", "X", "0_0,1_0,1_1,2_1,2_2");
        Assert.assertEquals(getList.get(0), ticTacToeMatch1);
        Assert.assertEquals(getList.get(1), ticTacToeMatch2);
    }
}
