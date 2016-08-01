public class Solution {
    public String getPermutation(int n, int k) {
        int[] f = new int[n+1];
        List<Integer> nums = new ArrayList<>();
        String ans = "";
        f[0] = 1;
        for (int i=1; i<=n; i++) f[i] = i * f[i-1];
        for (int i=0; i<n; i++) nums.add(i+1);
        k--;
        for (int i=1; i<=n; i++) {
            int index = k/f[n-i];
            ans += nums.get(index);
            nums.remove(index);
            k -= index*f[n-i];
        }
        return ans;
    }
}