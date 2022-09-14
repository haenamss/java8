package 
sec2;

import java.util.Scanner;

public class hnmnote {

	public static void main(String[] args) {
	//작업할 번호 (1-입금, 2-출금, 3-잔액조회, 기타-종료)[1-9] : 
		
		Scanner sc = new Scanner(System.in);
		
		boolean bank = true;
		
		int money = 0, balance = 0;
		
		while(bank){
			System.out.println("1-입금, 2-출금, 3-잔액조회, 기타-종료) [1-9]");
			int job = sc.nextInt();
			switch(job){
			case 1 :
				System.out.println();
			}
		}
		
	}
}
