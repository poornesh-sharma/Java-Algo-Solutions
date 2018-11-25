import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

class countDuplicates {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        System.out.print(countDuplicatesFun(arr));
    }

    public static int countDuplicatesFun(List<Integer> numbers) {
        int finalCount = 0;
        Collections.sort(numbers);
        int cur_num = numbers.get(0);
        boolean curNumberCounted = false;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == cur_num && !curNumberCounted) {
                curNumberCounted = true;
                finalCount++;
            }
            if (numbers.get(i) != cur_num) {
                cur_num = numbers.get(i);
                curNumberCounted = false;
            }
        }
        return finalCount;
    }
}
