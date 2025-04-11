import java.io.*;
import java.util.*;

public class Solution {
    public static int power(int a, int n)
    {
        if(n == 0){
            return 1;
        }else{
            return a*power(a,n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        int p=power(a,n);
        System.out.println("The value of " +a+" power " +n+" is " +p);
    }
}
