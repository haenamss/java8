package sec1;
/* 변수(Variable) : 컴퓨터는 작업에 필요한 데이터를 메모리에 저장하게 되는데 개발자가 프로그램을 처리하기 위해서 필요한 데이터를 중간 중간 메모리에 저장해야 한다.
그러나 그 위치를 모르면 저장된 값을 가져 갈 수 없으므로,자료의 저장 위치를 나타내는 이름이 필요하다. 그것을 변수명(변수)이라고 한다. */
public class Var01 {
	public static void main(String[] args) {
		//변수 선언 : 기억장소르 선언하는 것으로 변수명과 자료형이 같이 정의되어야 함.
		int a=10, b=20, c=30; // 초기화 = 자주색으로 표시되는 것들(예약어)은 반드시 초기에 값을 입력해야 함. 안하면 오류가 일어남.
		char d='a', e='b'; // char = 문자 변수  ''로 열고 닫아야 함.
		String f="lee", g="hae", k="na"; // String = 문자열 변수 ""로 열고 닫아야 함.
		float h=3.14f, i=0.25f; // float = 실수형 변수
		
		//변수명 규칙
		/* 필수 조건
		 * 예약어(Reserved word)와 키워드는 변수명으로 사용할 수 없다.
		 * 첫 번째 글자는 반드시 문자로 시작하거나, 특수문자인 $ 또는 _로 시작해야만 한다.
		 * 영문 대문자와 소문자로 된 변수명은 서로 다르게 인식 된다. int = m 과 int = M 은 다르게 인식 됨.
		 * 변수명 중간에는 공백과 $,_르 제외한 특수문자가 올 수 없다. 
		 * 상수는 일반적으로 모두 대문자로 지정한다.
		 * 
		 * 그 외 관례
		 * 누구나 저장된 데이터나 역할이 유추할 수 있도록 이름을 지정한다.
		 * 여러 단어를 합성한 변수명은 첫 번째 단어는 모두 소문자로 하고, 두 번째 단어의 첫 번째 글자는 대문자로 지정한다. ex)classEngPoint → 카멜방식
		 * 여러 단어를 합성한 변수명은 단어 사이 사이에 _(언더스코어) 로 연결한다. class_eng_point →언더스코어 방식
		 */
		
		
	}

}