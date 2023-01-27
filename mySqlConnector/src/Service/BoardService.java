package Service;


import java.util.List;

import DTO.DeleteBoardDTO;
import DTO.InsertBoardDTO;
import DTO.UpdateBoardDTO;
import Database.DAO.BoardDAO;
import Database.DAO.UserDAO;
import Database.Entity.BoardEntity;
import Database.Entity.UserEntity;


// 실제 비즈니스 로직을 수행하는 Layer
public class BoardService {
	
	private BoardDAO boardDao;
	private UserDAO userDao;
	
	
	
	
	public BoardService() { // 이 생성자가 실행이되면 UserDao생성자도 실행이 되도록 해야됨
		this.boardDao = new BoardDAO();
		this.userDao = new UserDAO();
	}
	public int postBoard(InsertBoardDTO insertBoardDto) {
		
		UserEntity userEntity = userDao.findById(insertBoardDto.getBoardWriter());
		if(userEntity == null) return 0; // 존재하지않는다면 0을 반환해라
		
		
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
