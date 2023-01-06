package chapter02;

import java.util.Scanner;

// 이거 코드 덜 완성되었는데 내가 직접 만들어보기




// 게시물 작성

// 게시물 목록 보는것

// 게시물 상세 보는 것

// 게시물 수정 하는 것 

class Board{ // 게시판에 필요한 요소들
	// ** 게시물은 목록형태로 되어있기 때문에 얘를 구분할 수 있는 형태로 뭐를 하나 넣어줄거임
	// 그게 게시물 구분자(게시물 앞에 붙는 게시물 작성순서대로 생성되는 게시물번호)
	int idex;
	
	
	// 제목
	String title;
	
	// 작성자
	String writer;
	
	// 작성날짜 및 시간
	String wirttenDate;
	
	// 작성내용
	String contents;
	
	// 좋아요(좋아요버튼 클릭 수)
	int like;
	
	
	void contractionPrint() { // 함축적인이라는 의미의 함수로 만듬
		System.out.println("게시물 구분자 : " + idex + " / " + "게시물 제목 : " + title + " / " + "게시물 작성자 : " + writer + "게시물 작성날짜 및 시간 : " + wirttenDate + "내용 : " + "contents");
	}
	
	void detailPrint() {
		System.out.println("title = " + title);
		System.out.println("writer = " + writer);
		System.out.println("writtenDate = " + wirttenDate);
		System.out.println("contents = " + contents);
		System.out.println("like = " + like);
	}
	
}

public class Sample01 { // ** 메서드에서 인자를 입력받을 때는 인자를 입력받고 나서 검증이라는 걸 해줘야한다고 함
	
	final static Board[] BOARD_LIST = new Board[3]; // 게시물 3개를 담기 위한 객체 배열을 만들었음 근데 static을 안쓰면 인스턴스형태의 접근제한자라서 밑에 main메서드가 static이어서 static으로 써줘야 쓸 수 있다고 함
													// 3개의 요소들을 담을 수 잇는 공간은 만들었지만 각 객체들이 생성되어서 담기진 않았음 그 이유는 각 객체들이 인스턴스화하지 않았기 때문임
	
	// 게시물 작성 기능
	public static void writeBoard() {
		
		Scanner writer = new Scanner(System.in);
		
		// 입력이 완료되면 게시물이 자동 등록됨
		// 등록이 완료되면 처음화면으로 돌아가야 됨
		System.out.println("게시물 작성");
		
		
		for(int i = 0; i < BOARD_LIST.length; i++) {
		//for(Board board : BOARD_LIST) {
			if(BOARD_LIST[i] != null) continue;
		
			writer = new Scanner(System.in);
			
			BOARD_LIST[i] = new Board();
			
			BOARD_LIST[i].idex = i;
			System.out.println("타이틀 : ");
			BOARD_LIST[i].title = writer.nextLine();
			System.out.println("작성자 : ");
			BOARD_LIST[i].writer = writer.nextLine();
			System.out.println("작성날짜 및 시간 : ");
			BOARD_LIST[i].wirttenDate = writer.nextLine();
			System.out.println("내용 : ");
			BOARD_LIST[i].contents = writer.nextLine();
			
			
			//board.contractionPrint();
			
			break;
		}
		
		// 게시물 목록보기 
	}
	
	public static int getBoardList(){
		System.out.println("게시물 목록");
		
		// BOARD_LIST 배열에서 요소를 하나씩 꺼내줌
		for(Board board : BOARD_LIST) { // 게시물 객체 안에 있는 여러 개의 게시물들을 보고 싶어서 for each문을 씀
										// 빈 객체 배열안에 각 요소들은 인스턴스 형성이 안 된 상태이기 때문에 모두 null로 나옴
			System.out.println();
			
			if(board == null) continue;  // 꺼낸 board 요소가 null이면 다음 요소를 꺼내옴
			board.contractionPrint();
				
				
			}
		
		Scanner selector = new Scanner(System.in);
		// 게시물 목록에서 특정 게시물 구분자를 입력하면 해당 게시물의 상세 내용을 보여줌
		System.out.println("게시물을 선택하세요. (-1을 입력하면 처음화면으로 돌아갑니다)");
		int selectBoardId = selector.nextInt();
		
		if(selectBoardId >= BOARD_LIST.length) {
			System.out.println("3이상의 게시물은 없습니다");
			getBoardList(); // 재귀호출 코드 / 자기 자신을 다시 호출하는 메서드
			return 0;
		}
		if(selectBoardId < -1) {
			System.out.println("잘못된 입력입니다");
			getBoardList();
			return 0;
		}
		// 만약 -1을 입력하면 처음화면으로 돌아와야 함
		if(selectBoardId == -1) {
			// continue; // 이 continue는 반복문에만 적용되는거라서 최상단에 있는 while문에 걸리는거라고 함 / 그러니까 continue는 자기를 둘러싸고 있는 반복문이 있어야 걸리는건데 지금 이 if문은 자기를 감싸고 있는 반복문이 없어서 continue를 안 써도됨
			return 0; // 이 return값은 -1인데 -1의 데이터타입은 int라서 메서드의 반환타입도 int로 해줘야함
		}
			
		BOARD_LIST[selectBoardId].detailPrint();
		
		// 게시물 상세에서 수정하기(버튼)를 선택하면 수정을 할 수 있음
		System.out.println("1. 수정 / 0. 처음으로");
		int updateSelect = selector.nextInt();
		
		
		// 수정이 완료되면 처음화면으로 돌아가게 해야함		
		if(updateSelect == 0) return 0;
	
		Scanner writer = new Scanner(System.in);
	
		System.out.println("타이틀 : ");
		BOARD_LIST[selectBoardId].title = writer.nextLine();
		System.out.println("작성자 : ");
		BOARD_LIST[selectBoardId].writer = writer.nextLine();
		System.out.println("작성날짜 및 시간 : ");
		BOARD_LIST[selectBoardId].wirttenDate = writer.nextLine();
		System.out.println("내용 : ");
		BOARD_LIST[selectBoardId].contents = writer.nextLine();
		
		return 0;
	}
	
	// 게시물 세팅 메서드
	static void setBoard(int i) {
	
		Scanner writer = new Scanner(System.in);
		
		System.out.println("타이틀 : ");
		BOARD_LIST[i].title = writer.nextLine();
		System.out.println("작성자 : ");
		BOARD_LIST[i].writer = writer.nextLine();
		System.out.println("작성날짜 및 시간 : ");
		BOARD_LIST[i].wirttenDate = writer.nextLine();
		System.out.println("내용 : ");
		BOARD_LIST[i].contents = writer.nextLine();
		
		
		
	}
	
	public static void main(String[] args) {
		
		// 프로그램은 사용자가 종료를 하기 전까지 계속 실행되어야 함
		// 사용자로부터 입력을 받아
		boolean power = true;
		Scanner sc = new Scanner(System.in);
		while(power) { 
			//게시물 작성, 게시물 목록 기능을 선택할 수 있어야함(함수로 구현)
			System.out.println("1. 게시물 작성 / 2. 게시물 목록 / 0. 종료"); // 1을 입력하면 작성을 하게 하고 2를 입력하면 목록을 보게 하고 0을 입력하면 종료를 하게 해야함
			
			int mainSelectNumber = sc.nextInt();
			if(mainSelectNumber < 0 || mainSelectNumber > 2) { // 0보다 작거나 2보다 크면
				System.out.println("잘못된 번호를 선택하셨습니다.");
				continue; // continue를 쓰면 다시 반복문의 조건식 판단하는 곳으로 돌아감
						  // 그러면 다시 반복문의 처음부터 시작하면서 번호를 받으면서 내려오게 됨 	
			}
			
			// 게시물 작성(버튼)을 선택하면 타이틀, 작성자, 작성날짜 및 시간, 내용을 입력할 수 있어야함
			if(mainSelectNumber == 1) writeBoard();
				
			
			
			// 게시물 목록(버튼)을 선택하면 게시물을 모두 보여줌(게시물 구분자와 게시물 제목, 작성자만 출력)
			if(mainSelectNumber == 2) getBoardList();
				
				//System.out.println(BOARD_LIST); // 이렇게 하면 배열의 메모리주소가 나옴
				
				
			
			
			// 처음화면일 시 종료(버튼)를 선택하면 프로그램이 종료되어야함
			if(mainSelectNumber == 0) {
				System.out.println("프로그램 종료");
				// 1. while문의 조건을 false로 바꾸면 되고
				power = false;
				// 2. break;문으로 while문을 강제 종료시킬 수 있음
				// break;
				// 3. return으로 main 메서드 자체를 종료시키는 방법이 있음
				// return;
				}
			}	
				
			
			
		}
}
		
		




