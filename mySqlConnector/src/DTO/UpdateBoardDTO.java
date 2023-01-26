package DTO;

public class UpdateBoardDTO {
	
	private Integer id; 
	private String boardTitle;
	private String boardContents;
	private String boardDateTime;
	private int boardLie;
	private Integer boardWriter;
	
	
	public UpdateBoardDTO(Integer id, String boardTitle, String boardContents) {
		this.id = id;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
	}
	
	
	
	public UpdateBoardDTO(Integer id, String boardTitle, String boardContents, String boardDateTime, int boardLie,
			Integer boardWriter) {
		
		this.id = id;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
		this.boardDateTime = boardDateTime;
		this.boardLie = boardLie;
		this.boardWriter = boardWriter;
	}

	
	@Override
	public String toString() {
		return "UpdateBoardDTO [id=" + id + ", boardTitle=" + boardTitle + ", boardContents=" + boardContents
				+ ", boardDateTime=" + boardDateTime + ", boardLie=" + boardLie + ", boardWriter=" + boardWriter + "]";
	}




	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getBoardDateTime() {
		return boardDateTime;
	}
	public void setBoardDateTime(String boardDateTime) {
		this.boardDateTime = boardDateTime;
	}
	public int getBoardLie() {
		return boardLie;
	}
	public void setBoardLie(int boardLie) {
		this.boardLie = boardLie;
	}
	public int getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(Integer boardWriter) {
		this.boardWriter = boardWriter;
	}
	
	
}
