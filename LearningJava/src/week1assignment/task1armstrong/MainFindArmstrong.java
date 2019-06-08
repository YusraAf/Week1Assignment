package week1assignment.task1armstrong;

import java.io.IOException;

import week1assignment.InputNumber;

public class MainFindArmstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
	
	int number, result=0;
	
	InputNumber inputnumber = new InputNumber();
	
	System.out.println( "Enter a Positive Number: ");

	number= inputnumber.number();
	
	FindArmstrong findarmstrong = new FindArmstrong(number);
	
	result= findarmstrong.collectArmstrong();
	if (result != 0)
		System.out.println("This is an armstrong number :" + result);
		
		
	  else  { 
		  System.out.println("This is not an armstrong number ");
		  
	  }
	
	
	}

}
