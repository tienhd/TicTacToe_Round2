package com.qsoft.kata5.persistence.dao.impl;

import com.qsoft.kata5.persistence.dao.IHistoryDAO;
import com.qsoft.kata5.persistence.entity.TicTacToeMatch;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * User: tienhd
 * Date: 8/14/13
 * Time: 3:01 PM
 */
@Transactional
@Repository
public class HistoryDAO implements IHistoryDAO
{
    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public TicTacToeMatch create(TicTacToeMatch match)
    {
        entityManager.persist(match);
        return match;
    }

    @Override
    public List<TicTacToeMatch> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
