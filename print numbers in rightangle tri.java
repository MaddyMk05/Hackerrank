import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int t=1;
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print(t);
	            t++;
	        }
	        System.out.println();
	    }
	}
}
