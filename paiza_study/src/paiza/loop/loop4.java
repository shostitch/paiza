package paiza.loop;

import java.util.Scanner;


public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        Double exp = sc.nextDouble();
        Double expSum = 0.0;
        Double exps[] = new Double[H];
        for(int i = 0; i < H; i ++){
            exps[i] = sc.nextDouble();
            expSum += exps[i];
        }
        int total = (int)(Math.ceil(expSum / exp));
        System.out.println(total);
        sc.close();
    }
}