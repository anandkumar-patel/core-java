package anand.util.vector;
import java.util.Vector;
import java.util.Iterator;
 
public class VectorIteratorExample {
 
  public static void main(String[] args) {
 
    // Create a Vector and populate it with elements
    Vector<String> vector = new Vector<String>();
    vector.add("element_1");
    vector.add("element_2");
    vector.add("element_3");
    vector.add("element_4");
    vector.add("element_5");
 
    // The Iterator object is obtained using iterator() method
    Iterator<String> it = vector.iterator();
 
    // To iterate through the elements of the collection we can use hasNext() and next() methods of Iterator 
    System.out.println("Vector elements :");
    while(it.hasNext())

System.out.println(it.next());
 
  }
}
