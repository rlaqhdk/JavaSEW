package section11.access1;

public class SchoolBus extends Bus{ //Bus를 상속받음
	
	public SchoolBus() { //생성자가 있는 이유 : 초기화를 하기 위해서
		wheel = 4;
		color = "Yellow";
	}
	
	@Override
	public void drive() {
		System.out.println("학생을 태우고 운전을 합니다.");
	}
	
	public void stopPannel() {
		System.out.println("학생 하차시 정지 판넬 작동!");
	}
	
}
