package chapter03;

// public : 클래스, 메서드 주로 사용
// private : 멤버변수에 주로 사용됨


public class Modifier {
	
	private String name;
	private String address;
	private String telNumber;
	
	// private으로 선언된 멤버변수를 초기화 하기 위한 
	// 첫번째 방법 : 생성자를 이용
	// 생성자를 이용하면 외부에서 접근가능
	
	// 생성자를 이용한 방법은 인스턴스를 생성할 때만 멤버 변수를 초기화
	
	
	Modifier(){
		
	}
	
	public Modifier(String name, String address, String telNumber) {
		this.name = name;
		this.address = address;
		this.telNumber = telNumber;
	}

	
	// 두번째 방법 : Setter 메서드를 이용
	// 외부에서 접근해야하니 접근제한자는 public으로 함
	// 반환타입은 존재하지않음
	
	// 외부에서 멤버변수에 접근하기 위한 방법
	// Getter메서드를 이용
	// 접근제한자 public으로 시작하고 반환타입이 존재한다(걔를 줘야하니깐) 
	// 반환할 때는 return this.멤버변수명
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	
	
	
	
	
}
