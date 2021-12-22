public class Loops {
    public static void main(String[] args) {

        // for, while, do-while
		
		// for(;;)
		
		for(int i = 0; i < 10; i++) {
			System.out.println("For Loop" + i);
		}
		int a = 23;
		while(a <= 100) {
			a++;
			if ( a == 65 ) continue;
			System.out.println(a);
		}
		int a1 = 23;
		do {
			System.out.println(a1);
			a1++;
		} while(a1 > 100);   }    
}

