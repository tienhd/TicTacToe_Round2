package com.qsoft.kata5.persistence.dao;

import com.qsoft.kata5.persistence.entity.TicTacToeMatch;

import java.util.List;


public interface IHistoryDAO
{
    public TicTacToeMatch create(TicTacToeMatch match);
    public List<TicTacToeMatch> getAll();
}
