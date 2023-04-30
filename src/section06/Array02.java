package section06;

public class Array02 {
	public static void main(String[] args) {
		// 배열객체 생성하기
		String[] names = new String[6];
		
		// 배열 값 대입하기
		names[0] = "피카츄";
		names[1] = "라이츄";
		names[2] = "파이리";
		names[3] = "꼬부기";
		names[4] = "버터플";
		names[5] = "야도란";
		
		// 값 가져오기
		System.out.println(names[3]);
		
		// 배열의 길이
		System.out.println(names.length); // names.length(names의 길이) = 6
		
		// 배열 for문을 사용하여 전체 출력하기
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			// i = 0 -> names[0] -> 피카츄
			// i = 1 -> names[1] -> 라이츄
			// i = 2 -> names[2] -> 파이리
			// i = 3 -> names[3] -> 꼬부기
			// i = 4 -> names[4] -> 버터플
			// i = 5 -> names[5] -> 야도란
		}
		
	}
}
