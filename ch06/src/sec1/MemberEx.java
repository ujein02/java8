package sec1;

public class MemberEx {

	public static void main(String[] args) {
		//클래스명 인스턴트명(소문자) = new 생성자함수(); - 생성자함수는 클래스의 이름과 동일해야함
		Member mem1 = new Member();
		mem1.setId("kkk");
		mem1.setPassword("1234");
		System.out.println("아이디 : "+mem1.getId());
		System.out.println("비밀번호 : "+mem1.getPassword());
		System.out.println("이름 : "+mem1.getName());
		
		Member mem2 = new Member("aaa","1111");
		System.out.println("아이디 : "+mem2.getId());
		
		Member mem3 = new Member("www","3333","이름");
		Member mem4 = new Member("qwe","4567","이름222","주소지");
		System.out.println("당신의 아이디 : "+mem3.getId());
		System.out.println("당신이 사는 곳 : "+mem4.getAddress());
		
		MemberController mc = new MemberController();
		mc.join("eee", "7777", "이름444");
		mc.info();
		mc.login("eee", "7777");
		mc.info();

	}

}
