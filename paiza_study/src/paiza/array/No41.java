package paiza.array;

import java.util.ArrayList;
import java.util.Scanner;

public class No41 {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        int a = 2;
        int b = 3;
//        int d = 0;
//        int e = 0;
//        int c = 0;
        for(int i = 0;i < N ; i++){
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }
//        for(int i = 0;i < N ; i++){
//            d = x.get(i) - a;
//            e = y.get(i) - b;
//            if(d >= 0 && e >= 0){
//                c = d + e;
//            } else if(d < 0 && e >= 0){
//                c = -d + e;
//            } else if(d >= 0 && e < 0){
//                c = d - e;
//            } else {
//                c = -d - e;
//            }
//
//            System.out.println(c);
//        }
        for (int i = 0; i < N; i++) {
            System.out.println(Math.abs(x.get(i) - a) + Math.abs(y.get(i) - b));
        }// Math.abs(絶対値にしたい値)ーでも絶対値になおるので条件分岐頑張る必要がない
        sc.close();
    }
}
