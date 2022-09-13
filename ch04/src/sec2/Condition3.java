package sec2;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		//성명과 세 과목(전산,PG,DB)의 점수를 입력받은 후
		//판정은 세 과목의 점수가 모두 70점 이상이면, "합격" 아니면 "탈락" 이며
		//평균은 세 과목의 점수의 합계에서 3으로 나눈 값으로 하되, 소수점 이하 까지 표시 될 수 있도록 실수로 구하고
		//비고는 세 과목 중에서 어느 하나라도 90점 이상이 있으면, "과목우수" 로 하고, 아니면 공백으로 구함
		//아래와 같은 형태로 출력 될 수 있도록 할 것.
		Scanner sc = new Scanner(System.in);
		System.out.println("성명: ");
		String name = sc.next();
		System.out.println("전산 점수 : ");
		int jum = sc.nextInt();
		System.out.println("PG 점수 : ");
		int pgs = sc.nextInt();
		System.out.println("DB 점수 : ");
		int dbs =sc.nextInt();
		

		String pan="";
		if(jum>=70 && pgs>=70 && dbs>=70){
			pan="합격";
		} else {
			pan="불합격";
		}
		
		int tot = jum+pgs+dbs;
		float aver = (float)tot / 3;
		
		String wow = "";
		if(jum>=90 || pgs>=90 || dbs>=90) wow="과목우수";
				
				//입력값 예시
				//성명 : 이해나
				//전산점수 : 80
				//PG점수 : 95
				//DB점수 : 75
				
				//출력 예시
				//이해나님의 총점은 250점이며, 평균은 83.333....이고, 합격 하셨으며, 비고는 과목우수 입니다.
		
		System.out.println(name+"님의 총점은 "+tot+"점 이며, 평균은 "+aver+"이고, "+pan+"하셨으며, 비고는 "+wow+"입니다.");
		}
					
		

	}


