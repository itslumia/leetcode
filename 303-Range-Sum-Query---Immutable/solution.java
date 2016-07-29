public class NumArray {
    int[] ans;
    public NumArray(int[] nums) {
        this.ans = new int[nums.length+1];
        int k = 0;
        ans[0] = 0;
        for (int i=1; i<nums.length+1; i++) {
            k += nums[i-1];
            ans[i] = k;
        }
    }

    public int sumRange(int i, int j) {
        return ans[j+1]-ans[i];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);