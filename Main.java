# kuttypula15
import java.io.*;
import java.util.*;
public class Factorial
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner (System.in);
  int a;
    System.out.println("Enter the num");  
  a=sc.nextInt();
  int fact=1;
    for(int i=1;i<=a;i++)
  {
      fact=fact*i;
      }
      System.out.println(fact);
      }
      }  
      
