package com.baekmin.smbs.board.dao;

import java.util.List;

import com.baekmin.smbs.board.model.Board;


public interface BoardDao{
	/**
	 * 글 생성
	 * @param board
	 * @return
	 * @throws Exception
	 */
	public abstract int create(Board board) throws Exception;
	
	/**
	 * 글보기
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public abstract Board read(Board board) throws Exception;

	/**
	 * 글 수정
	 * @param board
	 * @return
	 * @throws Exception
	 */
	public abstract int update(Board board) throws Exception;
	
	/**
	 * 조횟수 증가
	 * @param board
	 * @return
	 * @throws Exception
	 */
	public abstract int updateCount(Board board) throws Exception;
	
	/**
	 * 삭제
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public abstract int remove(int boardNo) throws Exception;
	
	/**
	 * 글 목록
	 * @param startRowNum
	 * @param endRowNum
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract List<Board> findBoardList(int startRowNum, int endRowNum, String board_type, String board_content  ) throws Exception;
	
	/**
	 * 글 전체 수 조회
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract int getBoardCount(String board_type, String board_content ) throws Exception;
	
	/**
	 * 덧글 내용 검색 목록
	 * @param startRowNum
	 * @param endRowNum
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract List<Board> findBoardReplyList(int startRowNum, int endRowNum, String board_type, String board_content  ) throws Exception;
	
	/**
	 * 덧글 검색 목록 전체 수 조회
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract int getBoardReplyCount(String board_type, String board_content ) throws Exception;
	
}
