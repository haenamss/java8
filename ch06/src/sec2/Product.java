package sec2;

public class Product {	
	//멤버필드 	
	
	//접근제한자		  //클래스명
	private String pid;
	private String pname;
	private int amount;
	private int price;
	private String img;
	
	
	// 중괄호 뒤에는 ;(세미콜론)안붙음  → 배열 뒤에만 붙음
	public Product(){}
	
	public Product(String pid, String pname){
		this.pid = pid; this.pname = pname;
	}
	public Product (String pid, String pname, int price){
		this.pid = pid; this.pname = pname; this.price = price;
	}
	//값을 집어넣는 setter 가져오는 getter
				  //메소드명
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public int calcMoney(){
		int money = amount * price ; //그냥 return amount * price 만 써도 됨 !!
		return money;		
	}
	public String calcRank(){
		String rank = "";		
		if(price>=100000){		
			rank = "고가";		
		}else if(price>=50000){
			rank = "중저가";
		}else{
			rank = "저가"	;		
		}
		return rank;		
	}
	public void printimg(){
		System.out.println("제품 이미지 : "+img);
	}
	public void printProduct(){
		System.out.println("제품 아이디 : "+pid);
		System.out.println("제품명 : "+pname);
		System.out.println("제품 수량 : "+amount);
		System.out.println("제품 가격 : "+price);
		System.out.println("제품 이미지 : "+img);
	}
	

}