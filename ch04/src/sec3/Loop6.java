package sec3;

public class Loop6 {

	public static void main(String[] args) {
		int tot=0;
		for(int i=0;i<=100;i++){	//101번 실행
			if(i%2==1) continue;
			tot+=i;		//50번 연산
		}
		System.out.println("0~100 짝수의 합계 : "+tot);
		
		//i+=2	==		i=i+2
		tot = 0;
		for(int i=0;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100 짝수의 합계2 : "+tot);
		
		tot=0;
		for(int i=1;i<=100;i+=2){
			tot+=i;
		}
		System.out.println("0~100 홀수의 합계 : "+tot);
		
		int n=1;
		tot=0;
		for(;;){
			if(n>100) break;
			tot+=n;
			n+=2;
		}
		System.out.println("0~100의 홀수의 합계2 : "+tot);

	}

}
