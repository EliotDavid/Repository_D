package Service;

import Database.DAO.UserDAO;

public class UserService {
	// ** User와 관련된 비즈니스로직을 실행하겠다는 의미로 만든거지, User테이블과 관련된 
	// ** 이 서비스에서는 UserDAO를 쓸거임
	private UserDAO userDao;
	
	// 우리가 생성자를 통해서 이 객체가 생성되면 동시에 멤버변수도 생성되게 해주도록 함
	public UserService() {
		this.userDao = new UserDAO();
	}
	
	

}
