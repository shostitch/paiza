package paiza.C;

import java.util.Scanner;

public class g {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
            //hasNextLineはまだ入力があるのか確認するメソッド
        }
        sc.close();
    }
}
