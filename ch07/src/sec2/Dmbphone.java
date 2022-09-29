package sec2;

public class Dmbphone extends Cellphone {
	int ch;
	final static String COMPANY = "애플";
	
	/*부모클래스인 cellPhone에서 final static 으로 정의 하였으므로 오버라이딩 할 수 없음.
	final static public void powerOn(){System.out.println("휴대폰의 전원을 켭니다.");
	final static public void powerOff(){System.out.println("후대폰의 전원을 끕니다.");*/
	
	public int channel1Display(){
		return ch;
	}
	public void channelDown(){
		ch--;
	}
	public void channerUp(){
		ch++;
	}
}
