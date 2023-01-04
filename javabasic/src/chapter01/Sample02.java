package chapter01;

import java.util.Scanner;

public class Sample02 {

	

	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		final String pwck;
		final String pw;
		
		String empty_space = "";
		
		String email;
		
		String nickName;
		String addr;
		String addrDetail;
		
		
		
		// 회원가입 프로세스를 사용한 변수 및 조건문 활용
		// 1. 사용자로부터 이메일, 비밀번호, 비밀번호확인, 닉네임, 주소, 상세주소를 입력받기
				
		System.out.print("이메일을 입력해주세요 : ");
		email = sc.nextLine();
		
			
		System.out.print("비밀번호를 입력해주세요 : ");
		pw = sc.nextLine();
		pwck = pw;
		System.out.print("닉네임을 입력해주세요 : ");
		nickName = sc.nextLine();
		System.out.println("주소를 입력해주세요");
		addr = sc.nextLine();
		System.out.println("상세주소를 입력해주세요");
		addrDetail = sc.nextLine();
		
		
		
		// 2. 모든값이 입력됐는지 검증 
		// 2-1. 하나라도 입력이 되지 않으면 모두 입력하세요 출력 
		
		if(email.equals(empty_space)
				||(pw.equals(empty_space)
				||(nickName.equals(empty_space)
				||(addr.equals(empty_space)
				||(addrDetail.equals(empty_space))))))
				{
			System.out.println("하나라도 빠짐없이 모두 입력하세요");
		}
		
		
		
		// 3. 비밀번호와 비밀번호 확인 서로 같은지 검증
		// 3-1. 서로 같지 않다면 비밀번호가 서로 다릅니다 출력 후 프로그램 종료
		// 4. 입력받은 데이터를 메모리에 저장 및 출력후 프로그램 종료(입력받으면서 변수에 다 저장해뒀기 떄문에 입력받은 데이터를 메모리에 다 저장을 해놨음 출력은 그냥 그 변수들을 출력하면 됨)
		
		if(pw.equals(pwck)) {
			System.out.println("비밀번호 일치");
			System.out.println("pw : " + pw + "/ pwck : " + pwck);
			return;
		} else if(!pw.equals(pwck)) {
			System.out.println("비밀번호 불일치");
			System.out.println("pw : " + pw + "/ pwck : " + pwck);
			return;
		}
		
		
		
		
		
	}

}
