package sec2;

public class DmbphoneEx {

	public static void main(String[] args) {
		Cellphone p1 = new Cellphone();
		Cellphone p2 = new Dmbphone();
		//Dmbphone p3 = new Cellphone();
		Dmbphone p4 = new Dmbphone();
		System.out.println(p1.COMPANY);
		System.out.println(p2.COMPANY);
		System.out.println(p4.COMPANY);
		p1.powerOn();
		p2.powerOn();
		p4.powerOn();
		//부모클래스로부터 유도된 객체는 자식클래스로부터 유도된 객체의 내용으로 변환될 수 있음.
		p1 = p4; //자동 형변환
		//자식클래스로부터 유도된 객체는 부모클래스로부터 유도된 객체의 내용으로 자동 변환되지 않음
		//그러므로 강제 형변환하면 형변환이 가능.
		Dmbphone p6;
		p6 = (Dmbphone) p2; //강제형변환
		
	}

}
