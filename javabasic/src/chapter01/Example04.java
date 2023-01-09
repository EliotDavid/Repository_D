package chapter01;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// ** 제어문
		
		// if문 
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt(); // int형 age라는 변수에 정수 20이라는 리터럴 상수값을 대입한 상태라고 이해하면 된다고 함
		/*
		if(age > 19) {
			System.out.println("성인입니다");
		}
		
		System.out.println("미성년자입니다");
		*/
		// 이렇게 하면 20을 입력해도 프로세스 원리상 성인입니다, 미성년자입니다 둘 다 출력됨
		// 그래서 아래처럼 코드를 작성해야함
		
		if(age > 19) {
			System.out.println("성인입니다");
		} else { 
			System.out.println("미성년자입니다");
		}
		
		
		// if ~ else if문
		// if(조건) { 
		// 코드
		//} else if(조건){
		// 코드
		//} else { 
		//  코드 
		// 동작원리 
		// 1. 일단 맨 처음 if문의 조건문을 확인해서 true면 그 if문의 코드블록을 실행하는데 
		// 2. 만약에 처음 if문의 조건문의 결과가 false이면 첫번째 if문의 코드는 실행하지 않고 그대로 빠져서
		// 3. 다음 조건문이 있는 else if()문 또는 else 문으로 빠지는데 else if문이 있다면 else if문 안에 있는 조건문을 확인하고 그 조건문의 결과가 true이면 그 else if문의 코드블록을 실행하고 빠지고(if문 전체를 빠져나간다는 뜻)
		// 4. 만약 else if문의 조건문이 false이면 그 else if문의 코드블록은 실행하지 않고 그대로 다음 else if문 또는 else문으로 넘어가고 
		// 5. 그 밑에 있는 else if문 또는 else문을 만나면 또 똑같이 else if문의 조건문을 확인하고 그 조건문이 true이면 그 조건문을 실행시키고 if문 전체를 빠져나감
		
		System.out.print("숫자를 입력해주세요 : ");
		int number = sc.nextInt();
		if(number > 0 ){
			System.out.println("양수입니다");
		} else if(number++ >= 0) {
			System.out.println(number);
			System.out.println("0보다 크거나 같습니다");
		} else if(number < 0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
		
		System.out.println(number); // number에 0을 대입시켰는데 여기 number에서 1이 나오는 이유는 위의 number++ 코드까지만 해도 number의 상태는 0이지만(그 이유는 변수 뒤에 연산자가 있으므로 연산이 되기 전의 number의 값만 비교연산해서 0과 0이 같나요 해서 같다라고 표현된거고 그 다음 연산식이 이뤄짐. 그런데 최종적으로 1이 되지는 않은 상태임)
									// 최종적으로 1은 어디서 되느냐? 여기 코드에서 1이됨 // 어떻게 1이 되느냐 위의 코드 마지막 프로세스가 증가 연산식까지 돌입하는 
									// ㄴㄴ 아님 위의 증가연산식 과정을 처리하는 코드에서 number가 ++number해도 1 number++해도 1로 나옴
									// 최종적으로 1임
									

		// ** 입력값을 검증하는 단계 예시
		// 0이 아닐 경우에만 실행해라는 예시
		// 0이면 0이다라고 출력
		int inputValue = sc.nextInt();
		
		if(inputValue == 0) {
			System.out.println("0입니다");
			return;
		}
		
		if(inputValue >= 100) {
			System.out.println("100이상입니다");
			return;
		}
		
		int a = 10 / inputValue;
		int b = a * inputValue;
		b++;
		System.out.println(a * b);
		
		
		/*
		if(inputValue != 0) {
			int a = 10 / inputValue;
			int b = a * inputValue;
			b++;
			System.out.println(a * b);
		} else { 
			System.out.println("0입니다");
		}
		*/ // 이 코드는 초짜 코드/잘못된 코드라고 함
		
		if(a * b == 110) System.out.println("110"); // if문이 한 절이면 코드블록을 안 써도 됨 그냥 if문 하나만 적은거랑 똑같은 거임
	}

}
