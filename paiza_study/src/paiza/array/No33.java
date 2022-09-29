package paiza.array;

import java.util.Arrays;
import java.util.Scanner;

public class No33 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String[] line = new String[]{"izapa","paiza","zaipa"};
        Arrays.sort(line);
        for(int i = 0; i < line.length; i ++){
            System.out.println(line[i]);
        }
        sc.close();
    }
}
