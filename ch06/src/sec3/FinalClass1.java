package sec3;

public class FinalClass1 {
	final static double PI = 3.14;		//멤버 상수
	static final byte MIN_VALUE = 0;	//값이 0으로 정해져 있으므로 최소단위 byte 로 표기 . 상수는 대문자로 선언 할 것
	static final byte MAX_VALUE = 100;
	final static double CIRCLE_LENGTH(){  //항상 같은 결과를 얻는 method.
		return PI*100;
	}
}
