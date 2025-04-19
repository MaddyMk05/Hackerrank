import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            n=n*(-1);
        }
        int a= n%10;
        int b= n/1000;
        System.out.print(a+b);
    }
}
