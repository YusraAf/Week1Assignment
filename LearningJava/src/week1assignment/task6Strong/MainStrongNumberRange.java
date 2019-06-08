package week1assignment.task6Strong;
import java.io.IOException;

import week1assignment.InputNumber;
import week1assignment.task2armstrong.StrongNumber;
public class MainStrongNumberRange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int numberLower,numberUper;
		InputNumber inputnumber = new InputNumber();
		
		System.out.println( "Enter a lower limit number: ");
		
		numberLower= inputnumber.number();
		System.out.println( "Enter a uper limit number: ");
		
		numberUper= inputnumber.number();
		StrongNumber strongNumber = new StrongNumber(numberLower,numberUper);
		System.out.print("Strong numbers are: ");
		strongNumber.checkStrNumberRange();
		
		
	}

}
