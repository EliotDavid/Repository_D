package Board;

// DTO : Data Transfer Object의 약자임
// DTO는 일반적으로 데이터전송객체라고 하는데 서로 다른 레이어간에 데이터를 송수신 할 때 사용되는 객체임

public class updateUserDto {
	// DTO : Data Trasfter Object
	
	private int id;
	private String password;
	private String name;
	private String telNumber;
	
	// * 값을 받기 위한 생성자를 사용해야함
	// * 생성자가 없으면 SEtter메서드로 일일이 하나씩 값을 저장해줘야하는 불편함이 있기 때문에 생성자로 한꺼번에 넣어주는게 좋음
	public updateUserDto(int id, String password, String name, String telNumber) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.telNumber = telNumber;
	}

	
	
	
	
	// * 아래는 Getter / Setter
	// * Getter의 접근제한자는 public이고 반환타입은 인자값의 데이터타입이어야함
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNumber() {
		return this.telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	
	
	
	
	
	
}
