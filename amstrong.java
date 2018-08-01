import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		if(N<=100000)
		{
			
		
		int originalNumber, remainder, result = 0;
		originalNumber = N;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == N)
            System.out.println("yes");
        else
            System.out.println( "no");
	}
}
}
