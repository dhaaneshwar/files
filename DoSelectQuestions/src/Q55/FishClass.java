package Q55;

import java.util.*;

public class FishClass {
	
	public List<Fish> getFishWithLowestWeight(List<Fish> list){
		List<Fish> f=new ArrayList<>(); 
		int min=Integer.MAX_VALUE;
		
		for(Fish i:list) {
			int weight=i.getWeight();
			if(weight<min) {
				min=weight;
				
			}
		}
		
		for(Fish i:list) {
			if(i.getWeight()==min) {
				f.add(i);
			}
			
		}
		
		return f;
	}
	
	public List<Integer> mapFishWeight(List<Fish> list){
		List<Integer> l=new ArrayList<>();
		for(Fish i:list) {
			l.add(i.getWeight());
		}
		return l;
	}

}
