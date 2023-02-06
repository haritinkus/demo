import java.util.*;

public class ArrayListExample1 {
  public static void main(String args[]) {
    ArrayList<String> list = new ArrayList<String>();// Creating arraylist
    list.add("Mango");// Adding object in arraylist
    list.add("Apple");
    list.add("Banana");
    list.add("Grapes");
    // Printing the arraylist object
    System.out.println(list);

    System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts from
                                                            // 0
    // changing the element
    list.set(1, "watermelon");
    System.out.println(list);
    System.out.println("For Each Loop");
    // using forEach loop
    for (String fruit : list)
      System.out.println(fruit);
  }
}