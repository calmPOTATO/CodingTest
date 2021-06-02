import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int k=0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                k++;
            }
        }
        
        answer = new int[k];
        
        if(k!=0) {
            int j=0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]%divisor==0) {
                    answer[j] = arr[i];
                    j++;
                }
            }
            Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
        
    }
}