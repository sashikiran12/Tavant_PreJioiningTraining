package day0;

public class Factorial {
	public int calculateFactorial(int number) {
		int answer =1;
		for(int i = number;i>0;i--) {
			answer* = i;
		}
		return answer;
	}
}
