public class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack = new Stack<>();
        String[] strs = preorder.split(",");
        for (String s : strs) {
            if (s.equals("#")) {
                while (!stack.isEmpty() && stack.peek().equals("#")) {
                    stack.pop();
                    if (stack.isEmpty()) return false;
                    stack.pop();
                }
                stack.push("#");
            } else {
                stack.push(s);
            }
        }
        if (stack.size() == 1 && stack.peek().equals("#")) return true;
        else return false;
    }
}