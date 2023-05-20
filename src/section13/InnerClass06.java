package section13;

import section13.access2.Music;
import section13.access2.Singer;

public class InnerClass06 {
	public static void main(String[] args) {
		Singer s1 = new Singer(new Music() { //익명 클래스이고 객체 생성됨
			
			@Override
			public void sing() {
				System.out.println("가수가 노래를 해요!");
				
			}
			
			@Override
			public void listen() {
				System.out.println("가수가 노래를 들어요!");
				
			}	
		});
		
		s1.m.sing();
		
	}
}
