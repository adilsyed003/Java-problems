//also called Tortise hare problem
class Solution {
        public int square(int a){
            int sum =0;
            while(a!=0){
                sum += (a%10)*(a%10);
                a /= 10;
            }
            return sum;
        }
    public boolean isHappy(int n) {
        int slow  = n;
        int fast = square(n);
        while(fast!=1 && fast!=slow){
            slow = square(slow);
            fast = square(square(fast));
        }
        return fast==1;
    }
}
