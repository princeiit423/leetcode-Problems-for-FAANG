//leetcode problem number -(56) ------- Merge Intervals
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals; // Edge case

        // Step 1: Sort intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] curr = intervals[0];

        // Step 2: Merge overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (curr[1] >= intervals[i][0]) { // Overlapping
                curr[1] = Math.max(curr[1], intervals[i][1]);
            } else { // No overlap, add the previous interval
                merged.add(curr);
                curr = intervals[i];
            }
        }

        merged.add(curr); // Add the last interval

        // Step 3: Convert the list to array
        return merged.toArray(new int[merged.size()][]);
    }
}