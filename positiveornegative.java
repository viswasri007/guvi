import java.io.*
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  if(a>0)
    System.out.println("Positive  number");
  else if(a==0)
    System.out.println("either positive nor negative value");
  else
   System.out.println("Negative number");
 }
