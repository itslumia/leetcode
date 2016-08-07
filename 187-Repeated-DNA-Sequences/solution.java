public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if (s.length()<11) return ans;
        Set<String> seen = new HashSet<>();
        Set<String> list = new HashSet<>();
        for (int i=0; i<=s.length()-10; i++) {
            String tmp = s.substring(i,i+10);
            if (seen.contains(tmp)) list.add(tmp);
            else seen.add(tmp);
        }
        ans = new ArrayList<>(list);
        return ans;
    }
}