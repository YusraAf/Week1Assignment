package week1assignment.task3perfect;

public class PerfectNumber {

	int perfectNumber;

	public PerfectNumber(int perfectnumber) {
		this.perfectNumber = perfectnumber;
	}

	
	private void checkPerfectNumber() {
		int number = perfectNumber, i, sum = 0;
		for (i = 1; i < number; i++) {
			if ((number % i) == 0) {
				sum += i;
			}
		}

		if (perfectNumber == sum)
			perfectNumber = sum;
		else
			perfectNumber = 0;

	}

	public int getPerfectNumber() {
		checkPerfectNumber();
		return perfectNumber;
	}

	
}
