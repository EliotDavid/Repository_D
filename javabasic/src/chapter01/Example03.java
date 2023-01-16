package chapter01;

public class Example03 {

	public static void main(String[] args) {
		
		// 연산자(Operator)
	
		// 산술연산자
		// 더하기 (+)
		System.out.println(8 + 3);
		// 빼기(-)
		System.out.println(8 - 3);
		// 곱하기(*)
		System.out.println(8 * 3);
		// 나누기(/) : 몫 구하기
		System.out.println((double)8 / 3);
		// 그냥 8에다가 3을 나누면 2.666이 나오는데 이게 2만 나오는 이유는 정수만 나옴
		// 리터럴 값은 int로 저장되어있어서 int를 int로 나눠서 int로 저장이됨 
		// 그래서 그 나눈 값에 소수점 자리가 존재한다하더라도 앞에 정수, 즉 몫만 나옴
		// 그래서 소수점으로 출력하고 싶으면 강제형변환을 해줘야 함
		
		// 나누기 나머지구하기(%)
		System.out.println(8 % 3);
		
		
		// 증가 (++) : +를 2개 붙인 형태임
		// 증감연산자는 1씩 증가시켜주는 걸 의미하는데 
		int plus1 = 0;
		System.out.println(plus1++); // 값은 그대로 출력되고 그 다음 연산과정에 돌입 / 그래서 연산된 값을 출력되지 않음
		// 증가시켰다고 했는데 0이 나옴 
		System.out.println(plus1); // 여기선 위에서 연산에 돌입된 후의 값이 출력됨
		// 여기서는 1이 됨
		
		int plus2 = 0;
		System.out.println(++plus2); // 1을 증가시킨다음에 // 연산자가 앞에 있으면 연산도 하고 연산된 값까지 출력(연산자가 앞에 있기 때문에 연산부터 동작하고 그 증가된 값이 이 변수에 대입되고 그 다음 그 값을 출력하는 동작순서임
		System.out.println(plus2); 
		
		
		// 감소
		int minus1 = 0;
		System.out.println(minus1--); //연산 과정까지만 동작
		System.out.println(minus1); // 연산의 결과 출력
		
		
		// 대입연산자
		// 대입연산자의 좌항에는 변수이고 우항에는 변수가 오든 상수가 오든 상관없음
		int number = 8;
		// number = number + 3;
		number += 3; 
		System.out.println(number);
		// number = number - 3;
		number -= 3;
		System.out.println(number);
		// number = number *3;
		number *= 3;
		System.out.println(number);
		// number = number / 3;
		number /= 3;
		System.out.println(number);
		// number = number % 3;
		number %= 3;
		System.out.println(number);
		
		
		// 비교연산자 (=은 항상 뒤에(오른쪽에) 와야함) 
		
		// 같다 연산자(==)
		System.out.println(8 == 8);
		// 다르다 연산자(!=)
		System.out.println(8 != 3);
		// 크다 연산자(small < big)
		System.out.println(3 < 8);
		// 작다 연산자(small>big)
		System.out.println(3 > 8);
		// 크거나 같다 연산자(small<=big)
		System.out.println(8 >= 3);
		// 작거나 같다 연산자(small >= big)
		System.out.println(3 <= 8);
		
		System.out.println("여기서부터 논리연산자");
		
		// 논리연산자 (좌항과 우항이 모두 논리연산이어야 함)
		
		// and연산자(&&) : 엔퍼센트 2개 연산자는 논리연산자, 한 개는 비트연산자
		// boolean -> 0 : false, 0 != true (false는 0이고 0이 아닌 값들이 true임) 
		// 좌항과 우항을 곱한다고 생각하면 된다고 함
		System.out.println(1 * 1);
		System.out.println(true && true); // && : *와 같은 의미라고 함 
		System.out.println(false && true); // return false;
		System.out.println(true && false && true); //return false
		// and 연산자에서는 false가 하나라도 있으면 false라고 함
		// 뒤에 true는 연산할 가치도 없이 false를 만나는 순간 false라고 함
		
		// ** and, or 연산의 규칙 **
		// and : 연산 과정 중 flase가 존재하면 무조건 false
		// or : 연산 과정 중 true가 존재하면 무조건 true
		// 해당 논리 뒤의 연산은 실행하지 않음
		
		System.out.println("test");
		int a = 0;
		int b = 0;
		System.out.println(false && (a++ > 0)); // 논리연산자와 연산하고 있기 때문에 (a++ > 0)은 논리연산의 결과값으로 받아들임 
		System.out.println(a); // 근데 여기서 a가 0이 나오는 이유는 위의 라인에서 산술연산식으로 연산을 하지 않았다는 뜻임 즉 논리연산식으로 값을 받아들였다는 말이라서 여기서 a는 초기값 0이 그대로 나옴(중간에 산술연산에 대해선 그 어떤 연산도 되지 않았다는 뜻임)
		
		
		// or연산자(||) : + 라고 생각하면 됨
		// boolean -> 0 == false, 0 != true;
		System.out.println(0 + 0);
		System.out.println(1 + 0);
		System.out.println(1 + 1); // return 2;
		System.out.println(false || false);
		System.out.println(true || false); // return true;
		System.out.println(false || true || true); // return true; 
		// or 연산자는 연산을 하던 중에 true를 만나면 true가 나온다고함 
		// not연산자
		System.out.println(!true);
		
		
	}

}
