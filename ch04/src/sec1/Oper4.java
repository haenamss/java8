package sec1;

public class Oper4 {
	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교 연산자(단항 연산자)
		System.out.println("a==b -> "+(a==b));	//false
		System.out.println("a>b -> "+(a>b));	//true
		System.out.println("a!=b -> "+(a!=b));	//true
		System.out.println("a>=b -> "+(a>=b));	//true
		System.out.println("a<b -> "+(a<b));	//false
		System.out.println("a<=b -> "+(a<=b));	//false
		System.out.println("a가 문자열인가 ? -> "+a instanceof String); //true - +a가 문자열이기 대문에 true가 뜸
		
		//논리 연산자 (이항 연산자)
		System.out.println("a>b && (c>d) -> "+(a>b && c>d));	// true
		System.out.println("a<b || (c>d) -> "+(a<b || c>d));	// true
		System.out.println("!(a>b) -> "+(!(a>b)));	// false
		
		//삼항 -> 조건 ?   true식 : false식
		System.out.println(a>=b ? "크거나 같다" : "작다" );
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(y);
		
		
		
	}	

}
