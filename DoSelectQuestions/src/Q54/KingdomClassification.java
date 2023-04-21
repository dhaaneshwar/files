package Q54;

import java.util.*;

public class KingdomClassification {
	public List<String> getKingdom(List<Kingdom> list){
		List<String> l=new ArrayList<String>();
		for(Kingdom k:list) {
			l.add(k.getLife());
		}
		return l;
	}
	
	public Kingdom findNameWithValidity(List<Kingdom> list, String name, int lifeSpan) {
		for(Kingdom k:list) {
			if(k.getNonLife().equals(name) && k.getLifeSpan()==lifeSpan) {
				return k;
			}
		}
		return null;
	}

}
