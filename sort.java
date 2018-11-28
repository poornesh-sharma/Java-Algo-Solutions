// Question 1

class sort {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 0, 1, 0, 0, 1};
        sortArray(arr);
        System.out.print("Array after sorting is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sortArray(int[] arr) {
        // Counter to maintain the left positions of 0
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            // If any value is less than 1 that is 0, should be placed at j position
            if (arr[i] < 1) {
                // Swap the i position with whicever number was at j position
                j++;
                if (arr[j] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
