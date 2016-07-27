public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) return true;
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) i++;
            else if (!Character.isLetterOrDigit(s.charAt(j))) j--;
            else if (i >= j) return true;
            else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}