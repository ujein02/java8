package sec1;
/*
부모 클래스  -> 자식 클래스 : 자식클래스 extends 부모클래스
부모 인터페이스 -> 자식 클래스 : 자식클래스  implements 부모인터페이스1[,부모인터페이스2]
부모 클래스 -> 자식 인터페이스 (X)
부모 인터페이스 -> 자식 인터페이스 : 부모인터페이스 extends 자식인터페이스   	
*/
public class Class2 implements Interface2 {

	@Override
	public void method1() { }

	@Override
	public int method2(int pa1, String pa2) { return 0; }

	@Override
	public void method5() {}

	@Override
	public int method6(String a) {	return 0;	}
}