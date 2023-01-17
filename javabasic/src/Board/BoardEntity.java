package Board;

import java.util.Date;

// 데이터베이스 테이블로부터
// 추출해온 클래스는 **Entity라 명명함
public class BoardEntity {
	// Entity class는 
	// 멤버변수가 DB의 테이블의 필드명과 완전 일치해야함(오타가 나면 안됨) 
	// 데이터타입도 DB와 똑같이 만들었음
	private int boardNumber;
	private String boardTitle;
	private String boardContents;
	private Date boardDate; // 날짜는 Date타입임
	private int boardWriter;
	
	
	
	
	public BoardEntity(int boardNumber, String boardTitle, String boardContents, Date boardDate, int boardWriter) {
		//super(); // 이 BoardEntity의 부모클래스는 Object클래스임 모든 클래스의 부모는 Object임
		this.boardNumber = boardNumber;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
		this.boardDate = boardDate;
		this.boardWriter = boardWriter;
	}
	
	// ** toString 메서드도 Generate로 생성해줌 
	// 오버라이드 메서드의 이름을 바꿔주면 넌 오버라이드한 애인데 이름을 바꿨다하고 빨간줄 에러를 냄
	@Override
	public String toString() {
		return "BoardEntity [boardNumber=" + boardNumber + ", boardTitle=" + boardTitle + ", boardContents="
				+ boardContents + ", boardDate=" + boardDate + ", boardWriter=" + boardWriter + "]";
	}









	public int getBoardNumber() {
		return boardNumber;
	}
	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public int getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(int boardWriter) {
		this.boardWriter = boardWriter;
	}

	
}
