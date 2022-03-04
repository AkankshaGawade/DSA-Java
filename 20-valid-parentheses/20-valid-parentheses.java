class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        char ch;
        for(char i:s.toCharArray())
        {
            if(i=='(' || i=='[' || i=='{')
                st.push(i);
            else
            {
                if(st.isEmpty())
                    return false;
                ch=st.pop();
                if((i==')' && ch=='(') ||(i==']' && ch=='[') || (i=='}' && ch=='{'))
                   continue;  
                else
                  return false;
            }
        }
       return st.isEmpty();
    }
}