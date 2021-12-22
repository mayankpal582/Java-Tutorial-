public class Conditional_Statements {
    public static void main(String[] args) {
        int age = 12;
		
		// >, <, >=, <=, ==, !=
		
		if ( age > 18 ) {
			System.out.println("you can vote");
		} else {
			System.out.println("you can not vote");
		}
		
		// && , ||, !
		
		int age1 = 12;
		if ( !(age1 > 18) ) {
			System.out.println("you can vote");
		} else {
			System.out.println("you can not vote");
		}
    }
}
