package sec3;

public class DbEx {

	public static void main(String[] args) {
		Dbjob db;
		//회원 작업
		db = new DbMember();
		db.select();
		db.insert();
		db.update();
		db.delete();
		//게시판 작업
		System.out.println("----------");
		db = new DbBoard();
		db.select();
		db.insert();
		db.delete();
	}

}