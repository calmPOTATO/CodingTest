
public class Supark_print {

	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        String su = "��";
	        String park = "��";
	        
	        for(int i=1; i<=n; i++) {
	            if(i%2==1) {
	                answer += su;
	            } else {
	                answer += park;
	            }
	        }
	        
	        return answer;
	    }
	}

}
