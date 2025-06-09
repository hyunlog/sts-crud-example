package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired })
	private BoardService service;
	
//	@Test
//	public void testExist() {
//		
//		log.info("-------------------------- testExist " + service);
//		assertNotNull(service);
//	}
	
//	@Test
//	public void testRegister() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("작가22");
//		
//		service.resister(board);
//		
//		log.info("-------------------------- testRegister " + board.getBno());
//	}
	
	@Test
	public void testGetList() {
		log.info("-------------------------- testGetList");
//		service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
		
	}
	
	@Test
	public void testGetList() {
		service.getList(new Criteria(2, 4)).forEach(board -> log.info(board));
	}
	
//	@Test
//	public void testGet() {
//		log.info("-------------------------- testGetList");
//		
//		log.info(service.get(23L));
//	}
	
//	@Test
//	public void testUpdate() {
//		log.info("-------------------------- testUpdate");
//		
//		BoardVO board = service.get(23L);
//		board.setTitle("제목 일단 수정해봅니다. ");
//		
//		service.modify(board);
//	}
//	
//	@Test
//	public void testRemove() {
//		
//		log.info("-------------------------- testDelete");
//		
//		service.remove(11L);
//		
//	}
}
