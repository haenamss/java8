package sec1;

public class Oper5 {
	public static void main(String[] args) {
		
		//비트(2진) 연산
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d -> "+e);	//2진수 and
		System.out.println("c | d -> "+f);	//2진수 or
		System.out.println("~(c & d) -> "+g);	//2진수 보수
		System.out.println("c ^ d -> "+h);	// 베타적OR(eXclusive OR) - c와 d 의  2진수가 겹치는 것만 1
		System.out.println("d >> 2 -> "+(d >> 2)); // 오른쪽 시프트(Shirt)
		System.out.println("d << 2 -> "+(d << 2)); // 왼쪽 시프트(Shirt)
		System.out.println("d >>> 2 -> "+(d >>> 2)); // 오른쪽 이중시프트
		System.out.println("d <<< 2는 존재하지 않음 ");	// 왼쪽 이중시프트는 연산자가 없음(오류)
		
		//연산시 부정과 불능 그리고 예외처리
		//System.out.println(a / 0);	//Not a Number -> NaN(부정)
		//System.out.println("k" / 0 );	// 문자열은 나누기 불기
		//System.out.println('k' / 4 );	// 문자는 나누기 가능
		//System.out.println(a % 0);	//Infinity(불능)
		try {  //예외처리
			int k = 20;
			System.out.println(a / 0);		//실행해야 할 구문
		} catch(ArithmeticException e1){
			System.out.println("산술연산자에 오류가 존재함"); //실행해야 할 구문이 오류 발생시 처리
			//el.printStackTrace();
			
			
		}
		
			
	}

}