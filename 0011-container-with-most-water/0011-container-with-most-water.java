class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        if(height.length == 1 || height.length == 0){
            return 0;
        }
        int max_area = 0;
        while(left <= right){
            int breadth = right - left;
            int length = height[left];
            if(height[left] > height[right]){
                length = height[right];
            }
            int area = length * breadth;
            if(area > max_area){
                max_area = area;
            }
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max_area;
    }
}