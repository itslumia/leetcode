public class Solution {
    void reverse(int[] a, int start, int end) {
        int tmp;
        while (start < end) {
            tmp = a[start];
            a[start] = a[end];
            a[end] = tmp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) return;
        k = k % nums.length;
        if (k == 0) return;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
}