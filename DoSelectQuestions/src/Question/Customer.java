package Question;

public class Customer {
	int id;
	String name;
	double walletBalance;
	String address;

	public Customer(int id, String name, double walletBalance, String address) {
		
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) throws Exception {
		
		Customer cusDet = new Customer(927392, "Steve" ,5000.0, "USA");
		Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out;
		try {
			out = obj.purchaseItem(itemDet, cusDet);
		}catch(Exception e) {
			out=e.getMessage();
		}
		
		System.out.println(out);

	}

}
