import java.util.*;  // For Arrays.sort()

public class FrequencyOfMostElement {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 4};  // Input array
        int n = arr.length;       // Size of array
        int k = 5;                // Maximum increments allowed

        // Print maximum possible frequency after at most k operations
        System.out.println(frequencyMost(arr, n, k));
    }

    // Function to find the maximum frequency of any element
    public static int frequencyMost(int[] arr, int n, int k) {

        // Step 1: Sort the array
        // Sorting helps because we only increase smaller elements
        Arrays.sort(arr);

        int left = 0;             // Left pointer of sliding window
        long totalSum = 0;        // Sum of elements in current window
        int ans = 1;              // Stores maximum frequency

        // Step 2: Expand the sliding window using right pointer
        for (int right = 0; right < n; right++) {

            // Add current element to window sum
            totalSum += arr[right];

            /*
             * Check if we can make all elements in the window
             * equal to arr[right] using at most k increments
             *
             * Required operations =
             * arr[right] * windowSize - totalSum
             */
            while ((long) arr[right] * (right - left + 1) - totalSum > k) {
                // Shrink window from left if operations exceed k
                totalSum -= arr[left];
                left++;
            }

            // Update maximum window size (frequency)
            ans = Math.max(ans, right - left + 1);
        }

        // Return the maximum frequency found
        return ans;
    }
}
