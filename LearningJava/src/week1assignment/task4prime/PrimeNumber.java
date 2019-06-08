package week1assignment.task4prime;
import week1assignment.InputNumber;
import java.io.*;
public class PrimeNumber
{
      public static void main(String Ar[])
      {
           int number=0;
            InputNumber inputnumber = new InputNumber();
           
             
           
                  try
                  {
                        System.out.println("Enter the no.:");
                        number = inputnumber.number();
                  }

                  catch(IOException e)
                  {
                  }
                  
                  PrimeNumber primenumber= new PrimeNumber();
                  System.out.println("Next prime no is: ");     
                  int nextPrime; 
                  nextPrime= primenumber.findPrimenumber(number);
                  
                  System.out.println(nextPrime);
                  
            }
      
      public int findPrimenumber(int number) {
    	  
    	  int i,j;
          for(j=number+1;;j++)
          {

          for(i=2;i<j;i++)
          {
                if(j%i==0)
                break;
          }

          if(i==j)
          {
              return j;
                
          
          }
          }  	  
      }
      }