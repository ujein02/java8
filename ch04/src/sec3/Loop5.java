package sec3;

public class Loop5 {

	public static void main(String[] args) {
		//역 반복(역for문, 역while문) : 감소
		int[] k = {90, 70, 80, 60};
		for(int i=k.length-1;i>=0;i--){
			System.out.println(i+"번째 점수 : "+k[i]);
			
		}
		System.out.println("***************************************");
		int n=k.length-1;
		while(n>=0){
			System.out.println(n+"번째 점수 : "+k[n]);
			n--;	//n=n-1
		}

	}

}
