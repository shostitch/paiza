package paiza.C;

public class f {
	public static void main(String[] args) {
        String str = "One cold rainy day when my father was a little boy he met an old alley cat on his street";
        // ここに文字列を分割するコードを記述する
        String[] a = str.split(" ");
        int count = 0;
        for(int i = 0; i < a.length; i ++){
            count++;
        }
        System.out.println(count);
        //String[] a = str.split(" ");
        //System.out.println(a.length);
        //これでいいのでは？
    }
}
