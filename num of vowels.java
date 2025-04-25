import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch == 'a' || ch== 'e'|| ch == 'i' || ch==  'o' || ch =='u' || ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                count = count + 1;
        }
        System.out.print("Number of vowels: " +count);
       }
}
