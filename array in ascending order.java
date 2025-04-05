import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("The Sorted array is:");
        for(int i=0;i<=n-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}
