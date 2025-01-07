class Solution10 {
    // Merge Sort Function
    public void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the left half
            mergeSort(array, left, mid);

            // Recursively sort the right half
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Merge Function
    public void merge(int[] array, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays to hold data
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0; // Initial indexes for leftArray and rightArray
        int k = left;     // Initial index of merged subarray

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array: " + java.util.Arrays.toString(array));
        solution.mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(array));
    }
}

 //time complexity : O(nlog n)
 //space complexity : O(n)

//  The solution implements the Merge Sort algorithm, which divides the array into two halves, recursively sorts them, and then merges the sorted halves. This process is repeated until the entire array is sorted.

//  Time Complexity: O(n log n) due to the recursive division of the array and the linear merging process.
//  Space Complexity: O(n) because of the additional space used for temporary arrays to hold the left and right subarrays during the merge step.