import java.util.*;
class Amstrong_no
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int sum=0;
   int i;
   System.out.println("enter the no");
   int n=sc.nextInt();
   i=n;
  while(i!=0)
 {
   int rem=i%10;
   sum=sum+(rem*rem*rem);
   i=i/10;
  }
   if(n==sum)
    System.out.println("the no is amstrong no");
  else
    System.out.println("the no is not amstrong no");
}
}