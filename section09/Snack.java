package section09;

public class Snack {
	//기본형/전역변수/동적변수
	int price  = 3000;
	
	
	//객체 생성 직전에 실행되는 생성자
	public Snack() {
		this.price = 2000;
	}
	
	void info() {
		System.out.println("과자의 가격은 " + price + "원입니다.");
	}
}
