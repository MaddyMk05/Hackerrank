import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char ch[]=name.toCharArray();
        int length=name.length();
        char temp;
        for(int i=0;i<=length-2;i++){
            for(int j=i+1;j<=length-1;j++){
                if(ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        for(int i=0;i<=length-1;i++){
            System.out.print(ch[i]);
            
        }
        
    }
}
