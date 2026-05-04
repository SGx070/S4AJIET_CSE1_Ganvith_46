public class Main

{
	public static void main(String[] args) {
		int a,n = 20,k = 2,j = 3,m = 12,p = 12;
		if(k!=0&&j!=0){
		    a = (m/k)+(p/j);
		    n = n - a;
		}
		else{
		    System.out.println("INVALID INPUT");
		    System.exit(0);
		}
		if(m%k!=0||p%j!=0){
		    n = n-1;
		}
		System.out.println("Number of monkey left on the tree = "+n);
	}
}
