import java.util.ArrayList;
import java.util.Iterator;
 
public class IteratorDemo2 {
 
  public static void main(String args[]){
    ArrayList names = new ArrayList();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
    
    //Adding Integer value to String ArrayList
    names.add(new Integer(10));
 
    Iterator it = names.iterator();
 
    while(it.hasNext()) {
      String obj = (String)it.next();
      System.out.println(obj);
    }
  }
}