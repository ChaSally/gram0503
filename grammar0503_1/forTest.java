package grammar0503_1;

public class forTest {

	public static void main(String[] args) {
		// 1 ~ 10 출력하는 for문
		
		int sum = 0;
		for (int i=1; i<=10; i++) { // ;; 초깃값, 조건식, 증가값
			sum = sum + i;
		}
		System.out.println("1~10의 합: " + sum); // 합게 변수
		
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		for(int i=1; i<=100; i=i+2) {
			System.out.println(i);
		}
		for(int i=0; i<=100; i=i+2) {
			System.out.println(i);
		}
		
		// 1~100 합 출력
		int sum1 = 0;
		for(int i=1; i<=100; i++) {
			sum1 = sum1 + i;
			
		}
		System.out.println(sum1); // for문 마친 후 최종 출력해야

	}

}
