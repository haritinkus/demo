import java.util.*;

public class LinkedList1 {
  public static void main(String args[]) {

    LinkedList<String> al = new LinkedList<String>();
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ravi");
    al.add("Ajay");
    

    Iterator<String> itr = al.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    al.add(1, "Ami");
     System.out.println("After invoking position based add value: "+al);  
    Iterator<String> i = al.descendingIterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
  }
}