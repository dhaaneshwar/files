package Q55;

import java.util.*;

public class Fish {
	String species;
	int weight;

	public Fish(String species, int weight) {
		super();
		this.species = species;
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Fish [species=" + species + ", weight=" + weight + "]";
	}

	public static void main(String[] args) {
		FishClass f = new FishClass();
		
		List<Fish> list = new ArrayList<Fish>();
		list.add(new Fish("BlobFish", 20));
		list.add(new Fish("Guppy", 15));
		list.add(new Fish("Oscar", 60));
		list.add(new Fish("GoldFish", 5));
		
		System.out.println(f.getFishWithLowestWeight(list));
		System.out.println(f.mapFishWeight(list));

	}

}
