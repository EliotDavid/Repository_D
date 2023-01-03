package chapter01;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// ** 제어문
		
		// Switch문
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		switch(number) {
			case 1 : // number가 만약 1이면이라는 뜻
				System.out.println("1을 더합니다");
				System.out.println(number += 1);
			case 2 : 
				System.out.println("2를 곱합니다");
				System.out.println(number *= 2);
			case 3 :
				System.out.println("3을 나눕니다");
				System.out.println(number /= 3);
			default :
				System.out.println("1을 증가시킵니다");
				System.out.println(++number);
		} // 이렇게 쓰게 되면 조건문의 값이 일치하는 코드부터 시작해서 그 다음 케이스, 그 다음 케이스 멈추지 않고 계속해서 실행되는 코드이고
		
		switch(number) {
			case 1 : // number가 만약 1이면이라는 뜻
				System.out.println("1을 더합니다");
				System.out.println(number += 1);
				break;
			case 2 : 
				System.out.println("2를 곱합니다");
				System.out.println(number *= 2);
				break;
			case 3 :
				System.out.println("3을 나눕니다");
				System.out.println(number /= 3);
				break;
			default :
				System.out.println("1을 증가시킵니다");
				System.out.println(++number);
		
		} // 이렇게 break를 넣으면 내가 원하는 구간 코드만 실행하고 switch문 프로세스 성향상 그 다음 케이스를 계속해서 실행시키는 동작을 멈추고 이 switch문 전체를 빠져나와라는 코드임
		
		
	}

}
