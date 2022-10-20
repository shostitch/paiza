package paiza.C;

import java.util.ArrayList;

public class e {
	public static void main(String[] args) {
        ArrayList<String> weapon = new ArrayList<String>();
        weapon.add("木の棒");
        weapon.add("鉄の剣");
        weapon.add("サビた剣");
        // ここに、要素を上書きするコードを記述する
        weapon.set(2,"石斧");
        weapon.remove(2);
        weapon.size();
        for (String item : weapon) {
            System.out.println(item);
        }
        //String[] team_array = team_str.split(",");
        //,で区切って出力
    }
}
