package chapter02;

class Phone{
	
	private  
	
	Phone(Object obj1, Object obj2, Object obj3){
		
	}
}




//** class : 객체를 생성하는 설계도 / 기준이 된다
class SmartPhone{
	
	// 멤버 변수 (걍 필드라고 외우고 있으면 됨)
	 private String nation; 
	 private String os; 
	 private String owner;
	 private String telNumber;
	
	
	

	// 전화하는 기능 
	void tel(String toTelNumber) {
		// 전화번호가 빈값이면 전화번호를 입력하세요
		if(toTelNumber.isEmpty()){ // isEmpty() : 빈값인가요? 라고 묻는 메서드 불리언형태로 true/false를 반호나하고 true를 반환받으면 이 if문이 실행됨
			System.out.println("전화번호를 입력하세요");
		}
		
		// 빈값이 아니면 전화중입니다를 출력하세요
		System.out.println("따르릉~ " + toTelNumber + "에게 전화걸고 있습니다");
	}
	
	
	// 문자보내는 기능
	void sendMessage(String toTelNumber, String message) { 
		System.out.println(toTelNumber + "에게" + " " + message + " (의) 문자내용을 전송하고 있습니다");
	}
	
	SmartPhone(){
		
	}
	
	
	SmartPhone(String a, String b, String c, String d){
		this.nation = a;
		this.os = b;
		this.owner = c;
		this.telNumber = d;
		
	}


	
	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getTelNumber() {
		return telNumber;
	}


	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	


	
	
	

	
	
	


	
}

public class Example01 {
	
	
	// ** 클래스로부터 객체를 만드는 과정을 클래스의 읜스턴스화라고 함
	// ** 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 함(이 때는 객체나 인스턴스나 같은 말임)
	// ** String sc = new String();도 new연산자를 통해 String이라는 인스턴스로 sc 객체를 초기화한거임(설명이 약함)
	
	public static void main(String[] args) {
		 
		//인스턴스 선언 및 생성
		
		// ** has a 관계
		// 여기서 myPhone은 참조변수라고 함
		// 객체도 맞는 말임
		SmartPhone myPhone; // 참조데이터타입이 SmartPhone으로 되어있음
		myPhone = new SmartPhone();
		
		System.out.println(myPhone.getNation());
		System.out.println(myPhone.getOs());
		System.out.println(myPhone.getOwner());
		System.out.println(myPhone.getTelNumber());
		

		SmartPhone yourPhone = new SmartPhone(); // new를 찍게되면 smartPhone이라는 메모
		
		
		
		//System.out.println(myPhone); // 이렇게 객체를 출력하면 메모리주소가 뜸 / 객체, 클래스는 참조데이터라서 메모리주소가 뜸
		//System.out.println(yourPhone);
		
		myPhone.setNation("Korea");
		myPhone.setOs("안드로이드");
		myPhone.setOwner("오태관");
		myPhone.setTelNumber("010-7894-1234");
		System.out.println(myPhone.getNation());
		System.out.println(myPhone.getOs());
		System.out.println(myPhone.getOwner());
		System.out.println(myPhone.getTelNumber());
		
		
		yourPhone.setNation("America");
		yourPhone.setOs("IOS");
		yourPhone.setOwner("서지훈");
		yourPhone.setTelNumber("010-4567-7894");
		System.out.println(yourPhone.getNation());
		System.out.println(yourPhone.getOs());
		System.out.println(yourPhone.getOwner());
		System.out.println(yourPhone.getTelNumber());
		
		
		// 인스턴스의 기능을 사용(메서드를 호출한다라고 표현함)
		myPhone.tel("010-0242-7894");
		yourPhone.sendMessage("010-1597-7564", "머하노?");
		
		
		SmartPhone hisPhone = new SmartPhone();
		System.out.println(hisPhone);
		System.out.println("---hisPhone의 메모리주소 변경전----");
		
		hisPhone = yourPhone; // yourPhone을 hisPhone으로 넣는다 // 이거 됨 // 이렇게 한다고 인스턴스가 왼쪽항에 들어가는게 아니라 메모리주소만 복사되어서 들어간다
		System.out.println("---hisPhone의 메모리주소 변경후----");
		System.out.println(hisPhone.getNation());
		
		
		
		yourPhone.setNation("United Kingdom");
		System.out.println(yourPhone.getNation()); // yourPhone을 바꿨는데
		System.out.println(hisPhone.getNation()); // hisPhone도 yourPhone의 값에 따라 나옴 
		// hisPhone이라는 참조변수에 yourPhone 참조변수를 넣으면 hisPhone참조변수가 바라보고 있는 메모리주소가 달라지는거임
		// 그러니까 기존에 hisPhone이 바라보던 인스턴스 메모리에서 yourPhone이 바라보고 있던 메모리로 참조 방향이 바뀜 / hisPhone과 yourPhone이 바라보고 있는 참조방향이 같아짐
		System.out.println(yourPhone);
		System.out.println(hisPhone);
	}

}
