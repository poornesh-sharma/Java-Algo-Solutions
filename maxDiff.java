import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

class maxDiff {
    public static void main(String[] args) {
        int a[] = {6, 5, 4, 3, 2, 1, 0, -6, -5, -4, -3, -2, -1};


        // Function calling
        System.out.print("Maximum difference is " + maxDiff3(a));
    }

    static int maxDiff1(int a[], int n) {
        // Initialize diff, current
        // sum and max sum
        int diff = a[1] - a[0];
        int sum = diff;
        int finalDiff = sum;

        for (int i = 1; i < n - 1; i++) {
            // Calculate current diff
            diff = a[i + 1] - a[i];

            // Calculate current sum
            if (sum > 0)
                sum += diff;
            else
                sum = diff;

            // Update max sum, if needed
            if (sum > finalDiff)
                finalDiff = sum;
        }

        return finalDiff;
    }

    static int maxDiff2(int a[]) {
        int n = a.length;
        int maxDiff = -1;
        int maxRight = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > maxRight)
                maxRight = a[i];
            else {
                int diff = maxRight - a[i];
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    }

    static int maxDiff3(int a[]) {
        int a_size = a.length;
        int max_diff = a[1] - a[0];
        int min_element = a[0];
        int i;
        for (i = 1; i < a_size; i++) {
            if (a[i] - min_element > max_diff)
                max_diff = a[i] - min_element;
            if (a[i] < min_element)
                min_element = a[i];
        }
        return max_diff;
    }
}
