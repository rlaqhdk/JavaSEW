package section03;
/*
 * 4. 논리 연산자
 *  && : AND 조건, 교집합 개념, 양쪽 모두 true 일때만 true
 *  || : OR 조건, 합집합 개념, 어느 한 쪽이 ture 이면 true
 *  !  : NOT 조건, 여집합 개념, 논리 값을 반전 시킨다
 *  
 * 
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false; // AND조건이기 때문에 두 항의 값이 다르기 때문에 false
		System.out.println("&&: " + result);
		
		boolean result1 = true || false; //OR조건이기 때문에 true가 있으면 무조건 true
		System.out.println("||: " + result1);
		result = true || false;
		System.out.println("||: " + result);
		
		result = (10 < 20 || 5 == 4 || 1 == 0);
		System.out.println("result: " + result);
		
		System.out.println("! : " + !result); // 바로 위에 result 값은 true였기 때문에 !result = !true = false
		
		String order = "영화예매";
		if(order == "식품" || order == "전기전자" || order == "의류") {
			System.out.println("식품/전기전자/의류 카테고리에서 주문하였습니다.");
		}else {
			System.out.println("식품/전기전자/의류 외의 카테고리에서 주문하였습니다.");
		}
		
		result = !(true && true && true) || false;
		System.out.println(result);
	}
}
