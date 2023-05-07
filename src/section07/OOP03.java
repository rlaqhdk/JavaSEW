package section07;

public class OOP03 {
		public static void main(String[] args) {
			Car car1 = new Car();
			
			//Car 객체 멤버 변수 접근 출력하기
			System.out.println(car1.wheel);
			
			
			Car.drive();
			car1.cleanUp();
			
			OOP03 oop03 = new OOP03();
			oop03.add(1, 3); //실행하려면 이렇게
			
			sum(4,5); //static 실행 가능
		}


public void add(int a, int b) {
	System.out.println(a + b); //메인 메소드는 static이고, 메모리에 올려져있지 않아서 실행 안됨
	}

public static void sum(int a, int b) {
	System.out.println(a + b);
}
}
