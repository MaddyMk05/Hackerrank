import java.util.*;

public class main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t;
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            t=a[n-1];
            for(int j=n-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=t;
        }
        for(int i=0;i<n;i++)
        {
        System.out.print(a[i]+" ");
        }
    }
}
