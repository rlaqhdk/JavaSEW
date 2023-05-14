package section11.access1;

public class Bus extends Car { //Car을 상속받음

	public Bus() { //생성자
		wheel = 4;
		color = "Green";
	}
	
	@Override
	public void drive() {
		System.out.println("승객을 태우고 운전 합니다.");
	}
	
	public void btnBell() {
		System.out.println("벨을 누릅니다.");
	}
}
