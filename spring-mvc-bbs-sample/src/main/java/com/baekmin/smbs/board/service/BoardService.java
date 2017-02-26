package com.baekmin.smbs.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baekmin.smbs.board.dao.BoardDaoImpl;
import com.baekmin.smbs.board.model.Board;

@Service
public class BoardService {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardService.class);
	
	@Autowired
	BoardDaoImpl bd;
	
	public int create(Board board) throws Exception {
		return bd.create(board);
	}
	
	public Board read(Board board) throws Exception {
		return bd.read(board);
	}
	
	public int update(Board board) throws Exception {
		return bd.update(board);
	}

	public int updateCount(Board board) throws Exception {
		return bd.updateCount(board);
	}

	public int remove(int boardNo) throws Exception {
		return bd.remove(boardNo);
	}

}
