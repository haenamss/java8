package sec2;

public class AccountEx {
	public static void main(String[] args) {
		Account acc = new Account();
		//acc1.setBalance(0);
		acc.setAccount("212-12-465897");
		acc.setOwner("김기태");
		acc.runDeposit(150000);
		acc.runWithdraw(90000);
		System.out.println("잔액조회 : "+acc.runBlance());
		acc.runDeposit(200000);
		acc.printAccount();
	}
}