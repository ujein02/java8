package sec4;

public class Ex3 {

	public static void main(String[] args) {
				//1번
				//조건문 : (if), (switch)
				//반복문 : (for), (while), (do~while)

				//2번
				//2) double 타입은 변수타입으로 사용할 수 없다.
				//1.6 이하는 byte, char, short, int, long 기준변수의 타입이 가능
				//1.7 이상에서는 String 기준변수의 타입이 추가됨
				int res=0;
				for(int i=0;i<=100;i+=3){
					res+=i;
				}
				System.out.println("3의 배수의 합계 : "+res);

				res=0;
				int i=0;
				while(i<=100){
					res+=i;
					i+=3;
				}
				System.out.println("3의 배수의 합계2 : "+res);

				res=0;
				for(int a=0;a<=100;a++){
					if(a%3==0) res+=a;
				}
				System.out.println("3의 배수의 합계3 : "+res);

				res=0;
				for(int a=0;a<=100;a++){
					if(a%3!=0) continue;
					res+=a;
				}
				System.out.println("3의 배수의 합계4 : "+res);
			}
		}
