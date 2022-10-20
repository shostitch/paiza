package paiza.C;

public class a {
	public static void main(String[] args) {
        int price = 128;
        int weight = 300;
        int amount = (int)(price / 100.0 * weight);
        // int型amountにdouble型の数値が入らないのでint型にキャストする形で書いている
        System.out.println("100グラム" + price + "円の肉、" + weight + "グラムは、" + amount + "円です。");
    }
}
