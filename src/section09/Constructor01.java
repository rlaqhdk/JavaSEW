package section09;
/*
 * 생성자(Constructor)
 *  객체를 생성할 때 호출하는 반환 값이 없는 메소드 (주의 메소드는 아님)
 *  객체 초기화 목적에 사용
 *  클래스 명과 동일하다
 *  오버로딩 가능하다
 *  
 */
public class Constructor01 {
	public static void main(String[] args) {
		Snack chip = new Snack();
		Snack chip2 = new Snack();
		chip.price = 2000;
		chip.info();
		chip2.info();
		
		//지역변수 - 초기화 안 하면 컴파일 에러(반드시 초기화해야됨)
		//int num1; //선언만 함
		//System.out.println(num1);
		
		
		
	}
}
