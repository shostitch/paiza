package paiza.output;

import java.util.Scanner;

public class output9 {
//	public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//
//	    String n = sc.next();
//	    int mod = n.length() % 3;
//
//	    for (int i = 0; i < n.length(); i++) {
//	      if (i % 3 == mod && i != 0) {
//	        System.out.print(",");
//	      }
//	      System.out.print(n.charAt(i));
//	    }
//	    System.out.println();
//
//	    sc.close();
//	  }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    String n = sc.next();
	    int mod = n.length() % 3;

	    for (int i = 0; i < n.length(); i++) {
	      if (i % 3 == mod && i != 0) {
	        System.out.print(",");
	      }
	      System.out.print(n.charAt(i));
	    }
	    System.out.println();

	    sc.close();
	  }
}
