package hnm;

public class Product {
	String pid;
	String pname;
	int amount;
	int price;
	String img;	
	
	Product(){}	
	Product(String pid, String pname){this.pid = pid; this.pname = pname;}
	
	public Product(String pid, String pname, int amount, int price) {
		this.pid = pid;	this.pname = pname;	this.amount = amount; this.price = price;
	}
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
		return amount*price;
	}
	public String calcRank(){
		String rank="";
		if(this.price>=100000){
			rank="고가";
		}else if(this.price>=50000){
			rank="중저가";
		}else{
			rank="저가";
		}return rank;
	}
	public void printImg(){
		System.out.println("제품 이미지 : "+img);
	}
	public void printProduct(){
		System.out.println("제품 아이디 : "+pid);
		System.out.println("제품명 : "+pname);
		System.out.println("제품수량 : "+amount);
		System.out.println("제품 가격 : "+price);
		System.out.println("제품 이미지 : "+img);
	}
	
	}
	
	
	

