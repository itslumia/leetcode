public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> all = new ArrayList<>();
        for (int i=0; i<nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                int[] tmp = new int[2];
                tmp[0] = nums1[i];
                tmp[1] = nums2[j];
                all.add(tmp);
            }
        }
        Collections.sort(all, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (Integer)((a[0]+a[1])-(b[0]+b[1]));
            }
        });
        List<int[]> ans = new ArrayList<>();
        for (int[] arr : all) {
            ans.add(arr);
            if (ans.size() == k) break;
        }
        return ans;
    }
}