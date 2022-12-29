package chapter_01;

public class Example_01 {
// public class : 모든 곳에서 사용할 수 있는 클래스다
	
	public static void main(String[] args) {
		// public static : 이 클래스가 로드 되는 순간 바로 실행된다는 뜻임
		// void : 반환타입이 없다는 뜻
		// main : 메서드명
		// String[] : main 메서드의 인자가 String 타입의 배열이 올것이다라는 뜻
		// args : 인자명 
		
		// 변수
		// 데이터를 저장하는 메모리 공간(변경가능) 
		// 데이터타입 변수명;
		
		int number; // 변수선언
		number = 10; // 변수에 값을 대입
		
		char character;
		character = 'a';
		
		System.out.println(number);
		System.out.println(character);
		
		
		
		// 상수
		// 상수도 데이터를 저장하는 메모리 공간인데 변경이 불가능함
		// final이라는 데이터타입을 붙이고 상수명; (상수 선언)
		// 상수를 써야하는 이유 : 값의 보존을 위해서랑 그래서 값을 고정해놓고 편하게 사용하기 위해서임
		final double PI = 3.14;
		System.out.println(PI);
		// PI = 11; 이렇게 값을 변경하려고하면 빨간줄이 나타남
		final int NUMBER;
		NUMBER = 14; // 첫 초기화까지는 오류가 안 나고
		// NUMBER = 15;  // 두 번째부터 값을 변경하려고 할 때는 오류가 나면서 변경이 불가능함
	
		// run(실행) 단축키 : ctrl + f11 
		
		
	}

}
