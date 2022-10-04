package hnm;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		Product pro = new Product();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제품 아이디 : ");
		pro.setPid(scan.next());
		System.out.println("제품명 : ");
		pro.setPname(scan.next());
		System.out.println("제품 구매 수량 : ");
		pro.setAmount(scan.nextInt());
		System.out.println("제품 구매 가격 : ");
		pro.setPrice(scan.nextInt());
		System.out.println("제품 이미지 : ");
		pro.setImg(scan.next());
		
		scan.close();
		System.out.println("*****************");
		System.out.println("제품 총 구매 가격 : "+pro.calcMoney());
		System.out.println("제품 등급 : "+pro.calcRank());
		System.out.println("*****************");
		pro.printProduct();
	 	
		

	}

}
