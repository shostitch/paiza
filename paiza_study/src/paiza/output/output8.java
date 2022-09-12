package paiza.output;

import java.util.Scanner;

public class output8 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String N = sc.next();
	        for(int i = 0; i < N.length(); i ++){
	            if(i != 0 && i % 3 == 0){
	                System.out.print(",");
	            }
	            System.out.print(N.charAt(i));
	        }
	        System.out.println();
	        sc.close();
	}
}
