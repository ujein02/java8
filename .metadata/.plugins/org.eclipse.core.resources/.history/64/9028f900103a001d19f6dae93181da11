package sec2;

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
		int pr=this.price();
		if(pr>=100000){
			rank="고가";
		} else if(pr>=50000){
			rank="중저가";
		} else{
			rank="저가";
		}
		return rank;
	}
	
	public void printImg(String img){
		System.out.println("이미지 출력 : "+img);
	}
	
	
	public void printProduct(String pid, String Pname, int amount, int price, String img){
		
	}

}
