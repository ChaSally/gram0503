package grammar0503_1;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		
		if (score >= 90) {
			System.out.println("수!");
			
		} else if (score >= 80) {
			System.out.println("우!");
		} else if (score >= 70) {
			System.out.println("미!");
		} else if (score >= 60) {
			System.out.println("양!");
		} else {
			System.out.println("가!");
		} 
		
		
		int favor = 4;  // 변수가 분리되어 3 중 하나라면 switch(), if문보다 간결
		switch(favor) {
			case 1:
				System.out.println("안녕!");
				break;
			case 2:
				System.out.println("감사!");
				break;
			case 3:
				System.out.println("hi!");
				break;
			default:
				System.out.println("잘가요!");
				 
		}
		
			

	}

}
