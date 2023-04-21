package Apr8;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorComparable{
    public static void main(String[] args) {
        ArrayList<Student1> stu=new ArrayList<Student1>();
        stu.add(new Student1(1,"xyz"));
        stu.add(new Student1(2,"abc"));
        stu.add(new Student1(4,"pqr"));
        stu.add(new Student1(3,"lmn"));
       
//        Sorting By name
        //Collections.sort(stu,new SortByName());
        Collections.sort(stu,new SortByRollNo());
        for(int i =0;i<stu.size();i++) {
            System.out.println(stu.get(i));
        }
       
    }
}

