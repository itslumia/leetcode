public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
		for (String s : tokens) {
			if(isNumeric(s)) {
				stack.push(Integer.parseInt(s));
			} else {
				if (s.equals("+")) stack.push(stack.pop()+stack.pop());
				else if (s.equals("-")) stack.push(-stack.pop()+stack.pop());
				else if (s.equals("*")) stack.push(stack.pop()*stack.pop());
				else if (s.equals("/")) {
					int a = stack.pop();
					stack.push(stack.pop()/a);
				}
			}
		}
		return stack.pop();
    }
    
    boolean isNumeric(String str)
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
    }