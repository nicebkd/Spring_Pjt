package com.javalec.spring2_pjt.service.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.javalec.spring2_pjt.model.board.dto.BoardVo;

public interface BoardService {
	public void create(BoardVo vo) throws Exception;
	public BoardVo read(int bno) throws Exception;
	public void update(BoardVo vo) throws Exception;
	public void delete(int bno) throws Exception;
	public List<BoardVo> listAll(String search_option,String keyword) throws Exception;
	public void increaseViewcnt(int bno,HttpSession session)throws Exception;
	public int countArticle(String search_option,String keyword)throws Exception;
	
}