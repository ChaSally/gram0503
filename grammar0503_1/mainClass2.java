package grammar0503_1;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		// 파이썬의 input 문
		Scanner scanner; // Scanner class로 객체 선언
		scanner = new Scanner(System.in); // 객체를 초기화하는 연산자
		// 시스템 입력장치로부터 유저가 입력내용을 입력받게 초기화
		
		System.out.print("이름 입력: ");
		String inputData = scanner.nextLine(); // 엔터키 전까지 입력된 문자열 가져옴
		
		System.out.println(inputData);
		
		
		
		

	}

}
