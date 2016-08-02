public class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int i = 0;
        while (i<=e) {
            if (nums[i] == 0) {
                swap(nums, i, s);
                s++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, e);
                e--;
            } else i++;
            
        }
        
    }
    
    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}