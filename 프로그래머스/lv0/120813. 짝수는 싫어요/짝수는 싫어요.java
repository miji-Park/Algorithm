class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n%2==0?n/2:n/2+1];
        
        if(n%2==0)
        {
            for(int i=0;i<n/2;i++)
            {
                answer[i] = 2*i+1;
            }
        }
        else
        {
            for(int i=0;i<(n/2)+1;i++)
            {
                answer[i] = 2*i+1;
            }
        }   
  
        
        return answer;
    }
}