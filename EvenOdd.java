import java.util.Scanner;
class EvenOdd
{
   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr tne num");
    int n=sc.nextInt();
    if( n%2==0)
{
         System.out.println(n+ " is even");
     }
      else{
          System.out.println(n+ " is odd");
  }
 }
}