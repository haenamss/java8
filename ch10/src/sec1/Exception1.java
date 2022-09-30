package sec1;

public class Exception1 {
	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());	//실행해야 할 문장
		} catch(NullPointerException e)		//NullPointerException : Null 처리에 대한 예외 발생
		{	
			System.out.println("널값은 문자열로 변경하여 출력할 수 없음"); //실행하다가 특정 예외가 발생시 처리 문장
		} catch(Exception e){
			System.out.println("알 수 어벗는 장애로 인하여 실행이 중지됨"); //실행하다가 장애 발생시 예외 클래스에 의해 처리해야 할 문장
		} finally {
			System.out.println("종료"); //장애(예외)의 발생 유/무와 관계 없이 반드시 실행 할 문장
		}
	}
}