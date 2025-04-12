import java.io.*;
import java.util.*;

public class Solution {
    public static int calsum(int a[],int n){
        if (n<=0)
            return 0;
        else
            return a[n-1]+calsum(a,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum= calsum(a,n);
        System.out.print(sum);
    }
}
