//14. Write a program to display the first n terms of Fibonacci series. 
import java.util.Scanner;
class Fibonacci{
  public static void main(String args[])
   {
      //System.out.println("Enter the number of terms : ");
      //Scanner scan = new Scanner(System.in);
      int n = 5;
      int a=0;
      int b=1;
      int t;
      if(n==1){
      System.out.println(a +" ");
      }
      else if(n==2){
      System.out.print("0 1 ");
      }
      else{
       System.out.print("0 1 ");
      for(int i=3;i<=n;i++)
      {
        t=b;
        b=a+b;
        a=t;
        System.out.print(b +" ");
      }
     }
     
   }
}
