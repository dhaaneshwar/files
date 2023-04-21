package Q42;

public class Laptop {
	int price;
	String details;

	public Laptop(String details,int price) {
		this.price = price;
		this.details = details;
	}

	public int getPrice() {
		return price;
	}

	public String getDetails() {
		return details;
	}

	public static void main(String[] args) {
		Laptop laptop=new Laptop("8/512/SSD", 58000);
		Afford af=new Afford(); 
		String s;
		try {
			s = af.checkConfiguration(laptop);
		} catch (Exception e) {
			s=e.getMessage();
		}
		String t;
		try {
			t = af.purchaseLaptop(laptop);
		} catch (Exception e) {
			t=e.getMessage();
		}
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());

	}

}
