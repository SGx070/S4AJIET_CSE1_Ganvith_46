import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int v = 0;
	    int c = 0;
	    System.out.println("Enter the string to check the number of consonents and vowels: ");
	    String s = sc.nextLine().toLowerCase();
	    for(int i=0;i<s.length();i++){
	        char ch = s.charAt(i);
	        if(ch=='a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
	            v++;
	        }
	        else
	            c++;
	    }
	    System.out.println("Number of vowels: "+v);
	    System.out.println("Number of consonants: "+c);
	}
}
