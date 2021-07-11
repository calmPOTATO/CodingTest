class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int mulnum = 10000;
        int number [] = new int [5];
        int number_sum = 0;
        
        for(int i = 0; i<4; i++) {
        	if(mulnum==10) {
        		number[i] = (x/mulnum)%10;
        		number[i+1] = x%mulnum;
        	} else {
        		number[i] = (x/mulnum)%10;
        	}
        	mulnum/=10;
        }
        
        for(int i = 0; i<number.length; i++) {
            number_sum += number[i];
        }
        
        
        if(x%number_sum!=0) {
            answer = false;
        } 
        
        
        return answer;
    }
}