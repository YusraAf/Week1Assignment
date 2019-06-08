package week1assignment.task3perfect;
import java.io.IOException;

import week1assignment.InputNumber;

public class MainPerfectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	int pNumber, result;
	InputNumber inputnumber= new InputNumber();
		System.out.println( "Enter a Positive Number: ");

		pNumber=inputnumber.number();
		PerfectNumber perfectNumber = new PerfectNumber(pNumber);
		
		result= perfectNumber.getPerfectNumber();
		
		if (result != 0)
			System.out.println(pNumber+" is a perfect number." );
			
			
		  else  { 
			  System.out.println(pNumber+" is not a perfect number.");
			  
		  }
	
	}

}
