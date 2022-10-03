package paiza.array;

import java.util.Arrays;
import java.util.Scanner;

public class No35 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] line = new String[N];

        for(int i = 0; i < line.length; i ++){
            line[i] = sc.next();
        }
        Arrays.sort(line);
        for(int i = 0; i < line.length; i ++){
            System.out.println(line[i]);
        }
        sc.close();
    }
}
