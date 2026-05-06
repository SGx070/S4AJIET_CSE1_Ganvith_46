import java.util.Collections;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    LinkedList <Integer> cse = new LinkedList<>();
	    cse.add(20);
	    cse.add(10);
	    cse.addFirst(15);
	    cse.addLast(5);
	    System.out.println("Normal order: "+cse);
	    Collections.sort(cse);
	    System.out.println("Ascending order: "+cse);
	    Collections.sort(cse,Collections.reverseOrder());
	    System.out.println("Descending order: "+cse);
	}
}
