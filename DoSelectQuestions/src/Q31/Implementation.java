package Q31;

import java.util.ArrayList;
import java.util.List;

class Implementation{
    public List<Dog> filterByAgeAndWeight(List<Dog> listDog){
    	int i=0;
    	List<Dog> list=new ArrayList<>();
    	for(Dog d:listDog) {
    		if(listDog.get(i).getAge()>10 && listDog.get(i).getWeight()>25) {
    			list.add(d);
    		}
    		i++;
    	}
    	return list;
    }
    public String separateWithDelimeter(List<Dog> listDog){
    	StringBuffer sb=new StringBuffer();  
		int n=listDog.size();
		sb.append(listDog.get(0));
		for(int i=1;i<n;i++) {
			sb.append("$$");
			sb.append(listDog.get(i));
		}
		return sb.toString();
    }
}