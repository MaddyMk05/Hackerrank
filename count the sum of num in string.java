import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char c[]=str.toCharArray();
        int s,ts=0;
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            s=0;
            if(c[i]>='0' && c[i]<='9')
            {
                while(i<l && (c[i]>='0' && c[i]<='9'))
                {
                    s=s*10+(int)c[i]-48;
                    i++;
                    }
                ts=ts+s;
                }
            }
        System.out.println(ts);
    }
}
