package Training;

public class Product {
	
	String name;
	double price;
	String coupon;
	
	public Product(String name,double price,String coupon) {
		this.name=name;
		this.price=price;
		this.coupon=coupon;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCoupon() {
		return coupon;
	}

	public static void main(String[] args) {
		Product obj=new Product("IPhone",25000,"IPhone-70");
		Validator val=new Validator();
		
		String valCop=val.validateCoupon(obj);
		double price=val.netPrice(obj);
		System.out.println("valCop = "+valCop);
		System.out.println("price = "+price);
	}

}
