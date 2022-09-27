package paiza.array;

public class No7 {
	public static void main(String[] args) {
//        int[][] num = new int[2][];
//        num[0] = new int[6];
//        num[1] = new int[6];
//
//        num[0][0] = 1;
//        num[0][1] = 2;
//        num[0][2] = 3;
//        num[0][3] = 4;
//        num[0][4] = 5;
//        num[0][5] = 6;
//
//        num[1][0] = 8;
//        num[1][1] = 1;
//        num[1][2] = 3;
//        num[1][3] = 3;
//        num[1][4] = 1;
//        num[1][5] = 8;
//
//        System.out.println();
		//コードが汚すぎるし無駄も多い。答えもわからない
	        int[][] nums = new int[][] {{1, 2, 3, 4, 5, 6}, {8, 1, 3, 3, 1, 8}};
	        int a = nums.length;
	        int b = nums[0].length;
	        System.out.println(a * b);
    }
}
