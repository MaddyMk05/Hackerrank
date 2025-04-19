import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a1= n/1000;
        int a2 = n%10;
        int b=a1+a2;
        System.out.print(b);
    }
}
