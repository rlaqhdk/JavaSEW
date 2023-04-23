package section02;

import java.math.BigDecimal;

/*
 * 데이터 표현방식
 *   정수표현
 *      컴퓨터는 2진수로 표현(bit)  
 *      부호비트(Most Significant Bit) + 수지비트 (양수인지 음수인지)
 *      음의 값을 표현할 때 2의 보수 표현
 *      
 * 실수표현
 *      지수부(e)비트 + 가수부(m)비트
 * 실수표현 수식
 * 		±(1.m)*2^(e-127)
 * 부동소수점오차가 생기니깐 예외처리
 * 		정확한 실수 표현 불가능 근사치 값으로 인해 생긴 오차
 * 
 */
public class Variable05 {
	public static void main(String[] args) {
		
		float f = 0.0f;
		double d = 0.0;
		BigDecimal bd = new BigDecimal(0.0);
		 
		//for 반복문
		for(int i = 0; i < 100; i++) {
			f += 0.1f; //10.000002 10이 나와야하는데 0.0000002부동소수점오차 생김
			d += 0.1d; //얘도 오차 생김
			bd = bd.add(new BigDecimal(0.1)); //오차가 줄어듬
		}
		System.out.println(f);
		System.out.println(d);
		System.out.println(bd);
		
	}
}
