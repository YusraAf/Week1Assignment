package week1assignment.task2armstrong;

import java.io.IOException;

import week1assignment.InputNumber;


public class MainStrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int number, result=0;
		
		InputNumber inputnumber = new InputNumber();
		
		System.out.println( "Enter a Positive Number: ");

		number= inputnumber.number();
		
		StrongNumber strongNumber = new StrongNumber();
		
		result= strongNumber.checkStrNumber(number);
		
		if (result != 0)
			System.out.println("This is a strong number :" + result);
			
			
		  else  { 
			  System.out.println("This is not a strong number ");
			  
		  }
		
		

	}

}
