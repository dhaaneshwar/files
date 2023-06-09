package Q22;

import java.util.*;

public class Dance {
	HashMap<String, Integer> steps= new HashMap<>();
	
	public String newStep(String name,int ways) {
		if(steps.containsKey(name)) {
			steps.put(name, ways);
			return "Stepped in";
		}else {
			steps.put(name, ways);
			return "New step";
		}
		
	}
	
	public int findStep(String name) {
		if(steps.containsKey(name)) {
			return steps.get(name);
		}else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		
		Dance obj = new Dance();
		System.out.println(obj.newStep("Step1",9));
		System.out.println(obj.newStep("Step2",5));
		System.out.println(obj.newStep("Step1",3));
		System.out.println(obj.newStep("Step3",7));
		
		System.out.println(obj.findStep("Step1"));

	}

}
