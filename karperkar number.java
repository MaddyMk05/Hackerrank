import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int c=0;
        int t=n;
        while(t!=0){
            c++;
            t=t/10;
        }
        int tp=((int)Math.pow(10,c));
        int s1=sq%tp;
        int s2=sq/tp;
        if((s1+s2)==n){
            System.out.print("Kaprekar Number");
        }else{
            System.out.print("Not a Kaprekar Number");
        }
        
    }
}
