package sec2;
/*  ProductEx(제품관리)
	예시 데이터 : a01, 냉장고, 3, 80000, icetank01.jpg 를 객체의 필드값으로 입력받아 제품의 입고 처리를 한다.
	아이디, 제품명, 제품수량, 제품가격, 제품이미지을 출력하도록 한다.

 
 */



import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		
		System.out.println("제품코드 : ");
		p1.setPid(sc.next());
		System.out.println("제품수량 : ");
		p1.setAmount(sc.nextInt());
		System.out.println("제품가격 : ");
		p1.setPrice(sc.nextInt());
		System.out.println("제품이미지 : ");
		p1.setImg(sc.next());
		
		
		
		
		
		
		
		

		sc.close();
		
		
		
		
		
		
		
		Product pro1 = new Product();
		pro1.setPid("a01");
		pro1.setPname("냉장고");		
		pro1.setAmount(3);
		pro1.setPrice(80000);
		pro1.setImg("icetank01.jpg");
		pro1.printProduct();
		System.out.println("");

	}

}
