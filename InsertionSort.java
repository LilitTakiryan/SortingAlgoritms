class InsertionSort {
    void insertionSort(int[] arr) {
        //start by 1 assuming left is sorted
        for (int i = 1; i < arr.length; i++) {
            int cursor = arr[i];
            int prev = i - 1;

            //while loop  will work until prev=0, then for loop will iterate once again,
            //if second pair is done but first pair needs to be swapped -> prev>=0
            while (prev >= 0 && arr[prev] > cursor) {
                arr[prev + 1] = arr[prev];
                // we copy the array at index arr[prev]
                //to the right side //prev+1
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