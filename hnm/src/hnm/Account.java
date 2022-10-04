package hnm;

import java.util.Scanner;

public class Account {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money,balance=0;
		boolean cham = true;
		while(cham){
			System.out.println("**************************");
			System.out.println("1.입금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("**************************");
			System.out.println("선택 > ");
			money = sc.nextInt();
			switch(money){
			case 1 :
				System.out.println("입금할 금액을 입력하세요.");
				money = sc.nextInt();
				balance = balance + money;
				System.out.println(balance+"원이 입금 되었습니다.");
				break;
			case 2:
				System.out.println("출금할 금액을 입력하세요.");
				money = sc.nextInt();
				if(balance-money>0){					
				balance = balance - money;
				System.out.println(balance+"원이 출금 되었습니다.");
				}else{
					System.out.println("잔액이 부족합니다.\n다시 시도 해주세요.");
				}				
				break;
			case 3:
				System.out.println("현재 잔액은 "+balance+"원 입니다.");
				break;
			case 4:
				System.out.println("시스템이 종료 되었습니다.");
				cham = false;
				break;
			default : 
				System.out.println("잘못된 접근 방식입니다.");
			}
			
			
			
		}
		
		
		
	}

}
	
	