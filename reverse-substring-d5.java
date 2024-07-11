class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else if(ch==')'){
                    int rem = stack.pop();
                    reverse(c,rem+1,i-1);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<c.length;i++){
                if(c[i]!=')' && c[i]!='('){
                    sb.append(c[i]);
                }
            }
            return sb.toString();
        }   

    public void reverse(char[] c,int n1,int n2){
        while(n1<n2){
            char temp = c[n1];
            c[n1] = c[n2];
            c[n2] = temp;
            n1++;
            n2--;
        }
    }
}
