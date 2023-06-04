import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
       //03) Stream을 이용한 정렬
        numbers = Arrays.stream(numbers)
        			.boxed()
        			.sorted(Comparator.reverseOrder())
        			.mapToInt(Integer::intValue).toArray();
        
        return numbers[0] * numbers[1];

    }
}