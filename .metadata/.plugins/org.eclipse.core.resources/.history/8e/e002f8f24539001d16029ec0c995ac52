package sec2;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car("롤스로이스", "가솔린", 4000);
		car1.bootUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		System.out.println("현재 속도 : " +car1.speedinfo());
		car1.speedPrint();
		car1.speedDown();
		for(int i=0;i<100;i++){
			car1.speedDown();
		}
		System.out.println("현재 속도 : "+car1.speedinfo());
		car1.bootOff();
		System.out.println("최고 속도 : "+Car.MAX_Speed); //static이 달린것은 값이 변하지 않으므로 인스턴스(car1.)가 아닌 클래스(Car.)기재
		System.out.println("최저 속도 : "+Car.MIN_speed);
		
		Car car2; //인스턴스 선언
		car2 = new Car();	//인스턴스 생성
		car2.setName("");
		
		

	}

}
