package week1assignment.task8LeapYear;

import java.io.IOException;

import week1assignment.InputNumber;

public class MainLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberLower=0,numberUper=0;
		InputNumber inputnumber = new InputNumber();
		
		System.out.println( "Enter a lower limit of the year: ");
		try {
			numberLower= inputnumber.number();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "Enter a uper limit of the year: ");
		try {
			numberUper= inputnumber.number();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LeapYear lyear= new LeapYear();
		
		System.out.print("Leap Years : ");
		for (int i=numberLower;i<=numberUper;i++)
		{
			if(lyear.isValidYear(i))
			{
				System.out.print(i+",");
			}
		}

	}

}
