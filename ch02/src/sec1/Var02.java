package sec1;

public class Var02 {	//scope : 인지되는 범위나 시기
	int a=10, b=20, d=30; //전역 변수 - 현재 클래스 내부에서 어디서든지 인식
	
	public static void main(String[] args) {
		int a=100, b=200, c=300; //지역 변수 - 현재 메서드 안에서만 인식
		
	}
}
