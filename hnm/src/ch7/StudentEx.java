package ch7;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student("이해나", "901206-2111111" ,27 );
		//부모 필드 People에서 상속받은 필드
		System.out.println("name : "+stu.name);
		System.out.println("ssn : "+stu.ssn);
		//Student 필드
		System.out.println("studentNo : "+stu.studentNo);
	}

}
