public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split("\\s+");
        if (pattern.length() != s.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i=0; i<s.length; i++) {
            char key = pattern.charAt(i);
            String value = s[i];
            if (map.containsKey(key)) {
                if (!Objects.equals(map.get(key),value)) return false;
            } else if  (map.containsValue(value)) return false;
            else map.put(key, value);
        }
        return true;
    }
}