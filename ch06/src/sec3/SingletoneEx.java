package sec3;

public class SingletoneEx {

	public static void main(String[] args) {
		// Singletone single1 = new Singletone();       private 타입이라 에러남
	Singletone single1 = Singletone.getInstance();
	Singletone single2 = Singletone.getInstance();
	Singletone single3 = Singletone.getInstance();
	
	System.out.println(single1);		
	System.out.println(single2);
	System.out.println(single3);
	
	if(single1==single2){		//같은 주소를 사용하므로 true 
		System.out.println("single1은  single2이다.");
	}else{
		//같ㅌ은 주소를 사용하므로 
	}

	}
}

