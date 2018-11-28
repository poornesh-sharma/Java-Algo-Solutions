// Question 3

class palindrome {
    public static void main(String[] args) {
        String s = "maeamd";
        String s2 = "mmaad";
        System.out.println(checkPalindrome(s));
        System.out.println(checkPalindrome(s2));
    }

    static boolean checkPalindrome(String s) {
        // The number of odd count charecters in the list of charecters should be 1 or 0
        // only then any combination of these charecters can become palindrome
        int[] map = new int[128];
        int oddCount = 0;
        for (int i = 0; i < s.length(); i++) {
            // Every time we find a charecter we increment the value at its ASCII position
            map[s.charAt(i)]++;
            if (map[s.charAt(i)] % 2 == 0) {
                // If we get even after the increment then we decrease the oddCount by 1
                oddCount--;
            } else {
                // If the oddCount at that position is odd then we increment our total oddCount
                oddCount++;
            }
        }
        // At the end if there are more than 1 oddCount then any combination of this string can't
        // be
        // palindrome
        return oddCount <= 1;
    }
}
