class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left<right){
            int w,h,area;
            w = right-left;
            h = Math.min(height[left],height[right]);
            area = w*h;
            if(maxArea<area){
                maxArea = area;
            }
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}