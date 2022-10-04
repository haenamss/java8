package sec2;

public class Account {
	private String account;	//계좌번호
	private String owner;	//예금주
	private int balance;	//잔액
	private int money;		//입출금액
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//계좌 입금작업
	public void runDeposit(int money){	//balance 값에 반영될뿐 반환할 금액은 없으므로 retune 사용x void를 사용.
		this.balance+=money;			//필드에 있는 balance 값에 money값을 더해 준다.
	}//계좌 출금 작업
	public void runWithdraw(int money){		
		if(this.balance-money>0){	//잔액이 0이면 출금할 금액이 없으므로.
			this.balance-=money;	
		} else {
			System.out.println("잔액 부족 - 출금액이 잔액을 초과합니다.");
		}
	}
	public int runBlance(){		//잔액조회
		return balance;
	}
	public void printAccount(){ 		//해당 계좌의 계좌번호/예금주/잔액을 출력
		System.out.println("계좌번호 : "+account);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+balance);
	}
}