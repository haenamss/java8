package sec2;
<<<<<<< HEAD
//throws는 예외 떠넘기기
public class Throw1 {
	public static void main(String[] args) {
		String name = null;
		nullPassing(name);
		
		int[] arr = new int[3];
		arrayPassing(arr);
		
		String data = "kim1004";
		try {
			int val1 = Integer.parseInt(data);
			System.out.println(val1);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	static void arrayPassing(int[] arr) throws
		ArrayIndexOutOfBoundsException, NullPointerException {
		for(int i=0;i<5;i++){
			arr[i] = i*10;
		}
	}
	static void nullPassing(String data) throws NullPointerException{
		System.out.println(data);
	}
}
=======

public class Throw1 {

	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i=0; i<=2; i++){
			try{
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("인덱스를 초과했음");
			}catch (NumberFormatException e){
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
	}

}
>>>>>>> db9e725a3ad8a9711ddd77396374e3e2560ac98e
