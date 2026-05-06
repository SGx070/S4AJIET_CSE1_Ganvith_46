import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    String s1 = "silent";
	    String s2 = "listen";
	    char[] s11 = new char[6];
	    char[] s22 = new char[6];
	    if(s1.length()!=s2.length()){
	        System.out.println(false);
	        return;
	    }
	    else {
	        s11 = s1.toCharArray();
	        s22 = s2.toCharArray();
	        Arrays.sort(s11);
	        Arrays.sort(s22);
	    }
	   System.out.println(Arrays.equals(s11,s22));
	}
}
