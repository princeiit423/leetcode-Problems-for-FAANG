//leetcode problem --- 11 (container with most water)
public class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int ans=0;
        while(left<right){
            int minHeight=Math.min(height[left],height[right]);
            ans= Math.max(ans,minHeight* (right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}{

}
