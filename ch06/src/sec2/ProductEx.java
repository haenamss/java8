package sec2;

public class ProductEx {

	public static void main(String[] args) {
		Product pro = new Product();
		
		pro.setPid("a01");
		pro.setPname("냉장고");
		pro.setAmount(3);
		pro.setPrice(80000);
		pro.setImg("icetank01.jpg"); 
		pro.printProduct();
		
		System.out.println(pro.calcMoney());
		System.out.println(pro.calcRank());
	}

}
