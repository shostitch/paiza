package paiza.array;

import java.util.Arrays;
import java.util.Scanner;

public class No36 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String[] line = new String[N];

        for(int i = 0; i < line.length; i ++){
            line[i] = sc.next();
        }
        Arrays.sort(line);
//        for(int i = 0; i < line.length; i ++){
//            if(i == K -1){
//                System.out.println(line[i]);
//            }
//        } 要はK番目を出すだけなので
        System.out.println(line[K-1]);// これでいい
        sc.close();
    }
}
