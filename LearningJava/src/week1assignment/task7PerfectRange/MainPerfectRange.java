package week1assignment.task7PerfectRange;
import java.io.IOException;

import week1assignment.InputNumber;
import week1assignment.task3perfect.PerfectNumber;
public class MainPerfectRange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int numberLower,numberUper, result;
		InputNumber inputnumber = new InputNumber();
		
		System.out.println( "Enter a lower limit number: ");
		numberLower= inputnumber.number();
		System.out.println( "Enter a uper limit number: ");
		numberUper= inputnumber.number();
		  
		System.out.print("Perfect numbers from "+numberLower+ " to "+numberUper+":");
		
		for(int i = numberLower; i<=numberUper;i++) {
			PerfectNumber perfectnumber = new PerfectNumber(i);
			result=perfectnumber.getPerfectNumber();
			if (result!=0)
			System.out.print(result+",");
			
		}
		
	}

}
