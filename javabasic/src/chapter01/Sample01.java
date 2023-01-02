package chapter01;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// sample01에서는 로그인 프로세스를 활용해서 변수 및 조건문 활용법을 배움
		// 1. 사용자가 아이디와 비밀번호 입력
		Scanner sc = new Scanner(System.in);
		final String USERDTOID; // 얘는 바뀌면 안되는 녀석들이라서 final로(상수) 지정해줘야함
		final String USERDTOPW; // 얘는 바뀌면 안되는 녀석들이라서 final로(상수) 지정해줘야함
		String empty_space = ""; // 빈 문자열
		// 입력이 되지 않았을 때 문자열은 "" 라고 함
		
		String id;
		String pw;
		
		
		// 회원가입 기능
		System.out.print("아이디를 입력하세요. : ");
		id = sc.nextLine();
		USERDTOID = id;
		System.out.println("=======");
		System.out.print("비밀번호를 입력하세요 : ");
		pw = sc.nextLine();
		USERDTOPW = pw;
		
		System.out.println("회원가입에 완료하셨습니다!");
		System.out.println("id : " + id + " / pw : " + pw);
		
		
		// 2. 입력한 아이디와 비밀번호가 모두 입력됐는지 검증
		// 입력이 되지 않았을 때 문자열은 ""
		// 2-1. 만약 하나라도 빈값(== 입력되지 않음 == "")이 있다면 모두 입력하세요 출력 후 흐모그램 종료
		
		// 2-1. 만약 하나라도 빈값이 있다면 '모두 입력하세요.' 출력 후 프로그램 종료
		// 3. 메모리에 저장된 아이디와 비밀번호를 확인
		// 3-1. 만약 하나라도 틀리다면 로그인 정보가 일치하지 않습니다를 출력 후 프로그램 종료
		// 3-2. 모두 맞다면 로그인에 성공했습니다 출력 후 프로그램 종료  
		
		
		// 로그인 기능
		
		if(id.equals(USERDTOID)&& pw.equals(USERDTOPW)) {
			System.out.println("로그인에 성공하셨습니다");
			System.out.println("프로그램 종료");
			return; // 이 if문이 있는 메서드는 main메서드이므로 main메서드를 종료시켜라라는 의미에서 return을 씀
		} else if(id.equals(USERDTOID)&&!pw.equals(USERDTOPW)) {
			System.out.println("비밀번호를 다시 확인해주세요");
		} else if(!id.equals(USERDTOID)&&pw.equals(USERDTOPW)) {
			System.out.println(" 아이디를 다시 확인해주세요");
		} else if(!id.equals(USERDTOID)&&!pw.equals(USERDTOPW)) {
			System.out.println("아이디와 비밀번호를 다시 확인해주세요");
		} else if(id.contains(empty_space)) {
			System.out.println("아이디를 잘못 입력하셨습니다");
		} else if(pw.contains(empty_space)) {
			System.out.println("비밀번호를 잘못 입력하셨습니다");
		} 
		
		
		
		
		// 방법 2.
		//if(id.equals("") || pw == "") { // 여기서 pw == "" 는 리터럴 상수값끼리 비교를해서 맞는건데 변수값과 변수값을 비교할 때는 ==를 쓰면 안됨 
										  // 왜냐면 변수의 데이터타입이 String 즉 참조데이터타입이기 때문이다 (클래스도 마찬가지) 
			//System.out.println("모두 입력하세요");
			// main method 종료
			// return;
		//}
		
		
		
		

	}

}
