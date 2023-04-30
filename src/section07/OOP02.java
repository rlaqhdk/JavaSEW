package section07;

public class OOP02 {
	public static void main(String[] args) {
		System.out.println(Card.height);
		System.out.println(Card.width); //메모리 올리기 전인데도 컴파일 에러 안나고 출력됨.
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 number: " + card1.number);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);
		
		System.out.println();
		
		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 number: " + card2.number);
		System.out.println("card2 width: " + card2.width);
		System.out.println("card2 height: " + card2.height);
		
		System.out.println("==========================================");
		card1.number = "K";
		
		System.out.println(card1.number);
		System.out.println(card2.number);
		
		//static으로 선언했을 때 실제로 값이 안 들어감.
		//static(메모리에 미리 올라가있음, 실행될 때 올라감)으로 선언된 변수들은 값이 같이 바뀜(static 변수는 모든객체가 공유된다)
		//Card.width = 72;
		card1.width = 72;
		System.out.println(card1.width); //72
		System.out.println(card2.width); //72
		
	}
}
