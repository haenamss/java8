package sec1;

public class Type2 {

	public static void main(String[] args) {
		//reference (참조형) type : 여러 개(다수)의 데이터를 저장하기 위한 기억장소로서 null값이 허용 됨.
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
		int[] arr3 = null;	
		//int a = null;			는  primitive type이므로 null일 수 없다.
		arr3[0] = 20;	//arr3 배열의 0번째 인덱스만 초기화 됨
		System.out.println(arr2[0]);
		

	}

}
