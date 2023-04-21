package Q42;

public class Afford {
	
	public String checkConfiguration(Laptop laptop) throws Exception{
		if(laptop.getPrice()>70000) {
			throw new LaptopException("Price is too high");
		}
		
		String[] ram=laptop.getDetails().split("/");
		if(Integer.valueOf(ram[0])<8) {
			throw new LaptopException("Minimum 8 RAM required");
		}
		if(Integer.valueOf(ram[1])<256) {
			throw new LaptopException("Minimum 256 space required");
		}
		if(ram[2].equals("HDD")) {
			throw new LaptopException("SSD required");
		}
		return "Can be purchased";
	}
	
	public String purchaseLaptop(Laptop laptop) throws Exception{
		try {
			checkConfiguration(laptop);
		}catch(LaptopException e) {
			return "Change configuration";
		}catch(Exception e) {
			return "other Exception";
		}
		return "Perfect configuration";
	}

}
