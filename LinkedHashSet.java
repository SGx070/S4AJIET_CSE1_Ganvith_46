import java.util.LinkedHashSet;
public class Main
{
	public static void main(String[] args) {
	    LinkedHashSet <Integer> ai = new LinkedHashSet<>();
	    ai.add(2);
	    ai.add(20);
	    ai.add(10);
	    ai.add(5);
	    System.out.println(ai);
	    System.out.println("Size: "+ai.size());
	    System.out.println(ai.contains(2));
	    ai.remove(20);
	    System.out.println(ai);
	}
}
