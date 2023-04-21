package Testing;

import org.junit.*;
import static org.junit.Assert.*;

 

import org.junit.Test;

 

public class JunitExample {

 

    @Test
    public void test_JUnit() {
        System.out.println("This is the testcase");
        String str="This is the testcase string";
        assertEquals("This is the testcase string",str);
    }

//	@Test  
//    public void testFindMax(){  
//        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
//        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
//    }
    
    //@Test(expected=IllegalArgumentException.class)
    
    
 

}