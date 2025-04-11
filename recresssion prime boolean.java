import java.io.*;
import java.util.*;

public class Solution {
    public static Boolean prime(int n,int div){
        if(div == 1)
            return true;
        else if(n%div==0)
            return false;
        else
            return prime(n,div-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Boolean isp=prime(n,n/2);
        if(isp==true)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
        
    }
}
