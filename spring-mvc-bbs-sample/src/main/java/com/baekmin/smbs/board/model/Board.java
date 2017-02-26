package com.baekmin.smbs.board.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Board {
	
	/**
	 * 글 순서
	 */
	private int idx;
	
	/**
	 * 글번호
	 */
	private int board_no;
	
	/**
	 * 제목
	 */
	private String board_title;
	
	/**
	 * 내용
	 */
	private String board_content;
	
	/**
	 * 작성자
	 */
	private String board_writer;
	
	/**
	 * 비밀번호
	 */
	private String board_pw;
	/**
	 * 조회수
	 */
	private int board_count;
	
	/**
	 * 파일 이름
	 */
	private String board_filename;
	
	/**
	 * 생성일
	 */
	private Date board_date;
	
	/**
	 * 댓글 갯수
	 */
	private int reply_count;

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(int idx, int board_no, String board_title,
			String board_content, String board_writer, String board_pw,
			int board_count, String board_filename, Date board_date,
			int reply_count) {
		super();
		this.idx = idx;
		this.board_no = board_no;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_writer = board_writer;
		this.board_pw = board_pw;
		this.board_count = board_count;
		this.board_filename = board_filename;
		this.board_date = board_date;
		this.reply_count = reply_count;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public String getBoard_pw() {
		return board_pw;
	}

	public void setBoard_pw(String board_pw) {
		this.board_pw = board_pw;
	}

	public int getBoard_count() {
		return board_count;
	}

	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}

	public String getBoard_filename() {
		return board_filename;
	}

	public void setBoard_filename(String board_filename) {
		this.board_filename = board_filename;
	}

	public Date getBoard_date() {
		return board_date;
	}

	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}

	public int getReply_count() {
		return reply_count;
	}

	public void setReply_count(int reply_count) {
		this.reply_count = reply_count;
	}

	@Override
	public String toString() {
		return "Board [idx=" + idx + ", board_no=" + board_no
				+ ", board_title=" + board_title + ", board_content="
				+ board_content + ", board_writer=" + board_writer
				+ ", board_pw=" + board_pw + ", board_count=" + board_count
				+ ", board_filename=" + board_filename + ", board_date="
				+ board_date + ", reply_count=" + reply_count + "]";
	}
	
}
