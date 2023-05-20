package section13;

public class InnerClass02 {
	public static void main(String[] args) {
		new InnerClass02.InnerClass().info();
		
	}
	
	
	static class InnerClass { //static 메모리에 올라감
		public void info() { //static 아니여서 메모리 안올라감(올라가게 하려면 new를 사용해서 호출)
			System.out.println("static 내부 클래스 일반 메소드 입니다.");
			
		}
	}
}
