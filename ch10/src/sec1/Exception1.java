package sec1;
<<<<<<< HEAD
//예외(Exception) 처리 : 프로그래밍에서 로직상 에러가 발생하면, 작동이 중지가 되버리기 때문에
//이와 같은 경우를 예외가 발생한 것으로 간주하고, 그 발생된 장애를 미리 예측하여 작동이 중지되지 않고,
//계속 실행될 수 있도록 처리를 하는 것
//NullPointerException : Null 처리에 대한 예외 발생
=======

>>>>>>> db9e725a3ad8a9711ddd77396374e3e2560ac98e
public class Exception1 {
	public static void main(String[] args) {
		String data = null;
		try {
<<<<<<< HEAD
			//실행해야할 문장
			System.out.println(data.toString());
		} catch(NullPointerException e){
			//실행하다가 특정 예외가 발생시 처리 문장
			System.out.println("널 값은 문자열로 변경하여 출력하지 못함");
		} catch(Exception e){
			//실행하다가 장애 발생시 예외 클래스에 의해 처리해야할 문장
			System.out.println("알 수 없는 장애로 인하여 실행이 계속되지 못함");
		} finally {
			//장애(예외)의 발생유무와 관계없이 반드시 실행할 문장
			System.out.println("종료");
=======
			System.out.println(data.toString());	//실행해야 할 문장
		} catch(NullPointerException e)		//NullPointerException : Null 처리에 대한 예외 발생
		{	
			System.out.println("널값은 문자열로 변경하여 출력할 수 없음"); //실행하다가 특정 예외가 발생시 처리 문장
		} catch(Exception e){
			System.out.println("알 수 어벗는 장애로 인하여 실행이 중지됨"); //실행하다가 장애 발생시 예외 클래스에 의해 처리해야 할 문장
		} finally {
			System.out.println("종료"); //장애(예외)의 발생 유/무와 관계 없이 반드시 실행 할 문장
>>>>>>> db9e725a3ad8a9711ddd77396374e3e2560ac98e
		}
	}
}