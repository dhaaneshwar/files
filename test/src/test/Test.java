package test;
import java.util.Scanner;
import java.io.*;

 

/**
* <h1>Add Two Numbers!</h1>
* The AddNum program implements an application that
* simply adds two given integer numbers and Prints
* the output on the screen.
*
* @author  Zara Ali
* @version 1.0
* @since   2014-03-31
*/
public class Test {
   /**
   * This method is used to add two integers.
   * @param n1 This is the first paramter to addNum method
   * @param n2  This is the second parameter to addNum method
   * @return int This returns sum of n1 and n2.
   */
   public int addNum(int n1, int n2) {
      return n1 + n2;
   }

 

   /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */

 

   public static void main(String args[]) throws IOException {
      Test obj = new Test();
      int sum = obj.addNum(2, 3);

 

      System.out.println("Sum of 2 and 3 is :" + sum);
   }
}