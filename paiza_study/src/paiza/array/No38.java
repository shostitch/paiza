package paiza.array;

import java.util.ArrayList;
import java.util.Scanner;

public class No38 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int min = 100;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < N; i ++){
            nums.add(sc.nextInt());
        }
        for(int i = 0; i < N; i ++){
            if(max < nums.get(i)){
                max = nums.get(i);
            }
            if(min > nums.get(i)){
                min = nums.get(i);
            }
        }
        System.out.println(max + " " + min);
        sc.close();
    }
}
