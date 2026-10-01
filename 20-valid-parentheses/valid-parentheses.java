class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                //if first element is close bracket
                if(st.isEmpty()) return false;

                

                //if curr element doesn't match top of stack
                // if((ch == ')' && st.peek() != '(') || (ch == '}' && st.peek() != '{') || (ch == ']' && st.peek() != '[')){
                //     return false;
                // }else{
                //     st.pop();
                // }
                if((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}