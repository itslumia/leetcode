public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int value = 0;
        if (strs.length == 0) return ans;
        for (String s : strs) {
            String ks = keyFormat(s);
            if (map.containsKey(ks)) ans.get(map.get(ks)).add(s);
            else {
                map.put(ks, value);
                value++;
                List<String> tmp = new ArrayList<>();
                tmp.add(s);
                ans.add(tmp);
            }
        }
        return ans;
    }
    
    private String keyFormat(String s) {
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        return new String(ca);
    }
}