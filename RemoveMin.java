class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int small = arr[0];
        
        if(arr.length > 1) {
            for(int i=1; i<arr.length; i++) {
                if(small>arr[i]) {
                    small = arr[i];
                }
            }
            answer = new int[arr.length-1];
            int k = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]!=small) {
                    answer[k] = arr[i];
                    k++;
                }
            }
            
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        
        
        
        return answer;
    }
}