class InsertionSort {
    void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int cursor = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > cursor) {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev + 1] = cursor;
        }
    }

    /* Prints the array */
    void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        InsertionSort ob = new InsertionSort();
        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("unsorted");
        ob.printArray(arr);
        ob.insertionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
