package hnm;

public class Student {
	
	String name;  //필드에 선언된 name
	int kor = 90;
	int eng = 80;
	int mat = 90;
	
	/*calcTot//총점
	calcAvt3; //평균
	calcRes ; //평균이 90 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 나머지는 D로 반환함
	calcHac; //평균이 80 이상이면 '합격', 아니면 '불합격'
*/	
	
		
	//생성자 선언	
	public Student(){}
	public Student(String name){	//name은 생성자의 매개변수
		this.name = name;		//this 는 위에 매개변수 name을 필드에 선언된 name에 대입 시켜주라는 키워드이다.
	}							// this가 없으면 name 2개를 모두 매개변수로 인식 해버린다.
	public Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;		
	
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void calcTot(){
		System.out.println("총점 : "+kor+eng+mat);
		}
	
	public void calcAvg(){
		System.out.println("평균 : "+(kor+eng+mat)/3);		
		
		}
	
	public void calcHac(){
		
		
		
		
		
	}
	

	
		
		
		
	}
	
		


	
	
	
	

