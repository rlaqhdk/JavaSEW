package section13.access1;

public class MyUtil {
	public String str1 = "str1";
	public static String staticStr1 ="staticStr1";
	
	//1. 인스턴스 내부 클래스(static 없음)
	public class HelloPrinter{
		public void printHello() {
			System.out.println("내부 클래스 HelloPrinter 입니다.");
			System.out.println(str1);
			System.out.println(staticStr1);//static이여서 미리 메모리 올라가있어서 가능함
		}
	}
	
	//2. static 내부 클래스
	public static class Calculator{
		public void calc(int a, int b) {
			int result = a + b;
			System.out.println("전달 받은 두 정수의 합: " + result);
			//System.out.println(str1); //static 클래스 자체가 미리 메모리에 올라가있기 때문에 MyUtil이 생성이 되야만 호출 가능하기 때문에 불가능함
			System.out.println(staticStr1);
		}
	}
}
