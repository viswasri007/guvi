import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean flag=false;
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
			++i;
		}
		if(!flag)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
