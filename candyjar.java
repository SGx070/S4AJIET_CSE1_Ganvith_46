import java.util.Scanner;
public class Main

{
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=20;
        int m=6;
        int a;
        
        System.out.println("Number of candies ordered by one customer:");
        int j=s.nextInt();
        if(j<n){
                a=n-j;
                if(a<=6){
                    a=20;
                }
            System.out.println("Number of Candies sold:"+j);
            System.out.println("Number of Candies available:"+a);
        }else{
                System.out.println("INVALID");
	   }
    }
}
