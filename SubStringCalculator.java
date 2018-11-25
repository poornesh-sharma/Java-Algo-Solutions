import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class SubStringCalculator {
    public static void main(String[] args) {
        String s = "kincenvizh";


        // Function calling
        System.out.print(substringCalculatorFun2(s));
        // substringCalculatorFun3(s);
    }

    public static long substringCalculatorFun(String s) {
        long n = s.length();
        long count = 0;
        Map<String, Integer> substrings = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String temp = s.substring(i, j);
                if (!substrings.containsKey(temp)) {
                    substrings.put(temp, 1);
                    count++;
                }
            }
        }
        return count;
    }

    public static long substringCalculatorFun2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer count = map.get(c);
            if (count == null)
                count = 0;
            map.put(c, count + 1);
        }
        int n = map.size();
        int sum = ((n + 1) * n) / 2;
        return sum;
    }

    public static long substringCalculatorFun3(String s) {
        long n = s.length();
        long count = 0;
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                for (int k = i; k <= j; k++) {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
                count++;
            }
        }
        return count;
    }


}
