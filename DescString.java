import java.util.Arrays;

public class DescString {
	 public String solution(String s) {
	        String answer = "";
	        String s2 = s.toLowerCase();
	        String upeng = "";
	        String loweng = "";
	        
	        for(int i=0; i<s.length(); i++) {
	            if(s.charAt(i)==s2.charAt(i)) {
	                loweng += String.valueOf(s.charAt(i));
	            } else {
	                upeng += String.valueOf(s.charAt(i));
	            }
	        }
	        
	        char [] upenglist = upeng.toCharArray();
	        char [] lowenglist = loweng.toCharArray();
	        
	        loweng = "";
	        upeng = "";
	        
	        Arrays.sort(upenglist);
	        Arrays.sort(lowenglist);
	        
	        for(int i=0; i<lowenglist.length; i++) {
	            loweng += String.valueOf(lowenglist[i]);
	        }
	        
	        for(int i=0; i<upenglist.length; i++) {
	            upeng += String.valueOf(upenglist[i]);
	        }
	        
	        StringBuffer upsb = new StringBuffer(upeng);
	        StringBuffer lowsb = new StringBuffer(loweng);
	        
	        upsb.reverse();
	        lowsb.reverse();
	        
	        answer += lowsb.toString();
	        answer += upsb.toString();
	    
	        return answer;
	    }
}
