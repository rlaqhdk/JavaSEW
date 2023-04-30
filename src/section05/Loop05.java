package section05;
/*
 * 중첩 for문
 * 	for문 안에 for문
 * 
 * 
 */
public class Loop05 {
	public static void main(String[] args) {
		/*
		 * i = 0 
		 * 	j = 0
		 * ijjjjj 
		 * ****** 개행
		 * iijjjj
		 * ******개행
		 * iiijjj
		 * ******
		 * ... 반복
		 * 
		 * 
		 */
	
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println(); // 개행
		}
	}
}
