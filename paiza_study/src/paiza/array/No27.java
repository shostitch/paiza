package paiza.array;

import java.util.ArrayList;
import java.util.Scanner;

public class No27 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        a.add(m - 1, k);

        for (int x : a) {
            System.out.println(x);
        }

        sc.close();
    }
}
