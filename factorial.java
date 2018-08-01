import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res*i;
		}
		System.out.print(res);
		
	}
	
}
