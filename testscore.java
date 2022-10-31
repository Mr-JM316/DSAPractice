import java.util.*;
import java.lang.*;

class Solution{
  public static void main(String[] args)throws java.Lang.Exception
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
   int x=((a*b)-c)%b);
      if(x!=0)
      {
        System.out.println("NO");
      }
      else
      {
        System.out.println("YES");
      }
    }
