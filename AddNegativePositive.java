
public class AddNegativePositive {
	 public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 123456789;
	        String [] numbers = new String[absolutes.length];
	        
	        for(int i=0; i<absolutes.length; i++) {
	            if(signs[i]) {
	                numbers[i] = String.valueOf(absolutes[i]);
	            } else {
	                numbers[i] = "-"+String.valueOf(absolutes[i]);
	            }
	            System.out.println(numbers[i]);
	        }
	        
	        answer = 0;
	        
	        for(int i=0; i<numbers.length; i++) {
	            answer += Integer.parseInt(numbers[i]);
	        }
	        
	        
	        
	        return answer;
	    }
}
