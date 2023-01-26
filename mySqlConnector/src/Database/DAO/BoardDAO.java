package Database.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DTO.DeleteBoardDTO;
import DTO.InsertBoardDTO;
import DTO.UpdateBoardDTO;
import Database.DatabaseConnector;
import Database.Entity.BoardEntity;

public class BoardDAO {
	
	//데이터베이스의 Board테이블에서 입력받은 id에 해당하는 레코드를 모든 컬럼을 선택해서 반환하는 메서드
	// SQL : SELECT * FROM Board WHERE id = ?;
	// 예상 반환 결과 : 0개 아니면 1개의 레코드 
	
	public BoardEntity findById(Integer id) {
		
		BoardEntity result = null;
		
		final String SQL = "SELECT * FROM Board WHERE id = ?"; // 여기서는 Statement를 쓰면 안됨 ?는 동적인 값이기 때문에 preparedstatement써야됨
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = DatabaseConnector.createConnection();
			preparedStatement = connection.prepareStatement(SQL);
			// SELECT * FROM Board WHERE id = ?
			preparedStatement.setInt(1, id); // 첫번째 우리가 입력받은 아이디를 넣어줌
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) { // 존재하면 아래코드를 돌림 // 존재 안 하면 이 코드를 실행 안 시킴 
				String boardTitle = resultSet.getString(2);
				String boardContent = resultSet.getString(3);
				String boardDateTime = resultSet.getString(4);
				Integer boardLike = resultSet.getInt(5);
				Integer boardWriter = resultSet.getInt(6);
				
				result = new BoardEntity(id, boardTitle, boardContent, boardDateTime, boardLike, boardWriter);
			}
			
		} catch(Exception exception) {
			exception.printStackTrace();
		} finally {
			try {
				if(resultSet != null && !resultSet.isClosed())
					resultSet.close();
				if(connection != null && !connection.isClosed())
					connection.close();
				if( preparedStatement != null && ! preparedStatement.isClosed())
					 preparedStatement.close();
			} catch(Exception exception) {
				exception.printStackTrace();
			}
		}
		
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	// 데이터베이스의 Board 테이블에서 모든 컬럼을 선택해서 반환하는 메서드
		// SQL: SELECT * FROM Board;
		// 예상되는 반환 결과는 0개 이상의 복수의 레코드
		public List<BoardEntity> find() {
			List<BoardEntity> result = new ArrayList<BoardEntity>();

			final String SQL = "SELECT * FROM Board";

			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;

			try {
				connection = DatabaseConnector.createConnection();
				statement = connection.createStatement();
				resultSet = statement.executeQuery(SQL);

				while(resultSet.next()) {
					Integer id = resultSet.getInt(1);
					String boardTitle = resultSet.getString(2);
					String boardContent = resultSet.getString(3);
					String boardDateTime = resultSet.getString(4);
					Integer boardLike = resultSet.getInt(5);
					Integer boardWriter = resultSet.getInt(6);

					BoardEntity entity = new BoardEntity(id, boardTitle, boardContent, boardDateTime, boardLike, boardWriter);
					result.add(entity);
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			} finally {
				try {
					if (connection != null && !connection.isClosed())
						connection.close();
					if (statement != null && !statement.isClosed())
						statement.close();
					if (resultSet != null && !resultSet.isClosed())
						resultSet.close();
				} catch(Exception exception) {
					exception.printStackTrace();
				}
			}
			return result;
		}

		// 데이터베이스에서 Board 테이블에 레코드를 삽입
		// SQL: INSERT INTO Board (boardTitle, boardContent, boardDateTime, boardWriter)
		//      VALUES (?, ?, ?, ?);
		// 예상되는 반환 값: 0 or 1
		public int insert(InsertBoardDTO dto) {
			int result = 0;

			final String SQL = "INSERT INTO Board (boardTitle, boardContent, boardDateTime, boardWriter) VALUES (?, ?, ?, ?)";

			// 데이터에 접근하려면 
			// 1. 드라이브로드먼저 해줘야함
			
			Connection connection = null;
			PreparedStatement preparedStatement = null; // PreParedStatement(statement(완벽한 쿼리를 하나받아서 그대로 실행해주는 애임) : 동적으로 sql문의 값을 지정할 수 있도록 함
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 날짜를 포맷팅하는 코드
			
			try {
				connection = DatabaseConnector.createConnection();
				preparedStatement = connection.prepareStatement(SQL); 
				
				preparedStatement.setString(1, dto.getBoardTitle()); // 1번째 자리에 어떠한 값을 넣어주겠다는 뜻 
				preparedStatement.setString(2, dto.getBoardContent()); // 2번째 자리엔 뭐를 넣어주겠다는 뜻
				preparedStatement.setString(3, simpleDateFormat.format(new Date())); // java.util의 Date import해줘야
				preparedStatement.setInt(4, dto.getBoardWriter());
				
				result = preparedStatement.executeUpdate(); // preparedStatement가 실행이 되고 그거에 대한 결과는 어떠한 컬럼을 어떠하게 작업을 했다하고 result에 담김
			
			} catch (Exception exception) {
				exception.printStackTrace();
			} finally {
				try {
				if(preparedStatement != null && !preparedStatement.isClosed())
					preparedStatement.close();
				if(connection != null && !connection.isClosed())
					connection.close();
				} catch(Exception exception) {
					exception.printStackTrace();
				}
			}

			return result;
		}
		
		// 데이터베이스에서 Board테이블의 레코드 중 입력받은 id에 해당하는 레코드의 타이틀과 컨텐트를 입력받은 값으로 수정
		// SQL : UPDATE Board SET boardTitle = ?, boardContent = ?
		//		 WHERE id = ?; 
		// 예상되는 반환 값 : 0 or 1 (1개를 업데이트하는데 성공하거나 아니면 아무것도 업데이트 하지 못하거나(실패하거나))
		// 메서드를 쓸건데 이 메서드는 외부에서도 호출되어야 되기 때문에 접근제한자는 public으로 해야됨 
		// 예상되는 반환값은 0 아니면 1인 정수형태가 옴
		
		public int update(UpdateBoardDTO dto) {
			
			int result = 0;
			
			final String SQL = "UPDATE Board SET boardTitle = ?, boardContents = ? WHERE id = ?"; // SQL문에 동적인 값이 들어갈 때는 PreparedStatement객체를 씀
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try {
				connection = DatabaseConnector.createConnection();
				preparedStatement = connection.prepareStatement(SQL);
				// "UPDATE Board SET boardTitle = ?, boardContent = ?, WHERE id = ?"
				// 아래는 sql문을 완성시키는 코드
				preparedStatement.setString(1, dto.getBoardTitle());
				preparedStatement.setString(2, dto.getBoardContents());
				preparedStatement.setInt(3, dto.getId());
				
				result = preparedStatement.executeUpdate();
			} catch(Exception exception) {
				exception.printStackTrace();
			} finally {
				try {
					if(preparedStatement != null && !preparedStatement.isClosed())
						preparedStatement.close();
					if(connection != null && !connection.isClosed())
						connection.close();
				} catch(Exception exception) {
					exception.printStackTrace();
				}
			}
			
			return result;
			
		}
		
		// 데이터베이스에서 Board 테이블 중 입력받은 id에 해당하는 레코드를 삭제
		// SQL : DELETE FROM Board WHERE id = ?; // 아이디는 우리가 입력받은 아이디로 할거다
		// 입력받는 값이 하나이면 
		// 예상 반환 값 : 0 아니면 1 
		public int delete(DeleteBoardDTO dto) {
			int result = 0;
			
			final String SQL = "DELETE FROM Board WHERE id = ?";
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try { 
				connection = DatabaseConnector.createConnection(); // 얘 뭐하는 애지?
				preparedStatement = connection.prepareStatement(SQL);
				// DELETE FROM Board WHERE id = ?
				// ㅏㅇ래 sql문 완성 코드
				preparedStatement.setInt(1, dto.getId());
				
				result = preparedStatement.executeUpdate();
			} catch(Exception exception) {
				exception.printStackTrace();
			} finally {
				try {
					if(preparedStatement != null && !preparedStatement.isClosed())
						preparedStatement.close();
					if(connection != null && !connection.isClosed())
						connection.close();
				} catch(Exception exception) {
					exception.printStackTrace();
				}
			}
			
			return result;
		}
		
		
		
		
		

}
