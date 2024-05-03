package grammar0503_1;

public class mainClass4 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		int result1 = ++x;  // x = x+1, 증강연산자
		int result2 = y++;  // y = y =1
		
		System.out.println(result1);
		System.out.println(x);
		System.out.println(result2);  // 20
		System.out.println(y);
		
		int a = 1;
		int result3 = ++a + 10; 
		System.out.println(result3); // 12
		System.out.println(a); // 2
		
		int b = 1;
		int result4 = b++ + 10;
		System.out.println(result4); // 11
		System.out.println(b);  // 2
		
		int sum = 0;
		int i = 10;
		sum += i; // sum = sum + i
		sum *= i;
		
	}

}
