package day0;

public class MarkValidator1 {
	public boolean isPass(int mark) {
		if (mark<40) {
			return false;
		} else {
			return true;
		}
	}
	public String markGrade(int mark) {
		String result = String.valueOf(isPass(mark));
		switch (result) {
		case "true":
			if (mark>90) {
				return "Grade A";
			} else if(mark>75) {
				return "Grade B";
			} else if(mark>60) {
				return "Grade C";
			}

		default:
			return "Grade D";
		}
	}
}
