package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	@Test
	public void testMapper() {
		log.info("------------------testMapper");
		log.info(mapper);
	}
	
//	@Test
//	public void testInsert() {
//		log.info("------------------ testInsert");
//		ReplyVO vo = new ReplyVO();
//		vo.setBno(19L);
//		vo.setReply("댓글 테스트");
//		vo.setReplyer("댓글유저1");
//		
//		mapper.insert(vo);
//	}
//	
//	@Test
//	public void testRead() {
//		ReplyVO vo = mapper.read(1L);
//		
//		log.info(vo);
//	}
	
//	@Test
//	public void testDelete() {
//		log.info(mapper.delete(1L));
//	}
	
//	@Test
//	public void testUpdate() {
//		ReplyVO reply = new ReplyVO();
//		reply.setReply("댓글 수정 ");
//		reply.setRno(2L);
//		
//		mapper.update(reply);
//	}
	
//	@Test
//	public void testList() {
//		Criteria cri = new Criteria();
//		
//		List<ReplyVO> replies = mapper.getListWithPaging(cri, 19L);
//		
//		replies.forEach(reply -> log.info(replies));
//	}
	
	@Test
	public void testList2() {
		Criteria cri = new Criteria(1, 10);
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 19L);
		
		replies.forEach(reply -> log.info(reply));
	}
}
