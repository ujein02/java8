package sec4;

public class Ex6 {

	public static void main(String[] args) {
		for(int a=0;a<5;a++){
			for(int b=0;b<=a;b++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");

		for(int a=0;a<5;a++){
			for(int b=0;b<5-a;b++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("\n");

		for(int a=0;a<5;a++){
			for(int b=5;b>a;b--){
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}