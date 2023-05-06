package section08;
/*
 * 메소드(Method) 
 *  프로그래밍에서 메소드는 하나의 특별한 목적의 작업을 수행하기 위해 설계된 프로그램 코드 집합.
 *  객체의 기능역할을 한다.
 *  
 *  메인메소드에 모아놓은 코드를 쫙 실행함
 *  
 *  메소드 구조
 *  (접근제한자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명) {
 *  	실행할 코드(명령문 집합)
 *  
 *  	return 반환값;
 *  }
 *  
 *  오버로딩(Overloading)
 *	 클래스 내에서 같은 이름을 가진 메소드를 여러개 정의하는 것을 말한다.
 *	 매개변수 개수 또는 타입이 다르면 가능.
 *
 */
public class Method01 {
	public static void main(String[] args) {
		//Method01.hello();
		hello(); // hello 메소드 호출(call)
		
		printName("피카츄"); // 이 값이 아래 String name으로 들어감
		
		printMember("boa", "김보아", 23); //String, String, int
	
		printMember("boa2", "김보아2", "전기타입");
		
		String[] pokemons = {"피카츄", "라이츄", "파이리", "꼬부기"};
		
		printPokemon(pokemons);
	}
	/*
	 * 1. 인자(매개변수명, 파라미터 등등 부르는 이름 다 다름) x ,리턴 x
	 * 	-> 호출 시 실행하고 끝나는 메소드
	 * 
	 */
	public static void hello() {
		System.out.println("Hello, World!");
	}
	
	//2. 인자 o, 리턴 x -> 인자 값을 받아 실행하고 끝나는 메소드
	public static void printName(String name) { //String 매개변수타입 , name 매개변수명 , String name = 피카츄;
		System.out.println("이름: " + name);
	}
	
	//3. 인자 o, 여러타입 여러개 리턴 x
	public static void printMember(String id, String name, int age) {
		System.out.println("ID: " + id);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	// 4. 오버로딩(overloading 메소드)
	public static void printMember(String id, String name, String type) {
		System.out.println("ID: " + id);
		System.out.println("이름: " + name);
		System.out.println("타입: " + type);
	}
	// 5. 인자 o, 배열타입 리턴 x
	public static void printPokemon(String[] mons) {
		for(String mon : mons) {
			System.out.println(mon);
		}
	}
}
