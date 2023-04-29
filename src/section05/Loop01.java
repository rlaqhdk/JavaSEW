package section05;
/*
 * 반복문
 *  특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어
 *  
 * 1. while 문
 *  while(조건문) {
 *  	반복 수행할 코드
 *  }
 *  
 *  break 문
 *  	반복문에서 break문은 반복분을 즉시 종료하는 명령어
 * 
 *  continue 문
 *  	반복문에서 해당 반복을 건너뛰고 다음 반복을 강제로 실행하게 하는 명령어 (즉, 아래 코드 실행 안되고 skip)
 */
public class Loop01 {
	public static void main(String[] args) {
	//while문을 이용하여 0 ~ 99 까지 출력하기
	
	//블럭 안에 조건문이 true면 break, false면 계속 반복
	/*int count = 0;
	while(true) {
		System.out.println(count);
		++count;
		if(count == 100)
			break;
		}*/
		
		/*int count = 0;
		while(count < 100) {
			System.out.println(count);
			++count;
		}*/
		
		/*int count = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			++count;
			if(count == 100)
				isRun = false;
			}*/
		
		int i = 0;
		System.out.println(i); //0도 나오게 하기 위해서
		while(i < 7) {
			i++;
			if(i == 3) {
				continue;
			}
			System.out.println(i); // 1, 
		}
	}
}
