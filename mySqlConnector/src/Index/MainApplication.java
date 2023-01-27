package Index;

import java.util.List;
import java.util.Scanner;

import DTO.DeleteBoardDTO;
import DTO.InsertBoardDTO;
import DTO.UpdateBoardDTO;
import Database.DAO.BoardDAO;
import Database.Entity.BoardEntity;
import Service.BoardService;

public class MainApplication {
	
	public static void main(String[] args) {
		
	// DAO 인스턴스 생성
			BoardDAO dao = new BoardDAO();
			// 데이터베이스에서 Board 테이블의 전체 레코드를 검색해서 출력
			List<BoardEntity> findResult = dao.find();
			Scanner scanner = new Scanner(System.in);
			String path = scanner.nextLine();
	
			BoardService boardService = new BoardService();
	
			if (path.equals("POST /board")) {
				///////////////////////////////////////////////////////
				// 사용자로부터 입력을 받음
				System.out.println("boardTitle : ");
				String boardTitle = scanner.nextLine();
				System.out.println("boardContent : ");
				String boardContent = scanner.nextLine();
				System.out.println("boardWriter : ");
				Integer boardWriter = scanner.nextInt();
	
				///////////////////////////////////////////////////////
				// 입력을 검증
				if (boardTitle.isBlank() || boardContent.isBlank() || boardWriter < 0)
					System.out.println("Invalid Input");
	
				///////////////////////////////////////////////////////
				// Service Layer 전송할 DTO 생성
				InsertBoardDTO insertBoardDto = 
						new InsertBoardDTO(boardTitle, boardContent, boardWriter);
	
				///////////////////////////////////////////////////////
				// 실제 비즈니스 로직을 실행하기 위해 Service의 메서드를 호출
				int result = boardService.postBoard(insertBoardDto);
	
				///////////////////////////////////////////////////////
				// 비즈니스 로직의 결과에 따라 결과를 출력
				if (result == 1) System.out.println("Insert Success");
				else System.out.println("Insert Failed");
			}
			else if (path.equals("GET /boardList")) {
	
				///////////////////////////////////////////////////////
				// 실제 비즈니스 로직을 실행하기 위해 Service의 메서드 호출
				List<BoardEntity> boardList = boardService.getBoardList();
	
				///////////////////////////////////////////////////////
				// 비즈니스 로직 결과를 출력
				for (BoardEntity board: boardList)
					System.out.println(board.toString());
	
			}
			else if (path.equals("PATCH /board")) {
	
				///////////////////////////////////////////////////////
				// 사용자로부터 입력을 받음
				System.out.println("boardTitle : ");
				String boardTitle = scanner.nextLine();
				System.out.println("boardContent : ");
				String boardContent = scanner.nextLine();
				System.out.println("id : ");
				Integer id = scanner.nextInt();
	
				///////////////////////////////////////////////////////
				// 입력을 검증
				if (boardTitle.isBlank() || boardContent.isBlank() || id < 0)
					System.out.println("Invalid Input");
	
				///////////////////////////////////////////////////////
				// Service Layer 전송할 DTO 생성
				UpdateBoardDTO updateBoardDto = 
						new UpdateBoardDTO(id, boardTitle, boardContent);
	
				///////////////////////////////////////////////////////
				// 실제 비즈니스 로직을 실행하기 위해 Service의 메서드를 호출
				int result = boardService.patchBoard(updateBoardDto);
	
				///////////////////////////////////////////////////////
				// 비즈니스 로직의 결과에 따라 결과를 출력
				if (result == 1) System.out.println("Update Success");
				else if (result == -1) System.out.println("Does Not Exist Board Id");
				else System.out.println("Update Failed");
			}
			else if (path.equals("DELETE /board")) {
	
				///////////////////////////////////////////////////////
				// 사용자로부터 입력을 받음
				System.out.println("id : ");
				Integer id = scanner.nextInt();
	
				///////////////////////////////////////////////////////
				// 입력을 검증
				if (id < 0) System.out.println("Invalid Input");
	
				///////////////////////////////////////////////////////
				// Service Layer 전송할 DTO 생성
				DeleteBoardDTO deleteBoardDto = new DeleteBoardDTO(id);
	
				///////////////////////////////////////////////////////
				// 실제 비즈니스 로직을 실행하기 위해 Service의 메서드를 호출
				int result = boardService.deleteBoard(deleteBoardDto);
	
				///////////////////////////////////////////////////////
				// 비즈니스 로직의 결과에 따라 결과를 출력
				if (result == 1) System.out.println("Delete Success");
				else System.out.println("Delete Failed");
			}
			else {
				System.out.println("404 Not found");
			}
	
				for (BoardEntity entity: findResult)
						System.out.println(entity.toString());
				}
	}
		
		
		
		
		/*
		// DAO 인스턴스 생성
		BoardDAO dao = new BoardDAO();
		// 데이터베이스에서 Board 테이블의 전체 레코드를 검색해서 출력
		List<BoardEntity> findResult = dao.find();

		for (BoardEntity entity: findResult)
			System.out.println(entity.toString());
		*/
		
		
		
		//Scanner scanner = new Scanner(System.in);
		//String path = scanner.nextLine();
		//BoardService boardService = new BoardService();
		//BoardDAO boardDao = new BoardDAO(); // boardDAO라는 클래스 안에 insert하는 작업 만들어뒀었음 
		
		
		//if(path.equals("POST /board")) {
			//System.out.println("boardTitle : " );
			//String boardTitle = scanner.nextLine();
		
			//System.out.println("boardContent : " );
			//String boardContent = scanner.nextLine();
			
			//System.out.println("boardWriter : " );
			//Integer boardWriter = scanner.nextInt();
			
			//InsertBoardDTO insertBoardDto =
					//new InsertBoardDTO(boardTitle, boardContent, boardWriter);
		
			//boardDao.insert(insertBoardDto); // Dto로 받은 boardDto를 담아줄거임
		//}
		//else if(path.equals("GET /boardList")) {
			//List<BoardEntity> boardList = boardDao.find();
			//for(BoardEntity board : boardList)
				//System.out.println(board.toString());
		//}
		//else if(path.equals("PATCH / board")) {
		//System.out.println("boardTitle : " );
		//String boardTitle = scanner.nextLine();
	
		//System.out.println("boardContent : " );
		//String boardContent = scanner.nextLine();
		
		//System.out.println("id : " );
		//Integer id = scanner.nextInt();
		
		// 존재하는 Board id 인지 검증
		//BoardEntity boardEntity = boardDao.findById(id);
		//if(boardEntity == null) {
			//System.out.println("Does Not Exist Board Id");
		//	return;
		//}
		// UPDATE 실행
		//UpdateBoardDTO updateBoardDto = new UpdateBoardDTO(id, boardTitle, boardContent);
		
		//int result = boardDao.update(updateBoardDto);
		
		//if(result == 1) System.out.println("Update Success");
		//else System.out.println("Update Failed");
		
		//} 
		//else if(path.equals("DELETE /board")) {
			//System.out.println("id : ");
			//Integer id = scanner.nextInt();
			//
			//DeleteBoardDTO deleteBoardDto = new DeleteBoardDTO(id);
			
			//int result = boardDao.delete(deleteBoardDto);
			
			//if(result == 1) System.out.println("DELETE SUCCESS");
			//else System.out.println("DELETE FAILED");
		//}
		
		//else { 
		//	System.out.println("404 Not found");
		//}
	//}
	//*/
		
		
		
//}
		
		
		
