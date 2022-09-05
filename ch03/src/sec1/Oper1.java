package sec1;
// 프로그램(Operation)의 모든 명령은 Op-code(연산자) 와 Operand(피연산자)로 이루어짐
// 주소(기억장소의 개수)에 따라 0주소 명령어 형식~ 3주소 명령어 형식
//입력항에 따라 단항 연산(unary)과 이항 연산(binary)으로 분류됨
//연산의 종류에 따라 산술, 논리, 비교, 비트, 증감, 조건, 쉬프트, 대입
//boolean a=true;
//boolean b=!a;
//int c=a*b; 이항연산
// a = a + b;
//+ : 연산(명령) -> Op-code
//a, b -> Operand (주소) a라는 기억장소 ... 제2주소 명령어형식
public class Oper1 {

	public static void main(String[] args) {
		int a=20, b=30, c;		// = 대입연산, b에 30을 대입, 대입연산자 우선순위가 낮음
		System.out.println(a); //제1주소 명령어형식
		prt(); //제0주소 명령어형식 ~ 3주소 명령어형식까지 있음
		c = a + b;
			// 운용방식1 : +ab ->pre(fix) order(전위)
			// 웅용방식2 : ab+ ->post(fix) order(후위)
			// 운용방식3 : a+b ->in(fix) order(중위)
	}

		
		public static void prt (){
				System.out.println("data");
		}
}
