package section06;

public class ArrayHomeWork {
	public static void main(String[] args) {
		int[][] nums = new int[7][7];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++){
			nums[i][j] = i * 7 + j + 1;
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println(); // 개행
		}
	}
}
