package chapter01;

public class Example07 {

	public static void main(String[] args) {
		// 제어문 중에 반복문 
		
		// ** while문
		
		boolean flag = true; // while문 같은 경우에는 위에 flag 같은 거를 걸어놓고 특정 기간 동안만 while을 진행하겠다라고 사용한다고 함
		int number = 0;
		
		while(flag) {
			System.out.println("Loop" + number++); // 그 다음 이 방법이 있음
			
			//number = number + 1; // 같은 표현 : number += 1; / number++; // 그 다음 위의 14라인의 number옆에 증가연산식을 붙여주는 방법
			if(number == 10) flag = false;
		}
		
		//flag = number != 10; // 코드 이런식으로도 쓸 수 있다고하는데 이거 어떤 의도로 쓸 수 있을지 생각해보기 
		//System.out.println(flag);
		
		
		// ** do ~ while문
		while(flag) {
			System.out.println("While Loop!");
		} // 이렇게 하면 flag가 false인 상태라서 이 코드는 실행하지 않고 바로 밑의 do while문으로 빠짐
		
		
		do { 
			System.out.println("Do While Loop!");
		}while(flag); // 지금은 flag가 false인 상태로 되어있음
		
		
		// continue : 반복문이 continue문을 만났을 때 아래에 존재하는 코드를 무시하고 상단의 조건 검사부로 넘어감
		// break : 반복문이 break문을 만났을 때 아래에 존재하는 코드를 무시하고 코드블록을 벗어남(반복문을 종료함)

	
		System.out.println("=====");
		// continue, break
		number = 0;
		while(true) {
			if(number % 3 == 0) { // 3의 배수인 형태
				number++;
				System.out.println("Continue!");
				continue; // continue를 달면 밑에 구문을 실행하지 않고 그대로 위의 조건문으로 다시 돌아감
			}
			if(number > 10) {
				System.out.println("Break!");
				break;
			}
			
			System.out.println(number++);
		}
		
		System.out.println("Out of Loop!");
		
	}

}
