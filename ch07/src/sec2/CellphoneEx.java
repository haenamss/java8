package sec2;

public class CellphoneEx {

	public static void main(String[] args) {
		Cellphone p1 = new Cellphone();
		p1.powerOn();
		p1.bell();
		p1.hangIn();
		p1.sendVoice("여보세요...?");
		p1.recieveVoice("저 이해나라고 하는데요. 토리 있나ㅇ ㅕ ?");
		p1.hangOut();
		p1.powerOff();

	}

}
