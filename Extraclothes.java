class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //도난 당하지 않은 사람 
        answer += n-lost.length;
        //도난 당했는데 여벌이 있는 사람
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]) {
                    answer += 1;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        //도난 당했는데 빌릴 수 있는 사람
        for(int i=0; i<lost.length; i++) {
            if(lost[i]!=-1) {
                for(int j=0; j<reserve.length; j++) {
                    if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1) {
                        answer += 1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}