package Database.Entity;

public class BoardEntity {

	private Integer id;
	private String boardTitle;
	private String boardContent;
	private String boardDateTime;
	private Integer boardLike;
	private Integer boardWriter;

	public BoardEntity(Integer id, String boardTitle, String boardContent, String boardDateTime, Integer boardLike,
			Integer boardWriter) {
		this.id = id;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardDateTime = boardDateTime;
		this.boardLike = boardLike;
		this.boardWriter = boardWriter;
	}

	public Integer getId() {
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
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardDateTime() {
		return boardDateTime;
	}
	public void setBoardDateTime(String boardDateTime) {
		this.boardDateTime = boardDateTime;
	}
	public Integer getBoardLike() {
		return boardLike;
	}
	public void setBoardLike(Integer boardLike) {
		this.boardLike = boardLike;
	}
	public Integer getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(Integer boardWriter) {
		this.boardWriter = boardWriter;
	}

	@Override
	public String toString() {
		return "BoardEntity [id=" + id + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardDateTime=" + boardDateTime + ", boardLike=" + boardLike + ", boardWriter=" + boardWriter
				+ "]";
	}
}
