package sec1;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교연산자 (==,!=,>,>=,<,<=)  -> true 또는 false로 결과가 산출됨
		//== 같다(이다
		//!= 같지 않다(다르다)
		//> 크다(초과==후) 9월6일 후 (포함X)
		//>= 크거나 같다(이상==이후) 9월6일 이후 (포함o)
		//< 작다(미안=전)
		//<=작거나 같다(이하==이전)
		System.out.println("a==b => "+(a==b)); //a와 b가 같은가? F
		System.out.println("a!=b => "+(a!=b)); //T
		System.out.println("a>b => "+(a>b)); //T
		System.out.println("a>=b => "+(a>b)); //T
		System.out.println("a<b => "+(a<b)); //F
		System.out.println("a<=b => "+(a<=b)); //F
		System.out.println("a가 문자열이 맞나? => "+a instanceof String); //T 
		//논리 연산자(이항 연산)
		//	입력1		입력2		a>b && c>d		a>b || c>d
		//	 0		 0			0				0
		//	 0		 1			0				1
		//	 1		 0			0				1
		//	 1		 1			1				1
		
		//논리 연산자(단항 연산)
		//입력		!(a>b)
		//0				1
		//1				0
		System.out.println("a>b && c>d => "+(a>b && c<d));	//F
		System.out.println("a<b || c<d => "+(a>b || c<d));	//T
		System.out.println("!(a>b) =>" +(!(a>b)));	//F
		
		//삼항=> 조건 ? 참일때식 : 거짓일때식
		System.out.println(a>=b ? "크거나 같다 " : "작다");
	}

}
