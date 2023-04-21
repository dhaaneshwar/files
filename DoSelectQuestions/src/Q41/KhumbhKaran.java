package Q41;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KhumbhKaran {
	public String getReadyToFight(Food food) throws Exception{
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(food.getPlate());
        boolean specialCharacter = matcher.find();
        
        if(specialCharacter) {
        	throw new FoodException("Insect found in the food");
        }
        String f=food.getPlate();
        for(int i=0;i<f.length();i++) {
        	if(Character.isLetter(f.charAt(i))) {
        		throw new FoodException("Not edible");
        	}
        }
        if(food.getNumberOfSoldiers()<1000) {
        	throw new FoodException("Food was not sufficient");
        }
		return "Ready for the war";
	}
	
	public String winTheWar(Food food) throws Exception{
		try {
			getReadyToFight(food);
		}catch(FoodException e) {
			return "No war";
		}catch(Exception e) {
			return "Other exception";
		}
		return "Here the battle starts";
	}

}
