package section03;
/*
 * 6. 비트연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 * & : 대응 되는 비트가 모두 1이면 1을 반환 (비트 AND 연산자)
 * | : 대응 되는 비트 중에서 하나라도 1이면 1을 반환 (비트 OR 연산자)
 * ^ : 대응 되는 비트가 서로 다르면 1을 반환 (비트 XOR 연산자)
 * ~ : 비트가 1이면 0으로, 0이면 1로 반전시킴 (비트 NOT 연산자)
 * 
 * 7. 쉬프트연산자
 *  << : 지정한 수만큼 비트들을 전부 왼쪽으로 이동시킴(left shift 연산자)
 *  >> : 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴(right shift 연산자)
 */
public class Operator06 {
	public static void main(String[] args) {
		int num1 = 3; //컴퓨터는 2진수로밖에 표현 못함. 부호 비트로 표현 =>  0 0011
		int num2 = 5; // 										  0 0101
		
		System.out.println("num1 & num2: " + (num1 & num2)); //    위 아래로 1이 맞기 때문에 1 ? 
		System.out.println("num1 | num2: " + (num1 | num2));
		System.out.println("num1 ^ num2: " + (num1 ^ num2));
		
		// num1의 값 = 3 -> 0 0011
		// not으로 반전   -> 1 1100
		// 음의 값을 표현할 때 2의 보수 표현
		// 4 의 2 보수 값
		// 4 					-> 0 0100
		// 1의 보수   			-> 1 1011
		// 2의 보수(1의 보수 + 1)  -> 1 1100
		System.out.println("~num1: " + ~num1);
		
		//shift 연산자는 부호 비트 영향 안 받음
		int x, y;
		x = 3; //0011
		y = x << 2; // 0011 << 1100
		System.out.printf("%d << 2 = %d\n", x, y);
		y = x >> 2; // 0011 >> 2 = 0000
		System.out.printf("%d >> 2 = %d\n", x, y);
	}
}
