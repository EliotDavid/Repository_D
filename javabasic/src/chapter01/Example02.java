package chapter01;

public class Example02 {

	public static void main(String[] args) {
		
		// 배열
		// 변수가 나열된 형태
		// 실제로 컴퓨터에 저장될 떄도 나열된 상태로 저장됨
		
		//int[] numbers = new int[10];
		
		int[] numbers; // 이렇게 하면 값이 대입되는 상태가 아니라 메모리주소만 numbers에 할당된 상태가 됨
		numbers = new int[10];
		System.out.println(numbers);
		// 배열은 참조데이터타입이라서 메모리주소를 줌
		// 실제로 numbers에 들어있는게 아니라 numbers가 위치한 메모리 공간 중의 한 메모리의 주소를 보내줌	
	
		char[] characters;
		characters = new char[10];
		System.out.println(characters);
		// 프린트를 두개 했는데 하나만 출력됨
		// 컴퓨터가 받아들일 땐 문자배열로 받아들여서임
		// 메모리 주소가 있기는한데 그 메모리주소가 콘솔(출력)창에 안 보일뿐임
		
		
		// 배열에 담긴 각 데이터에 접근하는 방법은 index번호를 찍어서 접근할수 있음
		int[] numbers2 = {
				1,
				2,
				3,
				4,
				5,
				6,
				7,
				8,
				9,
				10
		};
		
		
		System.out.println("numbers2 배열의 각 인덱스 요소들을 출력하겠습니다");
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
		int[] numbers3 = new int[] {1,2,3};
		System.out.println("numbers3 배열의 각 인덱스 요소들을 출력하겠습니다");
		for(int i = 0; i < numbers3.length; ++i) {
			System.out.println(numbers3[i]);
		}
		
		char[] string = {'h', 'e', 'l', 'l', 'o'};
		System.out.println("string 배열의 각 인덱스 요소들을 출력하겠습니다");
		System.out.println(string);
		for(int i = 0; i < string.length; ++i) {
			System.out.println(string[i]);
		}
		
		string[0] = 'k'; //  string 배열의 0번 인덱스의 값을 변경
		System.out.println(string); 
		
		
		
		// ** 다차원 배열 **
		// 2차원 이상의 배열을 나타내는 거임
		
		//int[][] arrNum2 = new int[2][3];
		//arrNum2 = {1, 2}, {5, 6, 7};
	
		int[][] arrNum3 = {{1,2,3}, {4,5,6}};
		System.out.println(arrNum3[0][1]); // 0번 배열에 1번 인덱스를 출력해라
		
		
		
		
		// String은 문자열이라고 표현함
		// 프로그램 Java에서 STring이라는 문자열 클래스를 지원해줌
		// Character 배열을 사용하기 쉽도록 미리 만들어둔 Java Object Class임
		// String은 기본 데이터타입이 아님 
		// String은 클래스임
		// 앞에서 대문자로 시작하는건 클래스임
		
		String str1; // has a 관계
		str1 = new String(); // String 초기화하는 방법
		str1 = "apple";
		System.out.println(str1);

		String str2 = "banana";
		System.out.println(str2);
		
		
		
		
		// 연산자(Operator)
		
		
		
		
	}

}
