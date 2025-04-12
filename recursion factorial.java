import java.io.*;
import java.util.*;

public class Solution {

     public static int  fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=fact(n);
        System.out.print("The factorial of " +n+ " is " +fact);
}
}  
