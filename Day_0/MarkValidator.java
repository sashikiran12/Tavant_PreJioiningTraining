package day0;

public class MarkValidator {
	
	public boolean isPass(int mark) {
		if (mark<40) {
			return false;
		} else {
			return true;
		}
	}
	public String markGrade(int mark) {
		if (isPass(mark)) {
			if (mark>90) {
				return "Grade A";
			} else if(mark>75) {
				return "Grade B";
			} else if(mark>60) {
				return "Grade C";
			}
		}
		return "Grade D";
	}
	
}
