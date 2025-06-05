package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
//	@Test
//	public void testInsert() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}
	
	
//	@Test
//	public void testInsertSelectKey() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 selectKey");
//		board.setContent("새로 작성하는 selectKey");
//		board.setWriter("newbie22");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info("--------------------------------------------- " + board);
//	}
	
	@Test
	public void testRead() {
		BoardVO board = mapper.read(1L);
		
		log.info("read ---------------------------- " + board);
	}
	
//	@Test
//	public void testDelete() {
//		
//		log.info("DELETE COUNT : " + mapper.delete(3L));
//	}
	
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		
		board.setBno(1L);
		board.setTitle("다시 한 번 더 수정");
		board.setContent("내용도 다시 수정 슛 ");
		board.setWriter("복재성1");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: " + count);
	}
}
