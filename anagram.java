import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        char ch1[]=n1.toCharArray();
        char ch2[]=n2.toCharArray();
        int len1=n1.length();
        int len2=n2.length();
        int a1[]=new int[256];
        int a2[]=new int[256];
        int ascii=0;
        if(len1==len2){
           for(int i=0;i<len1;i++){
               ascii=(int)ch1[i];
               a1[ascii]++;
               ascii=(int)ch2[i];
               a2[ascii]++;
           }
            int flag=0;
            for(int i=0;i<=255;i++){
                if(a1[i]!=a2[i]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
        
    }
}
