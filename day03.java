//leetcode problem -- 05
class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
              String str=s.substring(i,j+1);
                if(isPalindrome(str)&& str.length()>longest.length()){
                    longest=str;
                }
            }
        }
            return longest;
    }
    private boolean isPalindrome(String str){
        int left=0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}