import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int cut=0;
        System.out.println("Enter the size of array:");
        int n=s.nextInt();
        int [] a = new int[n];
        System.out.println("Number of Visiting N in their first line");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int large=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<large){
                large=a[i];
                cut++;
            }
        }
        System.out.println("Number of ranks cut in the list:"+cut);
    }
}
