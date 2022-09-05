package paiza.D;

// 整数Nが与えられます。Nが 100 以下の場合はYESを、そうではない場合はNOを出力してください。
import java.util.Scanner;

public class paiza2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N <= 100) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}
