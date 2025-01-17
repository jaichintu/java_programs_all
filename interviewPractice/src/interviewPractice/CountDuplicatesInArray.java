package interviewPractice;

public class CountDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 1, 2, 3, 5, 6,6,6, 7, 8, 9, 1 ,1,1,1};

        // Sort the array (you can use any sorting algorithm)
        bubbleSort(array);

        int duplicateCount = 0;
        int prev = array[0];
        boolean foundDuplicate = false;

        // Iterate through the sorted array to count duplicates
        for (int i = 1; i < array.length; i++) {
            if (prev == array[i]) {
                if (!foundDuplicate) {
                    duplicateCount++;
                    foundDuplicate = true;
                }
            } else {
                foundDuplicate = false;
            }
            prev = array[i];
        }

        System.out.println("Number of duplicates in the array: " + duplicateCount);
    }

    // Bubble sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

