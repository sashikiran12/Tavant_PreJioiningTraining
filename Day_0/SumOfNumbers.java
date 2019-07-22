package day0;

public class SumOfNumbers {
	public int sumOfEvenNumbers(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			if (i%2==0) 
                        {
				sum+=i;
			}
		}
		return sum;
	}
	public int sumOfOddNumbers(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end;i++) {
			if (i%2 != 0) {
				sum+ = i;
			}
		}
		return sum;
	}
}
