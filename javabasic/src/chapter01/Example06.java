package chapter01;

public class Example06 {

	
	//int i; // 여기도 변수를 선언할 수 있음 // 이렇게 쓰면 이 i가 글로벌 변수(전역변수)가 되고 main메서드안에서 선언된 i변수는 지역변수가 되는거고 또 main에서 선언된 for문안에서 선언된 i변수도 지역변수임
	// 여기서 i를 선언해도 main 메서드 안에서 선언된 i가 컴파일오류가 안나는데 왜 그렇지?
	public static void main(String[] args) {

		// ** 제어문 중의 반복문
		
		// for문
		// 반복 조건에 사용될 변수를 하나 선언해줌(int i = 0)
		// 그리고 그 변수를 조건에 사용함
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Out : " + i);
		// 바깥에서 변수를 선언한거를 반복문에서 사용할거면 반복문에서 굳이 변수선언을 안 해도 정상적으로 동작이되고 결과도 정상적으로 나옴
		
		for(; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Out : " + i);
		//이건 위 코드를 거꾸로 한 코드임
		
		for(; i > 0 && true; i -= 2) { // 
			System.out.println(i); // 반복문에서 i를 계속해서 쓸 수 있는 이유는 변수의 영역, 변수의 생명주기 원리 때문임 
								   // 그러니까 위에 for문에서 i는 위의 for문 영역을 빠져나오면 변수가 사라지고, 또 밑에 for문에서 i를 선언하면 여기서만 생성되었다가 사라지는 원리임
								   // 	
		}
		System.out.println("Out : " + i);
		
		
		int[] numbers = new int[5];
		
		for(int a = 0; a < numbers.length; a++) {
			numbers[a] = a + 1;
		}
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		// 위 코드는 
		//numbers[a] = a + 1;
		//numbers[a + 1] = 1;
		//numbers[a + 2] = 1;
		//numbers[a + 3] = 1;
		//numbers[a + 4] = 1;
		
		
		// 반복이 된다면 반복되는 루틴을 찾아서 반복문으로 빠르게 처리할 수 있음
		
		System.out.println("==============");
		for(int b = 0; b < numbers.length; b++) {
			System.out.println(numbers[b]);
		} 
		
		for(int x = 0; x < numbers.length; x++) System.out.println(numbers[x]);
		// 반복문도 이렇게 한절로 작성할 수 있음
		
		
		
		System.out.println("==========");
		// for each문
		// 배열의 각 요소들을 꺼내서 직접 사용하도록 함 
		// for문에다가 변수를 선언해주고 콜론찍고, 
	
		// for(변수선언 : 배열) {
		//}
		// 여기서 주의해야할 점은 for문 안에서 선언하는 변수의 타입과 배열의 데어타팅보가 동일해야 한다고 함
		// 배열의 각 요소들을 선언된 배열에 담는다는 for문
	
		
		// 위에서 numbers라는 배열을 int타입으로 선언해줬기 때문에
		for(int number : numbers) { // 변수 선언 / 우리가 사용할 배열
			System.out.println(number); // 이 배열에 담긴 각 요소들을 꺼내서 쓰려고 할 때 씀 // 인덱스가 필요없다고 생각할 때만 이 for문을 쓴다고 함
		}
		
		
		
		
	}
}
