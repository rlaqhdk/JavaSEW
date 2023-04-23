package section02;
/*
 * 5. String 형(문자열)
 *  문자열을 저장할 수 있다.
 *  
 * 선언방법
 * 	 String 변수명;
 *   
 * 기본형 - boolean(1byte), char(2byte), byte, short, int, long, float,double 
 * 		  실제 값을 전달
 * 
 * 참조형(만들어져있음) - 기본형을 제외한 모든 객체(클래스 코드로 되어있다)
 * 		   주소 값을 전달
 * 		   속성(값=변수), 기능(메소드) 
 */
public class Variable06 {
	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요.";
		System.out.println("str: " + str);
		
		/* 0 1 2 3 4 => 인덱스번호
 		 * h e l l o 
		 * 
		 */
		String hello = "hello";
		System.out.println("1번 인덱스: " + hello.charAt(1)); //=> 1번 인덱스의 문자값을 갖고와
		System.out.println("2번 인덱스부터 4번 인덱스까지: " + hello.substring(2, 4)); //=> 2번부터 4번 전까지 = ll
		
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");//특별시가 들어가면 true
		addr = "경기도 부천시 원미구";
		boolean isContain2 = addr.contains("안녕");
		//if 조건문
		if(isContain) { // true 이면 실행
			System.out.println("특별시민 입니다!!");
		} else {
			System.out.println("특별시민이 아닙니다!!");
		}
		if(isContain2) { // true 이면 실행
			System.out.println("특별시민 입니다!!");
		} else {
			System.out.println("특별시민이 아닙니다!!");
		}
	}
}
