import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char ch[]=name.toCharArray();
        int length=name.length();
        int n=length-1;
        int flag=0;
        for(int i=0;i<length/2;i++){
            if(ch[i]!=ch[n]){
                flag=1;
            }
            n--;
        }
        if(flag==1){
            System.out.println("Not a Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }
}
