package Q1;

import java.util.*;

enum FoodType{
	VEG,
	NONVEG;
}
public class Consumer {
	private final String name;
	private final int age;
	private final FoodType foodtype;

	public Consumer(String name, int age, FoodType foodtype) {
		this.name = name;
		this.age = age;
		this.foodtype = foodtype;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public FoodType getFoodtype() {
		return foodtype;
	}

	@Override
	public String toString() {
		return "Consumer [name=" + name + ", age=" + age + ", foodtype=" + foodtype + "]";
	}
	public static void main(String args[]) {
		
		Implementation imp =new Implementation();
		Consumer p=new Consumer("Sarah",45,FoodType.VEG);
		Consumer p1=new Consumer("John",26,FoodType.NONVEG);
		Consumer p2=new Consumer("Mirra",7,FoodType.NONVEG);
		
		List<Consumer> consumer=Arrays.asList(p,p1,p2);
//		System.out.println(imp.getNonVegetarianList(consumer));
		
		List<Consumer> c1=imp.getNonVegetarianList(consumer);
		for(Consumer i:c1) {
			System.out.println(i);
		}
		
//		System.out.println(imp.sortConsumersByAge(consumer));
		List<Consumer> c2=imp.sortConsumersByAge(consumer);
		for(Consumer i:c2) {
			System.out.println(i);
		}
		
	}


}


