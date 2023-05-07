package section08;
/*
 * 메소드 구조
 *  (접근제한자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명) {
 *  	실행할 코드(명령문 집합)
 *  
 *      (return 반환값;) //int면 정수값..반환값 반환타입을 맞춰줘야 컴파일 에러가 안 난다.
 *  }
 * 
 *  메소드 : 코드를 묶어놈
 */
public class Method04 {
	public static void main(String[] args) {
		int result = sum(1, 3); 
		
		result = sum(4, 5);
		printNum(5);
		System.out.println(result);
		
		String strNum = "5";
		printNum(strNum);
	}
	
	public static int sum(int a, int b) {
		int sum = a + b;
		
		//String str = "합계: " + sum; // 에러 (반환 타입 맞지 않음)
		
		return sum;
	}
	
	public static void printNum(int c) { 
		System.out.println("c : " + c);
	}
	
	//오버로딩 (메소드명printNum은 같지만, 매개변수 타입이 다르거나 갯수가 다름)
	public static void printNum(int c, int d) {
		System.out.println("c : " + c);
		
	}
	
	public static void printNum(String c) {
		System.out.println("c : " + c);
	}
}

