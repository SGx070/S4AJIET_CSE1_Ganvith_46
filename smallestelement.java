import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		int[] a = {10,20,30,40,50};
		int p=a[0];
		int n = a.length;
		for(int i =0; i<n;i++){
		    if(a[i] < p)
		        p = a[i];
		}
		System.out.println("The smallest element in array: "+p);
	}
}
