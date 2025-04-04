import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int x=3;
        int y=4;
        Scanner sc=new Scanner(System.in);
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int diff1=x2-x;
        int diff2=y2-y;
        int f=((diff1*diff1)+(diff2*diff2));
        System.out.println((int)Math.floor(Math.sqrt(f)));
    }
}
