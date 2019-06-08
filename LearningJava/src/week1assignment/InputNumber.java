package week1assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {

	
	public int number() throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	int number = Integer.parseInt(br.readLine());
	return number;
	}
	
}
