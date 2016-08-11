public class NumArray {
    private int[] tree;
    private int tmp;
    
    public NumArray(int[] nums) {
        tmp = nums.length;
        if (tmp == 0) return;
        int x = (int) (Math.ceil(Math.log(nums.length) / Math.log(2)));
        int size = 2 * (int) Math.pow(2, x) - 1;
        tree = new int[size];
        constructTree(nums, tree, 0, nums.length-1, 0);
    }
    
    private void constructTree(int[] input, int[] segTree, int low, int high, int pos) {
        if (low == high) {
            segTree[pos] = input[low];
            return;
        }
        int mid = (low + high) / 2;
        constructTree(input, segTree, low, mid, 2*pos+1);
        constructTree(input, segTree, mid+1, high, 2*pos+2);
        segTree[pos] = segTree[2*pos+1] + segTree[2*pos+2];
    }
    

    void update(int i, int val) {
        change(i, val, 0, 0, tmp-1);
    }
    
    
    
    private void change(int i, int val, int pos, int low, int high) {
        if (low == high) tree[pos] = val;
        else {
            int mid = (low + high) / 2;
            if (i <= mid) change(i, val, 2*pos+1, low, mid);
            else change(i, val, 2*pos+2, mid+1, high);
            tree[pos] = tree[2*pos+1] + tree[2*pos+2];
        }
    }
    
    
    public int sumRange(int i, int j) {
        return findSum(tree, i, j, 0, tmp-1, 0);
    }
    
    private int findSum(int[] segTree, int qlow, int qhigh, int low, int high, int pos) {
        if (qlow <= low && qhigh >= high) return segTree[pos];
        
        if (qlow > high || qhigh < low) return 0;
        
        int mid = (low + high) / 2;
        return findSum(segTree, qlow, qhigh, low, mid, 2*pos+1) + findSum(segTree, qlow, qhigh, mid+1, high, 2*pos+2);
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);