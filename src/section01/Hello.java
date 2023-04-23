package section01;
/* 여러 줄 주석
 * 
 */
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한 줄 주석
				System.out.println("Hello, JAVA!!!");
				
				//정수 출력 하는 메소드
				printNum(422);
				//System.out.println("num: " + num);
			}
			
			/** JavaDoc 주석(공식적 정의) 
			 * auth : 김보아 
			 * 생성일 : 2023.04.22
			 * printNum - 입력받은 정수 출력
			 * 
			 * @param num
			 */
			public static void printNum(int num) {
				System.out.println("num: " + num);
	}

}
