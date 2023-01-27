package Database.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database.DatabaseConnector;
import Database.Entity.UserEntity;

public class UserDAO {
	// ** DAO 같은 경우는 멤버변수 선언하고 그런 것이 없다고함
	// ** 실제비즈니스로직을 실행해주는 애 : Service Layer(서비스 레이어)라고 함
	
	// 데이터베이스에서 User 테이블 중 id가 입력받은 값에 해당하는 레코드를 모든 컬럼을 선택해서 반환
	// SQL : SELECT * FROM User WHERE id = ?;
	
	// 예상되는 반환값 : 0 아니면 1
	// SELECT ALL을 찍었기 때문에 SELECT를 했기 때문에 INT형태의 결과값이 아니라 0개 아니면 1개라는 엔티티형태로 반환이 됨
	// 그래서 0개 아니면 1개의 레코드가 나와야한다고 함 
	
	// 레코드에 대한 녀석은 ID로 해서 UNIQUE
	
	// 레코드 : 데이터베이스 내에서 레코드는 어떠한 애는 테이블을 기준으로 만들어짐(자바에서는 엔티티를 기준으로 만들어짐) 
	// 그렇기 때문에? 엔티티의 인스턴스를 기준으로 반환해야 됨
	
	// * 사용자로부터 입력을 받아야와햐는 애가 id임
	
	
	
	// find ~~ 라고 적혀져있으면 결과의 인스턴스를 반환하는 메서드임
	// exist ~~ 라고 적혀져있으면 결과의 존재여부를 boolean형태로 반환하는 메서드임
	public UserEntity findById(Integer id) {
		UserEntity result = null; // 일단 UserEntity타입으로 반환을 해줄거니깐 UserEntity타입으로 객체를 하나 만들어줌
		
		final String SQL = "SELECT * FROM User WHERE id = ?"; // 그 다음 PreparedStatement로 보내줄 쿼리문을 임의의 변수 하나에 저장해주고
															  // 
															 // SELECT는  SELECT 한 다음에 그 결과값이 담는 과정까지 해야되기 때문에 RESULTSET까지 필요함
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		
		try{
			connection = DatabaseConnector.createConnection();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, id); // 첫번째 자리에 id를 넣어줌
			
			resultSet = preparedStatement.executeQuery(); // 결과를 받아와서 실행을 함
			
			
			if(resultSet.next()){
				String password = resultSet.getString(2);
				String name = resultSet.getString(3);
				String telNumber = resultSet.getString(4);
				
				result = new UserEntity(id, password, name, telNumber);
			}
			
		}catch(Exception exception){
			exception.printStackTrace();
		} finally {
			try {
				if(resultSet != null && !resultSet.isClosed())
					resultSet.close();
				if(preparedStatement != null && !preparedStatement.isClosed())
					preparedStatement.close();
				if(connection != null && !connection.isClosed())
					connection.close();
			}catch(Exception exception){
				exception.printStackTrace()
				;
			}
		}
		
		return result;
	}
}

		

