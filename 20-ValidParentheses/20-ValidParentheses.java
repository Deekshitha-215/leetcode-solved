// Last updated: 1/26/2026, 5:17:20 PM
class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack();
        char[] ch = str.toCharArray();
        for(char c:ch){
            if(c == '(' || c == '[' || c == '{'){
                s.push(c);
            } else{
                if(s.empty()) return false;
                else if(c==')' && s.peek()=='(')
                    s.pop();
                else if(c==']' && s.peek()=='[')
                    s.pop();
                else if(c=='}' && s.peek()=='{')
                    s.pop();
                else return false;
            }
        }
        return s.empty();
    }
}