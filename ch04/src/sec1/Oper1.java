package sec1;
//프로그램의 모든 명령은 Op-code(연산자) 와 Operand(피연산자)로 이루어지며 , 주소 (기억장소의 개수)에 따라 -주소 명령어 형식 ~ 3주소 명령어 형식 까지 있음
//입력항에 따라 단항(unary) 연산과 이항(binay)연산으로 분류 됨

//a = a + b;  //a와 b를 더하라는게 아니라 a 저장소와 b 저장소의 값을 더하라
//+ : 연산(명령) -> Op-code
//a 와 b는 기억장소의 이름 = 주소(Operand)
//boolean a=true;
//boolean b=!a;  (!은 not의 의미 이므로 b는 fals가 됨)

public class Oper1 {

	public static void main(String[] args) {
		int a=20, b=30, c;
		System.out.println(a);
		
		c = a + b;
		//운용방식 1 : +ab -> pre(fix) order (전위)
		//운용방식 2 : ab+ -> post(fix) order (후위)
		//운용방식3 : a+b -> in(fix) order (중위)
	
		
	
	}

}