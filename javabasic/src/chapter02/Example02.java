package chapter02;

class Triangle{
	// 밑변
	double base;
	// 높이
	double height;
	// 대각선
	double diagonal;
	
	void createAndPrint() {
		base = 3;
		height = 4;
		diagonal = 5;
		
		System.out.println("======");
		System.out.println("base : " + base);
		System.out.println("height : " + height);
		System.out.println("diagonal : " + diagonal);
	}
}



class Pythagoras{
	
	
	static String creator = "Pythagoras"; // static : 클래스 변수
	// 밑변 
	double base;
	// 높이
	double height;
	// 대각선
	double diagonal;
	
	double getDiagonal() { // 대각선의 길이값을 반환해주는 함수인데 반환값이 더블이므로 이 함수의 반환타입이 return이 되는거임
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}
	
	double getBase() { // 밑변의 길이값을 반환해주는 함수인데 반환값이 더블이므로 이 함수의 반환타입이 return이 되는거임
		return Math.sqrt(Math.pow(diagonal, 2) + Math.pow(height, 2));
	}
	
	double getHeight() { // 높이의 길이값을 반환해주는 함수인데 반환값이 더블이므로 이 함수의 반환타입이 return이 되는거임
		return Math.sqrt(Math.pow(diagonal, 2) + Math.pow(base, 2));
	}
	
	//static double getDiagonal() { 앞에 static을 붙였을 때 밑에 base랑 height랑 빨간색 컴파일오류가 나는 이유는 이 함수는 클래스 접근제한자를 가지고 있어서 인스턴스 없이도 클래스만 호출해도 호출되는데   
		//return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)); 밑에 base랑 height는 인스턴스변수라서 인스턴스를 생성했을 때만 쓸 수 있는 변수라서 컴파일 오류가 나는거임 
	}
	



public class Example02 {

	public static void main(String[] args) {
		// 객체 배열
		
		SmartPhone[] phones = new SmartPhone[3];
		
		
		// 초기화 작업
		for(int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
			phones[i] = new SmartPhone();
		}
		System.out.println("========");
		System.out.println(phones);
		System.out.println("========");
		for(SmartPhone phone : phones) { // 여기 배열안에 들어가있는 객체들이 모두 참조변수로 들어가있다는 걸 알아야함
			System.out.println(phone); // phone을 하나씩 찍어보는 코드
			phone.setNation("United State");
			phone.setOs("IOS");
			phone.setOwner("JOHN");
			phone.setTelNumber("010-1111-1111");
		}
		System.out.println("========");
		for(SmartPhone phone : phones) {
			System.out.println(phone.getNation());
			System.out.println(phone.getOs());
			System.out.println(phone.getOwner());
			System.out.println(phone.getTelNumber());
		}
		
		System.out.println("========");
		
		// p
		// 피타고라스의 정의
		
		// 밑변
		int a = 10;
		// 높이
		int b = 20;
		// 대각선
		int c = 30;
		
		// 대각선의 길이
		//int r = a * a + b * b; // a제곱 더하기 b제곱 구하는 식 
		// Math.sqrt() : 제곱근을 구하는 함수
		// Math.pow() : 정수의 거듭제곱을 구하는 함수 
		
		// 대각선의 길이
		double r1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // (a라는 값을 2제곱하겠다는 뜻 + b라는 값을 2제곱하겠다는 뜻을 더한다는 뜻)을 제곱근을 구하겠다는 식 
		// 밑변의 길이
		double r2 = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
		// 높이의 길이
		double r3 = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
		
		Pythagoras p = new Pythagoras();
		p.base = 10;
		p.height = 20;
		p.diagonal = 30;
		
		
		double diagonal = p.getDiagonal(); 
		
		System.out.println(p.creator);
		p.creator = "Newton";
		System.out.println(p.creator);
		
		Pythagoras p2 = new Pythagoras();
		System.out.println(p2.creator);
		
		System.out.println(Pythagoras.creator);
		
		// 삼각형 인스턴스
		Triangle triangle1 = new Triangle();
		triangle1.base = 3;
		triangle1.height = 4;
		triangle1.diagonal = 5;
		
		System.out.println("base : " + triangle1.base);
		System.out.println("height : " + triangle1.height);
		System.out.println("diagonal : " + triangle1.diagonal);
		
		triangle1.createAndPrint();
	}
		
}
