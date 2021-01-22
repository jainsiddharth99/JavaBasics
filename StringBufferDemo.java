import java.lang.*;

public class StringBufferDemo {
 
   public static void main(String[] args) {
  
      StringBuffer buff = new StringBuffer("admin");
      System.out.println("buffer = " + buff);

      // prints substring from index 3
      System.out.println("substring is = " + buff.substring(3));

      /* prints substring from index 1 to 4 excluding character at 4th index */
      System.out.println("substring is = " + buff.substring(1, 4));
   }
}