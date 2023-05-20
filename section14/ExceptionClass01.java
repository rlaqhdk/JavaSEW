package section14;
/*
 * 예외(Exception)
 *  프로그램 실행 중에 발생할 수 있는 예기치 않은 상황 또는 오류를 나타냄
 *  
 * 에러 메세지(ArithmeticException)
 *  수학적 오류 
 *  에러에 대한 메시지를 다 알고 있음
 *  
 *  예외처리 방법
 *  try {
 *  	정상 실행 코드
 *  }catch(익셉션클래스명 변수명){
 *  	해당 예외가 발생했을 경우 실행할 코드
 *  }
 */
public class ExceptionClass01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0; 
		int result = 0;
		
		/*
		if(num2 != 0) {//에러 안나게 if문(경고문 만듬: 사용자한테 에러를 보여줄 순 없으니 경고문)
			result = num1 / num2; //0을 나눌 수 없어서 에러
			System.out.println("resul : " + result);
			
		}else {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다");
		}		*/
		
		try {
			result = num1/num2;
			System.out.println("result: " + result);
		}catch(ArithmeticException ae) {
		System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		ae.printStackTrace(); //에러메시지 띄워줌
		System.out.println("에러메시지: " + ae.getMessage()); //에러메시지를 간단하게 보고싶으면
		}
	}
}
