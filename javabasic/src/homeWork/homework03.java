package homeWork;

public class homework03 {

	public static void main(String[] args) {
		// Quiz 3
		
		{
		// x가 y보다 크면 Hello World를 출력하시오
			int x = 50;
			int y = 10;
			
			
			
			if(x > y) {
				System.out.println("Hello World");
			}
		}
		
		{
			// 누락된 코드를 입력하여 다음 스위치문을 완성하시오
			int day = 2;
			switch(day) { // switch문의 조건문에는 조건식이 오는게 아니라 변수의 값만 올 수 있음
						  // 그래서 그 변수의 값과 아래 케이스의 값과 일치 하는지 안 하는지 판단하는 원리임	
				case 1 :
					System.out.println("Saturday");
					break;
				case 2 :
					System.out.println("Sunday");
					break;
			}
		}
		
		{
			// i가 6보다 작을 동안 출력을 반복하시오
			int i = 1;
			while(i < 6) {
				System.out.println(i);
				i++;
			}
		}
		
		{
			// for구문을 사용해서 yes를 5번 출력하시오
			
			// 방법 1
			//for(int i = 0; i < 5; i++) {
				//System.out.println("yes");
			//}
			
			// 방법 2
			int i = 0;
			for(; i < 6; i++) {
				System.out.println("yes");
				
			}
		}
		
		{
			// i가 5가되면 반복을 멈추는 코드를 작성하시오
			for(int i = 0; i < 10; i++) {
				if(i == 5) {
					break; // continue를 할 경우에 i가 5될 때 다시 위의 조건식으로 되돌아가서 for문을 실행하는데 이 때 i값이 다시 0으로 초기화가 되는게 아니라 가지고 있던 i값을 그대로 들고 실행한다. 단지 break문 아래에 있는 코드만 실행 안 시키고 돌아갈 뿐이다
				}
				System.out.println(i);
			}
		}
		
		
		
		
		

	}

	}
