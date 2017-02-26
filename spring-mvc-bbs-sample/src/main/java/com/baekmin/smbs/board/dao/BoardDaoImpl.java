package com.baekmin.smbs.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baekmin.smbs.board.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao{
	public final static String namespace="com.baekmin.smbs.board.BoardMapper";
	
	@Inject
    private SqlSession session;
	
	@Override
	public int create(Board board) throws Exception {
		return session.insert(namespace+".insertBoard", board);
	}

	@Override
	public Board read(Board board) throws Exception {
		return session.selectOne(namespace+".readBoard", board);
	}
	
	@Override
	public int update(Board board) throws Exception {
		return session.update(namespace+".updateBoard", board);
	}

	@Override
	public int updateCount(Board board) throws Exception {
		return session.update(namespace+".updateBoardCount", board);
	}

	@Override
	public int remove(int boardNo) throws Exception {
		session.delete(namespace+".deleteReply", boardNo);
		return session.delete(namespace+".deleteBoard", boardNo);
	}


	@Override
	public List<Board> findBoardList(int startRowNum, int endRowNum, String board_type, String board_content ) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("startRowNum", startRowNum);
		input.put("endRowNum", endRowNum);
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectList(namespace+".selectBoardlist", input);
	}

	@Override
	public int getBoardCount(String board_type, String board_content) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectOne(namespace+".countBoard", input);
	}
	
	@Override
	public List<Board> findBoardReplyList(int startRowNum, int endRowNum, String board_type, String board_content ) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("startRowNum", startRowNum);
		input.put("endRowNum", endRowNum);
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectList(namespace+".selectBoardReplylist", input);
	}
	
	@Override
	public int getBoardReplyCount(String board_type, String board_content) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectOne(namespace+".countBoardReply", input);
	}

}
