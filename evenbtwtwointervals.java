import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		for(int num=n+1;num<=m-1;num++)
		{
			if(num%2==0)
			System.out.println(num+" ");
		}
	}
}
