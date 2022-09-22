package sec2;

import java.util.Date;

public class Board {
	private int no;
	private String title;
	private String content;
	private String writer;
	private Date resDate;
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getResDate() {
		return resDate;
	}
	public void setResDate(Date resDate) {
		this.resDate = resDate;
	}
	
	//boardWrite(게시글 쓰기 작업) 은 글번호, 글제목, 글내용, 작성자, 작성일을 입력받아 저장한다.
	
	public void boardWrite(int no, String title, String content, String writer, Date resDate ){
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.resDate = resDate;
	}
	
	//boardUpdate(게시글 수정 작업) 은 글번호, 글제목, 글내용 등을 매개변수로 받아 해당 글번호의 글을 수정할 수 있다.
	
	public void boardUpdate(int no, String title, String content){
		if(no==this.no){
			this.title = title;
			this.content = content;
		}
	}
	
	//boardDelete(게시글 삭제 작업) 은 글번호를 입력받아 해당 글번호에 데이터를 삭제 또는 초기화할 수 있다.
	
	public void boardDelete(int no){
		if(no==this.no){
			try {
				this.finalize();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		}
		//if(no==this.no)
		//	this.content = "";
		//	this.title = "";
		//	this.Writer = "";		=> no=no같다면 내용/타이틀/작가 = ""; 로 초기화
	}
	
	//boardSearch(게시글 검색 작업) 글번호 등을 매개값으로 받아 해당 글번호에 글의 모든 내용을 출력할 수 있다.

	public void boardSearch(int no){
		if(no==this.no){
			System.out.println(this.no+"\t"+this.title+"\t"
					+this.content+"\t"+this.writer+"\t"+this.resDate);
		}
	}
	
}
