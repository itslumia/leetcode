public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        int nA = nums[0];
        int countA = 1;
        int nB = nums[0];
        int countB = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nA) countA++;
            else if (nums[i] == nB) countB++;
            else if (countA == 0) {
                nA = nums[i];
                countA = 1;
            } else if (countB == 0) {
                nB = nums[i];
                countB = 1;
            } else {
                countA--;
                countB--;
            }
        }
        countA=0;
        countB=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == nA) countA++;
            else if (nums[i] == nB) countB++;
        }
        if (countA > (nums.length/3)) ans.add(nA);
        if (countB > (nums.length/3) && !ans.contains(nB)) ans.add(nB);
        return ans;
    }
}