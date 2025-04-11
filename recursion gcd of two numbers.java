import java.io.*;
import java.util.*;

public class Solution {
    public static int gcd(int a,int b, int div)
    {
        if(a%div==0 & b%div==0)
            return div;
        else
            return gcd(a,b,div-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int div;
        if(a<b)
            div=a;
        else
            div=b;
        int g=gcd(a,b,div);
        System.out.print(g);
    }
}
