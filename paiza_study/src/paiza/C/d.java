package paiza.C;

import java.util.Scanner;

public class d {
	public static void main(String[] args) {
	      int shouwa;
	      Scanner sc = new Scanner(System.in);
	      int seireki = sc.nextInt();
	      int num = sc.nextInt();
	      for(int i = 0; i < num; i ++){

	          System.out.print("西暦" + (seireki+i) + "年は");
	          shouwa = (seireki+i) - 1925;
	          System.out.println("昭和" + shouwa + "年です");
	      }
	      sc.close();
	}
}
