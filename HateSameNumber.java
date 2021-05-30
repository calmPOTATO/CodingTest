import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int k = 0;
        
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!=arr[i-1]) {
                k++;
            }
        }
        
        answer = new int[k+1];
        answer[0] = arr[0];
        
        k=1;
        
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!=arr[i-1]) {
                answer[k] = arr[i];
                k++;
            }
        }
    
        return answer;
    }
}