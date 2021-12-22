public class Arrays {
    public static void main(String[] args) {
                    // array
		// 23, 12, 56, 34, 99
		
	int marks[] = new int[5];
	marks[0] = 23;
	marks[1] = 12;
	marks[2] = 56;
	marks[3] = 34;
	marks[4] = 99;
		
	int marks1[] = {23, 12, 56, 34, 99, 12, 34};
	
	for(int i = 0; i<=marks1.length; i++) {
		System.out.println(marks1[i]);
	}
		
    }
}
