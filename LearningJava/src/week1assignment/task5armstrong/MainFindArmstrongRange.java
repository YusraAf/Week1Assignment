package week1assignment.task5armstrong;

import java.io.IOException;

import week1assignment.InputNumber;
import week1assignment.task1armstrong.FindArmstrong;

public class MainFindArmstrongRange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int result =0,numberLower,numberUper;
		InputNumber inputnumber = new InputNumber();
		
		System.out.println( "Enter a lower limit number: ");
		
		numberLower= inputnumber.number();
		System.out.println( "Enter a uper limit number: ");
		
		numberUper= inputnumber.number();
		
		for(int i = numberLower; i<=numberUper;i++) {
		FindArmstrong findarmstrong = new FindArmstrong(i);
		result= findarmstrong.collectArmstrong();
		if(result!=0) {
		System.out.print( result+",");
		}
		}

	}

}
