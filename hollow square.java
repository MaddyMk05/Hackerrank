import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        System.out.print("*");
	    }
	        System.out.println(" ");
	        
	        for(int i=1;i<n-1;i++)
	        {
	            for(int j=0;j<=n-1;j++)
	            {
	                if(j==0 || j==(n-1))
	                {
	                    System.out.print("*");
	                }else{
	                    System.out.print(" ");
	                }
	            }
	        System.out.println();
	        }
	        for(int i=0;i<n;i++){
	        System.out.print("*");
	    }
	}
}
