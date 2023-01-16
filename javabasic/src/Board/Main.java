package Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { // 지금 이 파일은 데이터베이스에 저장되고 있는게 아니라 메모리에 저장되고 있는 프로그램임
					// 그래서 이 프로그램이 종료되면 열심히 적어놓은 이 모든 데이터들이 날라가게 됨
					// 그래서 우리가 지속적으로 관리하고 사용해야할 적에 데이터베이스에 저장을 함으로서 우리가 휘발성데이터를 반영구적으로 관리할 수 있음
					
	private List<User> database = new ArrayList<User>();

	// id는 0이상의 수 이어야 하고 password, name, telNumber는 빈값이 아니면서 null도 아니어야 함
	private boolean createUser(int id, String password, String name, String telNumber) {
		// 파라미터가 정상적인 값인지 검증
		if (id < 0) return false;
		if (password.isEmpty() || name.isEmpty() || telNumber.isEmpty()) return false;
		if (password == null || name == null || telNumber == null) return false;
		// 아이디 중복 체크
		if (checkOverlap(id)) return false;

		// 관리하고자하는 객체를 생성
		User user = new User(id, password, name, telNumber);
		// 생성한 객체를 데이터베이스에 삽입
		database.add(user);
		// 삽입 결과를 반환
		return true;
	}
	// 회원 정보 보기
	private User readUser(int id) {
		// 파라미터가 정상적인 값인지 검증
		if (id < 0) return null;
		// database 에서 해당 id를 검색
		User user = selectUser(id);
		// 검색 결과를 반환
		return user;
	}
	// 회원 정보 수정(인자값이 3개이상일 때는 객체로 받아오는게 편안함)
	private User updateUser(updateUserDto dto) {
		int id = dto.getId();
		
		// 입력된 id값 검증 
		if(id < 0) return null;
		
		// 데이터베이스에서 입력받은 id에 해당하는 user정보를 불러옴
		// 우리가 만들어놓은 메서드가 있음 
		// 바로 위에 회원정보보기에 있는 User user = selectUser(id);임
		// 그걸 그대로 쓰면 됨
		User user = selectUser(id); // User user는 실제 데이터에 값을 변경해서 ArrayList에 있는 이 객체의 실제 데이터값이 바뀐다고 함
		
		// 입력받은 id에 해당하는 user정보가 있는지 검증을 한 번 해줘야 함
		if(user == null) return null; // user인스턴스(객체)가 존재하지않으면 null을 줄거임
		
		// 입력받은 패스워드하고 해당 유저의 패스워드가 같은지 검증
		String password = dto.getPassword();
		if(!password.equals(user.getPassword())) return null; // 같지 않다면 null을 반환함
		
		// 유저정보 변경하고 싶으면 이렇게 쓰면 됨
		String name = dto.getName();
		String telNumber = dto.getTelNumber();
		user.setName(name);
		user.setTelNumber(telNumber);
		
		return user;
		
		// ** 이렇게 우리가 하나의 인스턴스를 변경했음 / 여기서 하나의 인스턴스란 여러개의 인스턴스를 지닌 객체, 즉 여러개의 객체 중 하나의 객체를 의미함
		
		
		//return null;
	}
	// 회원 삭제(회원삭제를 해주고 싶으면 그 유저의 구분자인 id를 알아야함 / 그래서 id를 받아옴)
	private boolean deleteUser(int id) {
		// 입력받은 id값 검증
		if(id < 0) return false;// 0보다 작으면 존재하지 않는 아이디이기떄문에 false를 반환해줌
		
		// 입력받은 id에 해당하는 user의 인덱스를 가져옴
		int index = getUserIndex(id); 
		// 바로 위 코드 해석 : getUserIndex메서드를 호출해서 그 index번호를 가진 객체를 찾아서 그 객체의 메모리주소를 여기로 반환 받아와서 아래에서 삭제해주는 작업을 의미함
		
		// 받아온 index번호가 -1인지 아니면 존재하는 id인지 검증을 해야함(존재하지 않는 id인지 존재하는 id인지 검증)
		if(index == -1) return false;
		
		// 그리고 database에서 해당 인덱스 요소제거
		database.remove(index);
		
		
		return true;
	}
	
	
	// 회원 리스트
	private List<User> readUserList() {
		return database;
		
		//return null;
	}

	
	
	// 메인 메서드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int msn; // manu select number의 약자
		
		while(true) {
			// 1. 생성 / 2. 읽기 / 3. 수정 / 4. 삭제 / 5. 리스트 불러오기 / 6. 종료
			
			System.out.println("1. 생성 / 2. 읽기 / 3. 수정 / 4. 삭제 / 5. 리스트 불러오기 / 6. 종료");
			System.out.print("번호입력 : ");
			msn = sc.nextInt();
			System.out.print("입력번호 : " + msn);
			if(msn == 1) {
				
			}
			
			if(msn == 1) {
				
			}
			
			if(msn == 1) {
				
			}
			
if(msn == 1) {
				
			}

if(msn == 1) {
	
}

if(msn == 1) {
	
}
		}
	}

	// 회원 아이디가 중복되는지 검사하는 메서드
	private boolean checkOverlap(int id) {
		for (User user: database) { // 배열을 반복해서 돌릴적에 반환해주는 애는 실제 database에 있는 user가 아니라 얘를 복사한 복사본이 들어감. 값은 똑같지만 실제 같은 애는 아니다라고 하는데 무슨의미인지 생각해보기
									// 그리고 그 배열에 들어있는 건 각 배열의 메모리주소를 가지고 있음
									// 그리고 반환할 때 그 객체의 
			if (user.getId() == id) return true;
		}
		return false;
	}

	// 특정 회원 아이디를 database에서 검색하는 메서드
	private User selectUser(int id) {
		for(int i = 0; i < database.size(); i++) { // databse가 ArrayList라서 length()가 아니라 size()를 써서 길이를 사용함 
			if(database.get(i).getId() == id) return database.get(i); // 얘는 그 객체의 실제 메모리주소를 반환함
		}
		return null;
		
		/*
		for (User user: database) {
			if (user.getId() == id) return user;
		}
		return null;
		*/
	}
	
	// 특정 회원 아이디를 database에서 검색해서 해당 인덱스를 반환하는 메서드
	private int getUserIndex(int id) { // 호출부에서 받은 데이터타입하고 반환해주는 쪽하고 타입이 같아야하기 때문에 int라고 해줌
										// 우리가 반환할거는 id가 아니라 index값임
										// foreach를 쓸지 for를 쓸지인데 여기서 for를 쓰는건 foreach는 index 같은 직접적인 값을 뽑아낼수는 없음
		for(int i = 0; i < database.size(); i++) {
			if(database.get(i).getId() == id) return i; // 존재한다면 그 존재하는 index를 반환하는 코드
		}
		// 만약에 for문을 끝까지 돌았는데 index가 존재하지 않는다면
		return -1; // 존재할 수 없는 index를 반환하도록 함
	}

}
