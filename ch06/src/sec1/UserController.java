package sec1;

public class UserController extends MemberController{ 
							//extend = 더 크게 만들다/ (사업,영향력 등을 )확장 하다.
	
	//오버라이딩
	@Override
	public void join(String id, String password, String name){
		System.out.println("아이디 : "+id);
	}
	
	//오버로딩 - 비슷한 일을 하지만 배개변수의 개수나 자료형이 다르다면 똑같은 이름으로 메서드를 정의하여 사용할 수 있다.
	public void join(String id, String password){
		System.out.println("비밀번호 : "+password);
	}
}