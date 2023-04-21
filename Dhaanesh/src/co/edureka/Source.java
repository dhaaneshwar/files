package co.edureka;
import java.util.*;

public class Source {
	public String listStartToEnd(ArrayList<String> list,int start,int end) {
		String s="";
		for(int i=start;i<end;i++) {
			s+=list.get(i);
		}
		return s;
	}
	
	public ArrayList<String> addBefore(ArrayList<String> list,String p,String q){
		int index=list.indexOf(p);
		list.add(index,q);
		return list;
	}

	public static void main(String[] args) {
			Source s=new Source();
			ArrayList<String> l=new ArrayList<>();
			l.add("Breaking Bad");
			l.add("Game of thrones");
			l.add("friends");
			l.add("prison break");
			
			System.out.println(s.listStartToEnd(l,0,2));
			System.out.println(s.addBefore(l, "friends", "supernaturals"));

	}

}
