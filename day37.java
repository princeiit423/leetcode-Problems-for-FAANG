//leetcode problem number (88) --------------------- Merge Sorted array
import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;    
        int j = n - 1;    
        int k = m + n - 1;

        // Merge in reverse to avoid overwriting elements
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 has leftover elements
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
