package paiza.C;

public class b {
	public static void main(String[] args) {
        int seireki, shouwa;
        for(seireki = 1926; seireki <= 1988; seireki ++){
            System.out.print("西暦" + seireki + "年は");
            shouwa = seireki - 1925;
            System.out.println("昭和" + shouwa + "年です");
        }
    }
}
