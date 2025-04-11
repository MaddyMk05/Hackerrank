import java.io.*;
import java.util.*;

public class Solution 
{
     public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
           return 1+sum(n/10); 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no=sum(n);
        System.out.println("The number of digits in "+n+" is " +no);
    }
}
