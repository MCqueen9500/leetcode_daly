class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while(i<=j){
            int len = (height[i]<=height[j]) ? height[i]:height[j];
            int bre = j - i;
            int area = len*bre;
            if(max<area){
                max = area;
            }
            if(height[i] <= height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
        
    }
}