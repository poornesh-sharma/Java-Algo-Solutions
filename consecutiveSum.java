class consecutiveSum {
    public static void main(String[] args) {
        long num = 15;
        // Function calling
        // System.out.print(consecutive(num));

        int a[][] = new int[3][];
        System.out.print(a[0]);
    }

    public static int consecutive(long num) {
        int count = 0;
        for (long i = 1; i <= num / 2; i++) {
            long counter = 1;
            long currSum = i;
            while (currSum < num) {
                currSum += i + counter;
                if (currSum == num) {
                    count++;
                    break;
                }
                counter++;
            }
        }
        return count;

    }
}
