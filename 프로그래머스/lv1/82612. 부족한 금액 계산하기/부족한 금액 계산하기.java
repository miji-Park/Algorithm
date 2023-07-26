class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        //count번 타면 price*1+ price*2 + ... + price*count
        for(int i=1;i<=count;i++)
        {
            sum += price*i;
        }
        
        if(money < sum)
        {
            answer = sum - money;
        }
        else answer = 0;
        
        
        
        return answer;
    }
}