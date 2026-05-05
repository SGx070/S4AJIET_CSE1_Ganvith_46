import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the value to Reverse its value: ");
	    int n = s.nextInt();
	    int rev = 0;
	    while(n!=0){
	        int d = n%10;
	        rev = rev*10+d;
	        n = n/10;
	    }
	    System.out.println("Reversed value : "+rev);
	}
}
