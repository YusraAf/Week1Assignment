package week1assignment.task9PrimeNumberPrint;

import java.io.IOException;

import week1assignment.InputNumber;

public class MainPrimeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber = 0, lastnumber = 0, Sum = 0, count = 0;
		InputNumber inputnumber = new InputNumber();

		try {
			System.out.println("Enter the first number :");
			firstnumber = inputnumber.number();
			System.out.println("Enter the last number :");
			lastnumber = inputnumber.number();
		}

		catch (IOException e) {
		}

		MainPrimeAvg primenumber = new MainPrimeAvg();
		System.out.println("Prime : " );
		for (int i = firstnumber; i <= lastnumber; i++) {
			int prime = primenumber.findPrimeavg(i);
			
			if (prime != 0) {
				System.out.print( prime+",");
				Sum += prime;
				count++;		
			}

		}
		double avg;
		avg = Math.round(Sum / count);
		System.out.println(" ");
		System.out.println("Average of prime :" + avg);
	}

	public int findPrimeavg(int lonumber) {
		int i, j = lonumber / 2, flag = 0, result = 0;

		for (i = 2; i < j; i++) {
			if (lonumber % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			result = lonumber;

		return result;
	}
}
