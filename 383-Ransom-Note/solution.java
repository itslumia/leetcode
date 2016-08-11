public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] s1 = new int[26];
        for (int i=0; i<ransomNote.length(); i++) {
            s1[ransomNote.charAt(i) - 'a']--;
        }
        for (int i=0; i<magazine.length(); i++) {
            s1[magazine.charAt(i) - 'a']++;
        }
        for (int i : s1) {
            if (i < 0) return false;
        }
        return true;
    }
}