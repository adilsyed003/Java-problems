//contains() method used
class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].contains("..")){
                if(count <= 0)
                count = 0;
                else
                count -= 1;
            }else if(logs[i].contains(".")){
                count= count;
            }else{
                count += 1;
            }
        }
        return ((count<0)?0:count);
    }
}
