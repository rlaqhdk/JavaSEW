package section02;
/*
 * 데이터타입 형변환
 *  1.업캐스팅(프로모션)
 *   - 표현 범위가 더 큰 데이터형으로 변환하기
 *   - 자동으로 가능
 *   - 데이터 손실이 없다.
 *   
 *  2. 다운캐스팅(디모션)
 *   - 표현 범위가 더 작은 데이터형으로 변환하기
 *   - 명시적으로 해야한다.
 *   - 데이터 손실이 있을 수 있다.
 */
public class Variable07 {
	public static void main(String[] args) {
		//업캐스팅 예
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환
		
		float iFloat = 10.1f;
		double iDouble = iFloat; //자동으로 형변환
		
		double iDouble2 = 1.012345678912345; 
		
		//다운캐스팅 예
		float iFloat2 = (float)iDouble2;
		System.out.println("iFloat2: " + iFloat2); //float이 표현할 수 있는 자리는 7자리이기 때문에 잘림(7자리에서 잘림)
		
		int iInt2 = (int)iDouble; //소수점 잘라내기
		System.out.println("iInt2: "+ iInt2);
		
	}
}
