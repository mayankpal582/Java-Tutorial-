public class Conditional_Operators {
    public static void main(String[] args) {
       // boolean isEqual = 18 == 18;
        		System.out.println(19 != 18);
		
		char grade = 'D';
		
		if(grade == 'A') {
			System.out.println("your grade is very good");
		} else if (grade == 'B') {
			System.out.println("very good, keep learning");
		} else if(grade == 'D') {
			System.out.println("keep improving");
		} else {
			System.out.println("invalid grade");
		}
    }
}
