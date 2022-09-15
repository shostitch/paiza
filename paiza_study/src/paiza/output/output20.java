package paiza.output;

public class output20 {
	public static void main(String[] args) {
	    for (int i = 1; i < 10; i++) {
	      for (int j = 1; j < 10; j++) {
//	    	  if(j == 9){
//                  System.out.println(String.format("%,2d",sum));
//              } else {
//                  System.out.print(String.format("%,2d",sum) + " | ");
//              } String.format()までが同じ記述なので
	        System.out.printf("%2d", i * j);//ここの出力をした上で後につける|や改行をifにする
	        if (j < 9) {
	          System.out.print(" | ");
	        } else {
	          System.out.println();
	        }
	      }
	      if (i != 9) {
	        for (int j = 0; j < 2 * 9 + 3 * (9 - 1); j++) {
	          System.out.print("=");
	        }
	        System.out.println();
	      }
	    }
	  }
}
