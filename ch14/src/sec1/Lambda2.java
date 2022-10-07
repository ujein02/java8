package sec1;

import java.util.Scanner;

//함수적 인터페이스 - 하나의 인터페이스는 하나의 메소드만 추상체로 정의할 수 있음
@FunctionalInterface
interface Calc1 {	//매개변수X, 리턴X
		public void method1();
}

@FunctionalInterface
interface Calc2 {	//매개변수O, 리턴X - Consumer
	public void method2(int x, int y);
}

@FunctionalInterface
interface Calc3 {	//매개변수X, 리턴O - Supplier
	public int method3();
}

@FunctionalInterface
interface Calc4 {	//매개변수O, 리턴O - Operator
	public int method4(int x, int y);
}

public class Lambda2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calc1 f1 = () -> { 
			System.out.print("숫자1 : ");
			int a = sc.nextInt();
			System.out.print("숫자2 : ");
			int b = sc.nextInt();
			System.out.println("최대값 : "+(a>b ? a : b));
		};
		f1.method1();
		
		Calc2 f2 = (x, y) -> { 
			int a = (x>y ? x : y);
			System.out.println("최대값 : "+a); 
		};
		f2.method2(20, 18);
		
		Calc3 f3 = () -> {
			System.out.print("숫자1 : ");
			int a = sc.nextInt();
			System.out.print("숫자2 : ");
			int b = sc.nextInt();
			return a>b ? a : b; 
		};
		
		int data3 = f3.method3();
		System.out.println("최대값 : "+data3);
		
		//인터페이스명  객체명  = (매개변수) -> 리턴값
		Calc4 f4 = (x, y) -> x>y ? x : y;	//구현체 등록
		int data4 = f4.method4(20, 18);
		System.out.println("최대값 : "+data4);
	}
}