//leetcode problem number 448 -------- Find all number disapeeared in array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> map = new HashSet<>(); // initialise hash set here
        for (int num : nums) {
            map.add(num); // Add unique numbers in set here
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) { // Apply loop from i=1 to i= nums.length
            if (!map.contains(i)) {
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}