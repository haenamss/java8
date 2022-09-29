package sec3;

public class Singletone {
	//싱글톤 : 자바 디자인 패턴 중에서 오로지 하나의 객체만 생성할 수 있도록 하는 객체 지향 프로그래밍 패턴 
	private static Singletone single = new Singletone(); //싱글톤 생성
	private Singletone(){} 									//싱글톤 생성
	static Singletone getInstance(){	//반환형
		return single;
		
	}
}
