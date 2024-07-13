class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while(s.charAt(i) == ' ')
        {
        if(s.lastIndexOf(" ") == s.length()-1){
            s = s.substring(0, s.length() - 1);
            i--;
        }
        }
        return (s.length() - s.lastIndexOf(" ")-1);
    }
}
