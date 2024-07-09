
class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen = 0;
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<t.length();i++){
            if(s.charAt(slen)==t.charAt(i))
                slen++;
            if(slen == s.length())
            return true;
        }
        return false;
    }
}
