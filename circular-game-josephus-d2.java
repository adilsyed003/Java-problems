//using recursion 
class Solution {

    public int findTheWinner(int n, int k) {
        int na = joseph(n,k);
        return na;
    }
    public int joseph(int n,int k){
        if(n==1){return 1;}
        else{
            return (joseph(n-1,k)+k-1)%n+1;

            }
    }
}
