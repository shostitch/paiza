package paiza.D;

import java.util.Scanner;

public class paiza3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

		if(numbers[0] * numbers[1] <= numbers[2]) {
			System.out.println(numbers[0]);//numbersのインデックス0を出力
	        System.out.println(numbers[1]);//numbersのインデックス1を出力
	        System.out.println(numbers[2]);
		}
		sc.close();

	}
}
