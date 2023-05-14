package section11;

import section11.access1.Bus;
import section11.access1.Car;
import section11.access1.SchoolBus;

public class Polymorphism02 {
	
	public static void main(String[] args) {
		Car c1 = new SchoolBus(); //SchoolBus는 부모 Bus를 상속받고, Bus는 부모 Car을 상속받아서 가능함.
		//Car에는 drive밖에 없어서 drive만 컴파일 가능하며, 
		//SchoolBus가 heap영역에 인스턴스가 되기 때문에 heap영역에 올라간 schoolbus가 컴파일 됨
		//따라서 Car - drive, c1 = SchoolBus 참조 학생을 태우고 운전을 합니다. 출력
		c1.drive();
		
		Bus b1= (Bus) c1; //c1이 참조하는 것은 SchoolBus이기 떄문에 
		//SchoolBus drive에 학생을 태우고 운전을 합니다가 나옴
		b1.drive(); //b1 = c1
		System.out.println("c1: " + System.identityHashCode(c1));//주소 값 b1과 같음
		System.out.println("b1: " + System.identityHashCode(b1));//주소 값 c1과 같음
		
		
	}
}
