package Q1;

import java.util.*;

public class Implementation {
	
	public List<Consumer> getNonVegetarianList(List<Consumer> consumer){
		List<Consumer> c=new ArrayList<>();
		for(Consumer con:consumer) {
//			System.out.println(con.getFoodtype());
			if(con.getFoodtype()==FoodType.NONVEG) {
//				System.out.println(con);
				c.add(con);
			}

		}
		
		return c;
	}
	
	public List<Consumer> sortConsumersByAge(List<Consumer> consumer){
		
		//List<Consumer> c=new ArrayList<>();
		Collections.sort(consumer, Comparator.comparing(Consumer::getAge));
//		Collections.sort(consumer);
		return consumer;
	}
	

}

