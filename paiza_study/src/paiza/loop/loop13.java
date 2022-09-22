package paiza.loop;

import java.util.Scanner;

	public class loop13 {
		public static void main(String[] args) {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int count = 2;
	        for(int i = 1; i <= N; i ++){
	            System.out.println(count);
	            count *= 2;
	    }
	    sc.close();
	}
}
