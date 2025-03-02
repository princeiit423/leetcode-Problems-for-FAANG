//leetcode problem number (70) ------------- (Climbing stairs)
class Solution {
    public int climbStairs(int n) {
        int i=1,j=2,sum=0;
        if(n==2){return 2;}
        if(n==1){return 1;}
        for(int k=2;k<n;k++)
        {
            sum =i+j;
            i=j;j=sum;
        }return sum;
    }
}