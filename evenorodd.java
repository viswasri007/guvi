import java.util.Scanner;
public class Odd_Even 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("Even");
        }
        else if(n%2!=0 && n>0)
        {
            System.out.println("Odd");
	}
	else
	{
		System.out.println("invalid");
	}
    }
}
