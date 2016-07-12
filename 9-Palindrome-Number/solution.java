public class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        
        if (x==0) return true;
        
        if (x<0||x%10==0) return false;
        
        
        while (x!=0) {
            if (y==x/10) return true;
            y=10*y+x%10;
            x/=10;
            if (x==y) return true;
        }
        return false;
    }
}