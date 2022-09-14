package sec3;

public class Loop3 {

	public static void main(String[] args) {
/*		반복변수=초기값;	1
		do {		
			실행문장;	2
			증감식;	3
		} while(조건식);	4
		1 2 3 4 순서대로 실행되다가 조건이 만족하는 동안 2 3 4를 반복수행
		그러므로 실행부터 하고, 조건을 나중에 비교하므로 최소 1번 이상 실행하게됨
		
		<< do-while문 무조건 한번 이상 실행. 한번이상 실행이 필요한 경우 사용
*/
		int a=10, tot=0;
		do {
			tot=tot+a;
			a++;
		} while(a<10);
		System.out.println("a="+a+", tot="+tot);
	}

}
