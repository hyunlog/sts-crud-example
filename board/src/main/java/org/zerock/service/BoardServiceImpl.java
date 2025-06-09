package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor // 모든 파라미터를 이용하는 생성자를 만듦 생성자 선언하지 않을 시에는 @Setter 꼭 사용!!!
public class BoardServiceImpl implements BoardService{
	
	// 서비스에서 model을 호출하기 위해서 필수적으로 선언.
	// lombok을 사용할 경우 @Setter(onMethod_ = @Autowired) 선언 필요 
	private BoardMapper mapper;
	
	// lombok을 사용할 경우
	//@Setter(onMethod_ = @Autowired)
	

	@Override
	public void resister(BoardVO board) {
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		
		log.info("--------------------------- get ");
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		
		log.info("--------------------------- modify ");
		
		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(Long bno) {
		
		log.info("--------------------------- remove ");
		
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("get List with criteria: " + cri);
		
		return mapper.getListWithPaging(cri);
	}

//	@Override
//	public List<BoardVO> getList() {
//
//		log.info("--------------------------- getList ");
//		
//		return mapper.getList();
//	}

	@Override
	public int getTotal(Criteria cri) {
		
		return mapper.getTotalCount(cri);
	}
	

}
