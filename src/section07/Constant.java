package section07;
/*
 * 상수
 *  처음 할당된 값 변경되지 않는다.
 *  final 예약어 사용
 *  보통 대문자로 선언한다.
 *  Method area - Constant Pool에 저장
 *  
 *  Heap Area에는 내가 생성한 객체들이 저장됨.
 * 
 */
public class Constant {
	
	static final double PI = 3.14159; //PI = 상수 (처음 값을 대입하고 값 재정의 불가능;
	
	public static void main(String[] args) {
		//원의 반지름
		int r = 10;
		
		//원의 넓이
		double area = PI * r * r;
		System.out.println("원의 넓이: " + area);
		
		area = 0;
	
	}
}
