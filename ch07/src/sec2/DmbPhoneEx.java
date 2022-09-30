package sec2;

public class DmbPhoneEx  {
	
	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		CellPhone p2 = new DmbPhone();
		//DmbPhone p3 = new CellPhone();
		DmbPhone p4 = new DmbPhone();
		System.out.println(p1.COMPANY);
		System.out.println(p2.COMPANY);
		System.out.println(p4.COMPANY);
		p1.powerOn();
		p2.powerOn();
		p4.powerOn();
		//부모클래스로부터 유도된 객체는 자식클래스로부터 유도된 객체의 내용으로 변활될 수 있음
		p1 = p4;	// 자동 형변환
		//자식클래스로부터 유도된 객체는 부모클래스로부터 유된 객체의 내용으로 자동 변환되지 않음. 그러므로 강제 형변환하면 형 변환을 할 수 있음
		DmbPhone p6;
		p6 = (DmbPhone) p2; // 강제 형변환
		

	}

}
