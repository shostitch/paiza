package paiza.output;

import java.util.Scanner;

public class output5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = new String[10];
        for(int i = 0; i < text.length ; i ++){
            text[i] = sc.next();
            if(i != 9){
                System.out.print(text[i] + " ");
            } else {
                System.out.println(text[i]);
            }
        }
        sc.close();
    }
}
