import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		long result=1;
		while(m!=0)
		{
			result=result*n;
			--m;
		}
		System.out.println(result);
	}
}
