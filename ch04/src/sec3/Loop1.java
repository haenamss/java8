package sec3;

public class Loop1 {

	public static void main(String[] args) {		
		int[] data = {90,80,75,70,65,60,55,50,45,40}; //정수를 담을 수 있는 여러개의 그릇  data[0]~data[9]
					//[0]~~~~~~~~~~~~~~~~~~~~~~~~[9]
		int tot = 0;
			//시작점 	//0~9 //+1씩       0에 해당하는 값 90부터 9에 해당하는 값까지 순차적으로 더해줌
		for(int a=0;a<10;a++){
			tot=tot+data[a];
		}
		System.out.println(tot);
		
		for(int a=0;a<data.length;a++){
			System.out.println(a+"번째 사람의 점수 : "+data[a]);
			tot=tot+data[a];	//누산
		}
		double avg = (float) tot / data.length;
		System.out.println("전체 총점 : "+tot+", 전체평균 : "+avg);

	}

}
