public class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        for (int i=0; i<=e; i++) {
            while (nums[i] == 2 && i < e) swap(nums, i, e--);
            while (nums[i] == 0 && i > s) swap(nums, i, s++);
            
        }
        
    }
    
    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}