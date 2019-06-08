package week1assignment.task1armstrong;

public class FindArmstrong {

	int number;
	public FindArmstrong(int number) {
	this.number= number;	
	}
	
	public int collectArmstrong() {
		int oriNumber = number, result = 0, remainder;
		
		int length = String.valueOf(number).length();
		
		while(oriNumber != 0) {
			remainder= oriNumber % 10;
			result +=  Math.pow(remainder, length);
			oriNumber /= 10;	
					
		}
		
		if (result == number)
		{
			//System.out.println("This is an armstrong number :" + result);
			return number;
		}
		
			
		  else //{ System.out.println("This is not an armstrong number "); }
		 
		
		return 0;
}

}