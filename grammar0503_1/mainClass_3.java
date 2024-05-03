package grammar0503_1;

public class mainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if (10 > 5) {
//			System.out.println("10은 5보다 크다");
//		} else {
//			System.out.println("10은 5보다 직다");
//			
//		}
		
		int num = 100;
		if (num == 100 ) { // 숫자값 비교는 부등호 ==
			System.out.println("축하합니다 100점입니다");
		}
		
		String str1 = "KOREA"; // 클래스로 선언된 객체
		String str2 = "KOREA";
		if (str1.equals(str2) ) {  // 문자열은 객체; 비교할 때는 == 아닌 .equals() 사용
			System.out.println("당신은 한국인입니다");
		}

	}

}
