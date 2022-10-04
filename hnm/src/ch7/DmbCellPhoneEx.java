package ch7;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dmbcell = new DmbCellPhone("SAMSUNG", "blackPink", 3);
		//CellPhone에서 상속받은 필드
		System.out.println("모델명 : "+dmbcell.model);
		System.out.println("색상 : "+dmbcell.color);		
		//DmbCellPhone의 필드
		System.out.println("채널 : "+dmbcell.channel);
		System.out.println("************************");
		
		//CellPhone에서 상속받은 메소드 호출
		dmbcell.powerOn();
		dmbcell.powerOff();
		dmbcell.sendVoice("안녕하세요 이해나라고 하는데요");
		dmbcell.receiveVoice("바나나가 왜 노란색인줄 아니 ?");
		dmbcell.hangUp();
		System.out.println("************************");
		
		//DmbCellPhone의 메소드 호출
		dmbcell.turnOnDmb();
		dmbcell.changeChannelDmb(12);
		dmbcell.turnOffDmb();
		
		
		
		
		}
		
		

	}



