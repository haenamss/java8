package hnm;

import java.util.Scanner;


public class HnEx {
	public static void main(String[] args) {
		Hn hn = new Hn();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제품 아이디 : ");
		hn.setPid(scan.next());
		System.out.println("제품명 : ");
		hn.setPname(scan.next());
		System.out.println("제품 구매 수량 : ");
		hn.setAmount(scan.nextInt());
		System.out.println("제품 구매 가격 : ");
		hn.setPrice(scan.nextInt());
		System.out.println("제품 이미지 : ");
		hn.setImg(scan.next());
		
		scan.close();
		System.out.println("*****************");
		System.out.println("제품 총 구매 가격 : "+hn.calcMoney());
		System.out.println("제품 등급 : "+hn.calcRank());
		System.out.println("*****************");
		hn.printProduct();
	 	
		
		
	}
	
		
	
		}
	
		
	


