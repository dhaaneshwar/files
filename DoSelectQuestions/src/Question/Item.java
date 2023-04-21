package Question;

public class Item {
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public double getPrice() {
		return price;
	}
	public boolean isInStock() {
		return isInStock;
	}

}
