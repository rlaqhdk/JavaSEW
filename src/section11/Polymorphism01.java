package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

/*
 * 다형성(Polymorphism)
 *  같은 인터페이스 또는 부모를 공유하는 객체가 여러 유형의 타입을 가질 수 있는 것
 * 
 * 생성자를 쓰는 목적
 *  초기화를 하기 위해서
 */
public class Polymorphism01 { 
	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.btnBell();
		b1.drive();
		
		
		
		Car c1 = new Bus(); //new Bus = 객체, new Bus 주소값 = 0x001 //Car로 선언, Bus로 상속, 결과 -> Bus께 나옴 = 다형성 
		c1.drive();
		//c1.btnBell(); <- 컴파일 에러, Car클래스에는 btnBell 없어서 에러
		
		//class Bus의 정보와 class SchoolBus의 정보가 일치해야됨 
		Bus b2 = new SchoolBus(); //new SchoolBus = 객체 
		//SchoolBus참조 0X003, bus에는 drive가 있기 때문에 나머진 컴파일 에러, 
		//heap영역엔 SchoolBus 메모리가 올라가기 때문에 schoolbus에 drive가 출력됨
		//따라서 Bus의 drive, SchoolBus에 학생을 태우고 운전을 합니다. 출력
		b2.drive(); //b2가 참조하는 것은 schoolbus
		//b2.stopPannel(); <- 컴파일 에러 // Bus에는 stopPannel이 없음
		
		
		//(SchoolBus) 강제 형 변환, 부모에서 자식 -> 다운캐스팅(Variable07)
		SchoolBus sb1 = (SchoolBus)b2; 
		sb1.drive();
		sb1.stopPannel();
		
	}
}
