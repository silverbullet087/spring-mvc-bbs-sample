/**
 * 
 */
package com.baekmin.smbs.board.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baekmin.smbs.board.model.Board;
import com.baekmin.smbs.board.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/business-config-mybatis.xml"})
public class BoardTest {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardTest.class);

	@Autowired
	BoardService bs;
	@Autowired
	Board board;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		logger.debug("setUp()");
		board.setBoard_no(7);
	}


	@Test
	public void test() {
		logger.debug("test() - Start");
		try {
			board = bs.read(board);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertSame(8, board.getBoard_no());	
		System.out.println("board : " + board);
		logger.debug("board : " + board);
		logger.debug("test() - End");
	}

}
