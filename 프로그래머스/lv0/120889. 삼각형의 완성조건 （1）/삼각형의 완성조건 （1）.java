class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        //최대값 찾기
        int max = sides[0];
        for(int i=1;i<=2;i++)
        {
            if(max < sides[i])
            {
                max = sides[i];
            }
        }
        
        if(max < sides[0]+sides[1]+sides[2]-max)
        {
            answer = 1;
        }
        else
        {
            answer = 2;
        }
            
        
        return answer;
    }
}