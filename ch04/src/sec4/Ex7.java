package sec4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean wow=true;
		int money=0;
		int balance=0;
		while(wow){
			System.out.println("------------------------");		
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------");	
			System.out.print("선택> ");
			int sys=sc.nextInt();
			switch(sys){
			case 1:
				System.out.println("예금액> ");
				money=sc.nextInt();
				balance=balance+money;
				break;
			case 2:
				System.out.println("출금액> ");
				money=sc.nextInt();
				balance=balance-money;
				break;
			case 3:
				System.out.println("잔고> "+balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				wow=false;
				break;
			default:
				System.out.println("system errer");
				
			}
		

	}

	}
}

