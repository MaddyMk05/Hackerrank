import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        if(r1==r2){
        
        for(int i=0;i<=r1-1;i++){
            for(int j=0;j<=c1-1;j++){
                a[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<=r2-1;i++){
            for(int j=0;j<=c2-1;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[r1][c2];
        for(int i=0;i<=r1-1;i++){
            for(int j=0;j<=c2-1;j++){
                c[i][j]=0;
                for(int k=0;k<=c1-1;k++){
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }
        for(int i=0;i<=r1-1;i++){
            System.out.print("[");
            for(int j=0;j<=c2-1;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("]");
        }
        }
        
    }
}
