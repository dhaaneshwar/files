package Q41;

public class Food {
	
	String plate;
	int numberOfSoldiers;

	public Food(String plate, int numberOfSoldiers) {
		this.plate = plate;
		this.numberOfSoldiers = numberOfSoldiers;
	}

	public String getPlate() {
		return plate;
	}

	public int getNumberOfSoldiers() {
		return numberOfSoldiers;
	}

	public static void main(String[] args) {
		Food f = new Food("1234", 70000);
		KhumbhKaran v = new KhumbhKaran();
		String s = null;
		try {
			s = v.getReadyToFight(f);
		} catch (Exception e) {
			s=e.getMessage();
		}
		String t = null;
		try {
			t = v.winTheWar(f);
		} catch (Exception e) {
			t=e.getMessage();
		}
		System.out.println(s.toLowerCase());
		System.out.println(t.toLowerCase());

	}

}
