package co.edureka;
class Material {
	Material(){
		System.out.println("It is the material");
	}
}

class Product{
	//private int id;
	int id;
	String name;
	int price;
	
	void product() { //default constructor
		System.out.println(">>> Product object Constructor");
	}
	
	void setProductDetails(int id,String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
		System.out.println(">>> Data written in Product object");
	}
	void showProductDetails() {
		System.out.println("---------Product ID: "+id+" ----------");
		System.out.println("Name:\n"+name);
		System.out.println("Price:\n"+price);
		System.out.println("----------------------------------------");
	}
	
	void setId(int id) {
		this.id=id;
		// left hand side object and rhs belong to method
	}
	
	int getId() {
		return id;
	}
	
}

class Mobile extends Product {
	
	String os;
	int ram;
	int sdCard;
	
	void mobile(){
		System.out.println(">>> Mobile object constructed");
	}
	
	void setProductDetails(int id,String name,int price,String os,int ram,int sdCard) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.os=os;
		this.ram=ram;
		this.sdCard=sdCard;
		System.out.println(">>> Data written in Product object");
	}
	
	
	void showProductDetails() {
		System.out.println("---------Product ID: "+id+" ----------");
		System.out.println("Name:\n"+name);
		System.out.println("Price:\n"+price);
		System.out.println("OS:\n"+os);
		System.out.println("RAM:\n"+ram);
		System.out.println("sdCard:\n"+sdCard);
		System.out.println("----------------------------------------");
	}
	
}


public class InheritanceApp {

	public static void main(String[] args) {
		/*
		Product product1=new Product();
		
		//System.out.println("product is"+product);
		
		product1.setProductDetails(101,"IPhone",70000);

		product1.showProductDetails();
		
		Product product2=new Product();
		
		product2.product();
		product2.setId(102);
		product2.name="Nike shoes";
		product2.price=5000;
		product2.showProductDetails();
		//System.out.println(); 
		
		 */
		
		Mobile mobile=new Mobile();
		
//		mobile.mobile();
//		mobile.setProductDetails(301,"iphone",70000);
//		mobile.showProductDetails();
		
		mobile.setProductDetails(301, "IPhone", 700000, "IoS", 4, 256);
		mobile.showProductDetails();
		
		
		Material material= new Material();
	}

}
