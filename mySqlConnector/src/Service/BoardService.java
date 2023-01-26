package Service;


import java.util.List;

import DTO.DeleteBoardDTO;
import DTO.InsertBoardDTO;
import DTO.UpdateBoardDTO;
import Database.DAO.BoardDAO;
import Database.Entity.BoardEntity;

public class BoardService {
	
	private BoardDAO boardDao;
	
	public BoardService() {
		this.boardDao = new BoardDAO();
	}
	public int postBoard(InsertBoardDTO insertBoardDto) {
		return boardDao.insert(insertBoardDto);
	}
	
	public List<BoardEntity> getBoardList(){
		return boardDao.find();
	}
	
	public int patchBoard(UpdateBoardDTO updateBoardDto) {
			
			Integer id = updateBoardDto.getId();
			
			// 존재하는 Board id 인지 검증
			BoardEntity boardEntity = boardDao.findById(id);
			if(boardEntity == null) {
				System.out.println("Does Not Exist Board Id");
				return 0;
			}
			
			
			return boardDao.update(updateBoardDto);
	}
	
	
	public int deleteBoard(DeleteBoardDTO deleteBoardDto) {
		return boardDao.delete(deleteBoardDto);
	}
	
	
}
