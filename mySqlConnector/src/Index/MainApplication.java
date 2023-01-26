package Index;

import java.util.List;
import java.util.Scanner;

import DTO.DeleteBoardDTO;
import DTO.InsertBoardDTO;
import DTO.UpdateBoardDTO;
import Database.Entity.BoardEntity;
import Service.BoardService;

public class MainApplication {
	
	public static void main(String[] args) {
		/*
		// DAO 인스턴스 생성
		BoardDAO dao = new BoardDAO();
		// 데이터베이스에서 Board 테이블의 전체 레코드를 검색해서 출력
		List<BoardEntity> findResult = dao.find();

		for (BoardEntity entity: findResult)
			System.out.println(entity.toString());
		*/
		
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();
		BoardService boardService = new BoardService();
		//BoardDAO boardDao = new BoardDAO(); // boardDAO라는 클래스 안에 insert하는 작업 만들어뒀었음 
		
		
		if(path.equals("POST /board")) {
			System.out.println("boardTitle : " );
			String boardTitle = scanner.nextLine();
		
			System.out.println("boardContent : " );
			String boardContent = scanner.nextLine();
			
			System.out.println("boardWriter : " );
			Integer boardWriter = scanner.nextInt();
			
			InsertBoardDTO insertBoardDto =
					new InsertBoardDTO(boardTitle, boardContent, boardWriter);
		
			boardDao.insert(insertBoardDto); // Dto로 받은 boardDto를 담아줄거임
		}
		else if(path.equals("GET /boardList")) {
			List<BoardEntity> boardList = boardDao.find();
			for(BoardEntity board : boardList)
				System.out.println(board.toString());
		}
		else if(path.equals("PATCH / board")) {
		System.out.println("boardTitle : " );
		String boardTitle = scanner.nextLine();
	
		System.out.println("boardContent : " );
		String boardContent = scanner.nextLine();
		
		System.out.println("id : " );
		Integer id = scanner.nextInt();
		
		// 존재하는 Board id 인지 검증
		BoardEntity boardEntity = boardDao.findById(id);
		if(boardEntity == null) {
			System.out.println("Does Not Exist Board Id");
			return;
		}
		// UPDATE 실행
		UpdateBoardDTO updateBoardDto = new UpdateBoardDTO(id, boardTitle, boardContent);
		
		int result = boardDao.update(updateBoardDto);
		
		if(result == 1) System.out.println("Update Success");
		else System.out.println("Update Failed");
		
		} 
		else if(path.equals("DELETE /board")) {
			System.out.println("id : ");
			Integer id = scanner.nextInt();
			
			DeleteBoardDTO deleteBoardDto = new DeleteBoardDTO(id);
			
			int result = boardDao.delete(deleteBoardDto);
			
			if(result == 1) System.out.println("DELETE SUCCESS");
			else System.out.println("DELETE FAILED");
		}
		
		else { 
			System.out.println("404 Not found");
		}
	}
}
