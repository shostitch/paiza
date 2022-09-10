package paiza.output;

public class output2 {
    public static void main(String[] args) {
//        System.out.println(813);
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(923874);
//        System.out.println(23648);
//        System.out.println(782356);
//        System.out.println(3256);
//        System.out.println(2342);
//        System.out.println(24324);
//        System.out.println(112);
    	// この書き方だと毎回System.out.printlnを記入することになりオブジェクト指向ではない
    	int[] N = new int[] {
			813,
			1,
			2,
			923874,
			23648,
			782356,
			3256,
			2342,
			24324,
			112,
    	};
    	for(int num : N) {
    		System.out.println(num);
    	}
    	// 変数配列にカンマ区切りで値を代入、閉じ波括弧の後の；忘れずに
    	// num変数に（Nの先頭の数値）から順番に出力される
    }
}
