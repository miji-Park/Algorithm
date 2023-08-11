class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int a=0; a<=t.length()-p.length(); a++){        
            String refStr = t.substring(a,a+p.length()); 
            if(Long.parseLong(refStr) <= Long.parseLong(p)){
                ++answer;
            } 
        }
        return answer;
    }
}
