import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>99 && a<=999){
            a=(a/10)%10;
            if(a%3==0){
            System.out.print("Trendy Number");
            }
            else{
            System.out.print("Not a Trendy Number");
            }
            }
        }
    }
