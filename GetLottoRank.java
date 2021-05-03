
public class GetLottoRank {
	
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int blindnum = 0;
        int rightnum = 0;
        
        for(int i=0; i<lottos.length; i++) {
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i]==0) {
                    blindnum += 1;
                    break;
                } else {
                    if(lottos[i]==win_nums[j]) {
                        rightnum += 1;
                        break;
                    }
                }
            }
        }
        
        switch(rightnum) {
            case 2: 
                answer[1] = 5;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 6:
                answer[1] = 1;
                break;
            default:
                answer[1] = 6;
        }
        
        switch(rightnum+blindnum) {
            case 2: 
                answer[0] = 5;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 6:
                answer[0] = 1;
                break;
            default:
                answer[0] = 6;
        }

        return answer;
    }

}
