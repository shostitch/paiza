package paiza.array;

public class No8 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        int[][] nums = new int[][] {{6, 5, 4, 3, 2, 1}, {3, 1, 8, 8, 1, 3}};
        for(int i = 0; i < nums.length; i ++){
            for(int j = 0; j < nums[0].length; j ++){
                if(j < nums[0].length -1){
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.println(nums[i][j]);
                }
            }
        }
    }
}
