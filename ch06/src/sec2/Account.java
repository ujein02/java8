package sec2;

public class Account {
	private String account;
	private String ower;
	private int blance;
	private int money;
	
	
	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getOwer() {
		return ower;
	}


	public void setOwer(String ower) {
		this.ower = ower;
	}


	public int getBlance() {
		return blance;
	}


	public void setBlance(int blance) {
		this.blance = blance;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public void runDeposit(int money){
		this.blance+=money;
	}
	public void runWithdraw(int money){
		if(this.blance-money>0){
			this.blance-=money;	
		} else {
			System.out.println("잔액 부족 - 출금액이 잔액을 초과합니다.");
		}
	}
	public int runBlance(){
		return blance;
	}
	public void printAccount(){
		System.out.println("계좌번호 : "+account);
		System.out.println("예금주 : "+ower);
		System.out.println("잔액 : "+blance);
	}
}