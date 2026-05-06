import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList <String> list = new ArrayList<>();
	    list.add("Java");
	    list.add("python");
	    list.add("Java");
	    list.add(1,"ADA");
	    list.remove(2);
	    System.out.println(list.size());
	    System.out.println(list);
	    System.out.println(list.get(0));
	}
}
