package Overriding;

public class ChildEx {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.ParentA();
		//System.out.println(c.childD);  자식 코묻은돈 못 씀....
				
		
		Child c = new Child();
		c.ParentA();			//자식새끼는 부모꺼 막 갖다 쓸 수 있음...심지어 지맘대로 바꿈.
		c.ParentB();
		System.out.println(c.parentC);
	
		
	}

}
