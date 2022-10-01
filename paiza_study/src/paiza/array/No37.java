package paiza.array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class No37 {
	public static void main(String[] args) {
        // List<String> list1 = new ArrayList<String>(Arrays.asList("1", "3", "5", "1", "2", "3", "6", "6", "5", "1", "4"));
        // List<String> list2 = new ArrayList<String>(new HashSet<>(list1));
        //[1, 2, 3, 4, 5, 6] こういう結果になっちゃう
        //System.out.println(list2);

        List<Integer> li = Arrays.asList(1, 3, 5, 1, 2, 3, 6, 6, 5, 1, 4);//リストに直接数字を代入
        Set<Integer> a = new TreeSet<Integer>(li);//TreeSetは重複なしのソート並び替え

        for (int x : a) {
            System.out.println(x);
        }
    }
}
