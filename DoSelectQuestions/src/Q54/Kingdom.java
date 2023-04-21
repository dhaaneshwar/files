package Q54;

import java.util.*;

public class Kingdom {
	String life;
	String nonLife;
	int lifeSpan;

	public Kingdom(String life, String nonLife, int lifeSpan) {
		super();
		this.life = life;
		this.nonLife = nonLife;
		this.lifeSpan = lifeSpan;
	}

	public String getLife() {
		return life;
	}

	public void setLife(String life) {
		this.life = life;
	}

	public String getNonLife() {
		return nonLife;
	}

	public void setNonLife(String nonLife) {
		this.nonLife = nonLife;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	@Override
	public String toString() {
		return "Kingdom [life=" + life + ", nonLife=" + nonLife + ", lifeSpan=" + lifeSpan + "]";
	}

	public static void main(String[] args) {
		KingdomClassification k = new KingdomClassification();
		List<Kingdom> list1=new ArrayList<Kingdom>();
		list1.add(new Kingdom("Protista", "Regnum", 3));
		list1.add(new Kingdom("Plantae", "Lapideum", 5));
		
		System.out.println(k.getKingdom(list1));
		System.out.println(k.findNameWithValidity(list1, "Lapideum", 5));
		

	}

}
