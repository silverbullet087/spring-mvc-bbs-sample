drop table board;
CREATE TABLE board (
		       board_no             NUMBER(10) NOT NULL,
		       board_category_no    NUMBER(10) NOT NULL,
		       board_writer         VARCHAR2(50) NOT NULL,
		       board_title          VARCHAR2(100) NOT NULL,
		       board_filename       VARCHAR2(100) NOT NULL,
		       board_count          NUMBER(30) NOT NULL,
		       board_content        VARCHAR2(100) NOT NULL,
		       board_date           DATE DEFAULT SYSDATE,
		       board_reference_no   NUMBER(10) NOT NULL,
		       board_reply_dep      NUMBER(30) NOT NULL,
		       board_reply_order    NUMBER(30) NOT NULL,
		       member_no            NUMBER(10) NOT NULL
		);

SELECT * FROM BOARD;
		
commit;
   