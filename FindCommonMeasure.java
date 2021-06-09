class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int big = 0;
        int small = 0;
        
        int max = 0;
        int min = 0;
        
        if(n>m) {
            big = n;
            small=m;
        } else {
            big = m;
            small=n;
        }
        
        for(int i=1; i<=big; i++) {
            if(n%i==0 && m%i==0) {
                max = i;
            }
        }
        
        min = (m*n)/max;
        
        answer = new int [2];
        answer[0] = max;
        answer[1] = min;
        
        
        return answer;
    }
}