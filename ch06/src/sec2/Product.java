package sec2;
/*	Product(제품)
	pid 문자  //제품아이디
	pname 문자	//제품명
	amount 숫자	//제품수량
	price 숫자		//제품가격	
	img 문자		//제품이미지

	객체(인스턴스) 생성시에는 
		1. 매개변수가 없는 경우
		2. 매개변수가 pid, pname이 있는 경우
		3. 매개변수가 pid, pname, amount, price가 있는 경우

	모든 멤버 필드는 게터/세터를 갖는다.

	사용자 정의 메서드에는
		calcMoney 로서 판매금액인 amount*price 를 계산하여 반환함
		calcRank 로서 제품가격이 100000 이상이면 고가, 50000이상이면 중저가, 나머지는 저가로 반환함
		printImg 로서 이미지 값을 출력
		printProduct 제품의 아이디, 제품명, 제품수량, 제품가격, 제품이미지 를 출력
*/

public class Product {
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	public Product(){ }
	public Product(String pid,String pname){this.pid=pid; this.pname=pname;}
	public Product(String pid,String pname, int amount, int price)
	{this.pid=pid; this.pname=pname; this.amount=amount; this.price=price;}
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int calcMoney(){
		return amount*price;
	}
	
	public String calRank(){
				
		String rank="";
		
		if(price>=100000){
			rank="고가";
		} else if(price>=50000){
			rank="중저가";
		} else{
			rank="저가";
		}
		return rank;
	}
	
	
	
	
	public void printImg(String img){
		System.out.println("이미지 출력 : "+img);
	}
	
	
	public void printProduct(){
		System.out.println("제품 아이디 : "+pid);
		System.out.println("제품명 : "+pname);
		System.out.println("제품수량 : "+amount);
		System.out.println("제품가격 : "+price);
		System.out.println("제품이미지 : "+img);
		
	}

}
