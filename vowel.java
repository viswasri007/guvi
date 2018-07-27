import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		char ch;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ch=(char)bf.read();
		if(ch =='a'||ch =='e'||ch =='i'|| ch=='o'||ch =='u')
			System.out.println("vowel");
		else
			System.out.println("Consonant");
			
	}
}
