class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        int j = filtered.length()-1;
        for(int i=0;i<filtered.length();i++){
            if(filtered.charAt(i) != filtered.charAt(j)){
                return false;
            }
            j--;
        }
            return true;
    }
}
