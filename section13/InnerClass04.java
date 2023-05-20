package section13;

import section13.access2.Music;

/*
 * 익명 클래스(Anonymous Class)
 *  이름이없는 클래스로 (폴더에 만들어질때 이름이 없어서 1로 해놈), 클래스 정의와 동시에 인스턴스를 생성하는 방식이다.
 * 	일회용 클래스(재사용 x) 이 메서드 안에서만 사용 가능
 * 
 * 상수 = 변하지 않고, 항상 일정한 값을 갖는 수
 *  
 */
public class InnerClass04 {
	public static void main(String[] args) {
		Music music = new Music() { //익명클래스 -> Music을 상속 받고 있는 이름 없는 클래스
			@Override
			public void sing() {
				System.out.println("노래를 불러요~");
				
			}
			
			@Override
			public void listen() {
				System.out.println("음악을 들어요~");
				
			}
		};
		music.listen();
		music.sing();
		
		//music.GENRE = "클래시"; //인터페이스의 변수는 상수라 변경 불가!!
		
		String brand = new Music() {
			private String brand = "하이브";
			
			
			@Override
			public void sing() {
				System.out.println("BTS가 노래를 해요!");
				
			}
			
			@Override
			public void listen() {
				System.out.println("하입보이 노래를 들어요");
				
			}
			public String getBrand() {
				return brand;
			}
		}.getBrand();
		
		System.out.println("Brand: " + brand);
	}
}
