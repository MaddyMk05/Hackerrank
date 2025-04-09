import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String n=sc.nextLine();
	    char ch[]=n.toCharArray();
	    int len=n.length();
	    for(int i=0;i<len;i++)
	    {
	        if(ch[i] >= 'a' && ch[i] <= 'z')
	        {
                ch[i]=(char)(((int)ch[i])-32);
	        }
	    }
	    String ans=new String(ch);
	    System.out.println(ans);
	}
}
