import java.util.Scanner;
class Digits
{
   public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number" );
  int n=sc.nextInt();
  int count = 0;
 do
  {
    count++;
    n=n/10;
   }
     while(n!=0);

   System.out.println("number of digits:"+count);

}

}