import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String dob = sc.nextLine();
		String s = name.toLowerCase();
		int n = s.length();
		int m = dob.length();
		char ch[] = dob.toCharArray();
		char a[] = s.toCharArray();
		System.out.print(a[0]);
		System.out.print(a[n-1]);
		System.out.print(n);
		System.out.print((ch[0] - '0') + ch[1] -'0');
		System.out.print(ch[3]);
		System.out.print(ch[4]);
		int sum = ch[9]-'0' + ch[8]-'0' + ch[7]-'0' + ch[6] - '0';
		int p=0;
		while(sum  > 10)
		{
			p=0;
			while(sum !=0)
			{
				p = p + sum%10;
				sum = sum/10;

			}
		}
		System.out.print(p);
		System.out.print(a[n-2]);
		if(n%2==0)
		{
			System.out.print("$$");
		}
		else {
			System.out.print("##");
		}

	}
}
