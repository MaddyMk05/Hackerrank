import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=n-1;i++)
            a[i]=sc.nextInt();
        {
            for(int i=0;i<=n-2;i++)
            {
                for(int j=i+1;j<=n-1;j++)
                {
                    if(a[i]==a[j])
                    {
                        for(int k=j;k<=n-2;k++)
                        {
                            a[k]=a[k+1];
                        }
                        n--;
                        j--;
                    }
                }
            }
            for(int i=0;i<=n-1;i++)
                System.out.println(a[i]);
        }
    }
}
