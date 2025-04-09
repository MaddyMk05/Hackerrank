import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String name=sc.nextLine();
	    char ch[]=name.toCharArray();
	    int len=name.length();
	    for(int i=0;i<len;i++){
	    System.out.println(ch[i]);
	    }
	}
}
