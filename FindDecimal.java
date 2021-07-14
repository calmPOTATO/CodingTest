class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0; //소수가 아닌 수
        
        for(int i=2; i<=n; i++) {
            for(int j=2; j*j<=i; j++) {
                if(i%j==0) {
                    count++;
                    break;
                }
            }
        }
        
        answer = n-count-1;
        return answer;
    }
}