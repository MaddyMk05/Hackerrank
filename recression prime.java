import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int check = prime(n, n / 2);
    if(check == 1)
        System.out.println("Prime Number");
    else
        System.out.println("Not a Prime Number");
}
public static int prime(int n, int i){
    if(i == 1)
        return 1;
    else{
        if(n % i == 0)
            return 0;
        else
            return prime(n, i - 1);
    }
}
}
