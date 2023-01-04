package chapter01;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 데이터 타입
		
		// 정수형 타입
		// byte(byte크기 : 1byte), short(byte크기 :2byte), int(byte크기 :4byte), long(byte크기 :8byte)
		byte b1 = 0;
		// 1바이트가 음수와 양수를 포함해서 총 255개를 ㅍ
		// - 128 ~ 127까지의 수만 표현함
		byte b2 = 127;
		//byte b3 = 128;
		// 그래서 127을 넘는 수 128을 넣으면 에러가 뜸
		
		short s1 = 128;
		short s2 = 32767;
		//short s3 = 38768;
		// 얘(short)도 표현할 수 있는 최대수를 넘으면 에러가 뜸
		
		int i1 = 32768;
		int i2 = 2147483647;
		//int i3 = 2147483648;
		// int도 마찬가지로 표현할 수 있는 최대수를 넘으면 에러가 뜸
		
		int i3 = -2147483648;
		//int i4 = -2147483649;
		// 음수에서도 표현할 수 있는 수를 넘으면 에러가 뜸
		
		long l1 = 2_147_483_647; // 큰수를 쓸 때는 이렇게 표현하기도 한다고함
		//long l2 = 2_147_483_648; 
		// 
		// 근데 이렇게 long타입으로 int타입보다 더 큰 수가 표현가능해서 더 큰 수를 표현할 수 있고 그 수를 long타입으로 된 변수에 넣을 수는 있으나 이렇게 되면 int타입으로 메모리에 꽂힌다고함
		// ** 정수형타입은 int로 기본적으로 저장된다고함
		
		//그래서 아래처럼 표기해줘야 long타입으로 메모리에 꽂힌다고함
		long l3 = 2_147_483_648L;
		// 이 리터럴이 long형태의 리터럴이다라고 표현됨
		// 정수형태는 기본적으로 int형태로 저장되기 때문에 이 리터럴 상수값은 long형태의 리터럴값으로 저장하겠다는 의미의 코드임
	
		// 실수타입
		// float ( 4 byte), double(8 byte)
		//float f1 = 3.1415; 
		// 이것도 이렇게 적으면 에러가 뜸 
		// 실수에 대한 값은 double형태로 메모리에 꽂히기 때문에 
		
		float f2 = 3.1415f;
		// 이렇게 표현해줘야 float형태로 메모리에 꽂힌다고 함 
		// 실수형 타입도 기본적으로 double형태로 설정되어서 꽂힌다고 함
		double d1 = 3.1415;
		
		
		// 논리타입
		// boolean(1 byte)
		
		boolean bool1 = true;
		boolean bool2 = false;
		//System.out.println(bool1);
		//System.out.println(bool2);
		
		if(bool1 != bool2) {
			System.out.println();
		}
		
		// 문자타입 
		// char (2 byte) 
		char c1 = 'a';
		char c2 = 97;
		//System.out.println(c1);
		//System.out.println(c2);
		
		
		
		// 입력 (System.in)
		// java.util.Scanner : java안에 util안에 있는 Scanner 객체
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주시기 바랍니다 : ");
		int inputNumber = sc.nextInt(); // sc : Scanner클래스를 참조하고 있는 변수로, 참조변수라고 하고 입력받을 때는 참조변수.메서드형식으로 사용함
		System.out.println("입력하신 숫자는" + inputNumber);
		System.out.println("숫자를 입력해주시기 바랍니다 : ");
		long inputCharacter = sc.nextLong();
		System.out.println("입력하신 숫자는" + inputCharacter);
		*/
		
		
		// 형변환
		// 묵시적(자동) 형변환
		byte by1 = 100;
		int number1 = by1; // 원래는 동일한 데이터타입끼리만 값을 넣어줄 수 있는데 
		// 같은 정수형 타입에다가 int타입이 더 큰 데이터타입이므로 by1의 값이 number1에 대입될 수 있음
		System.out.println(number1);
		
		float float1 = number1;
		System.out.println(float1);
		
		// 임시적(강제) 형변환
		// 사이즈(byte)가 큰 변수에서 작은 변수로 데이터를 저장할 때 
		
		int number2 = 1000;
		//byte by3 = number2;
		//이렇게 컴파일 오류가 남
		byte by2 = (byte) number2;
		// 그래서 이렇게 괄호로 해서 너는 강제로 이 타입으로 되어라 하는 코드를 적어줘야함
		
		
		
		// ======================
		// List하고 Array하고 차이 
		// List는 사이즈 어디까지 될지 모르는 형태 
		// 나열에 대한 개념은 아님
		
		// Array는 나열에 대한 개념이 큼
		// 같은 타입의 변수를 하나의 묶음으로 관리
		// 배열은 변수가 나열된 형태
		// 배열 자체가 변수는 아니고, 이 변수들이 담긴 상자들이 나열되어 있는 상태
		// 대신 같은 타입(데이터타입 형태)에 있는 상자들이 일자로 붙어서 이어져있는 형태

		// 배열은 생성한다고 표현함
		
		
		
		
		
	}

}
