package grammar0503_1;

public class grammar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numInt; // 정수 변수 선언
		numInt = 10; // 초기값
				
		double numDouble;
		numDouble = 3.14;
		
		String str;
		str = "Korea";
		
		boolean logi;
		logi = true;
		
		char ch = 'A'; // 한 글자는 작은 따옴표
		ch = 'A';
		
		char ch2 = 65;
		System.out.println(ch2); // 코드 문자 A로 출력
		
		// 형 변환
		int dint = (int)numDouble;
		System.out.println(dint);
		
		double idou = (double)numInt;
		System.out.println(idou);
		
		String strInt = "1000";
		//int strSample = (int)strInt; // 임시적 형변환 문법 없음
		//Wrapper Class 사용해여--대문자로 시작
		int strSample = Integer.parseInt(strInt); // I.java.lang
		System.out.println(strSample);
		
		String strDouble = "3.14";
		double strSample2 = Double.parseDouble(strDouble);
		System.out.println(strSample2);
		
		// 문자열로 변환
		int num1 = 157;
		String numstr1 = String.valueOf(num1);
		System.out.println("문자열로 변환된 값 : " + numstr1);
		
		System.out.printf("정수값 출력 : %d", num1);
		
		
		
	}

}
