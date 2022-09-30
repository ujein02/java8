package sec3;

public class DbMember implements Dbjob {

	@Override
	public void insert() {
		System.out.println("insert into member values (?, ?, ?)");
	}

	@Override
	public void update() {
		System.out.println("update member set=? where id=?");
	}

	@Override
	public void delete() {
		System.out.println("delete from member where id=?");
	}

	@Override
	public void select() {
		System.out.println("select * from member where id=?");
	}
}