import java.util.*;
class fibnossis
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
 int n1=0;
 int n2=1;
 System.out.println("enter the no:");
 int n=sc.nextInt();
 System.out.println(n1 +"");
 System.out.println(n2 +"");
 int i=3;
 int n3;
 while(i<=n)
{
      n3=n1+n2;
     System.out.println(n3 +" ");
      n1=n2;
      n2=n3;
      i++;
}
} 
}  
  
