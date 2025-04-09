import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String n=sc.nextLine();
	    char ch[]=n.toCharArray();
	    int len=n.length();
	    char temp;
	    int r=len-1;
	    for(int i=0;i<len/2;i++)
	    {
	       temp=ch[i];
	       ch[i]=ch[r];
	       ch[r]=temp;
	       r--;
	    }
	    String ans=new String(ch);
	    System.out.println(ans);
	}
}
