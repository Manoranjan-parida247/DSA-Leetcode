class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            String str = tokens[i];
            if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")){
                st.push(Integer.parseInt(str));
            }else{
                if(str.equals("+")){
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a+b);
                }else if(str.equals("-")){
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a-b);
                }else if(str.equals("*")){
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a*b);
                }else if(str.equals("/")){
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a/b);
                }
            }
        }

        return st.peek();
    }
}