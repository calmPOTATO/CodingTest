
public class MiddleCharacter {
	public String solution(String s) {
        String answer = "";
        
        int index = s.length()/2;
        
        if(s.length()%2==1) {
            answer = Character.toString(s.charAt(index));
        } else {
            answer = Character.toString(s.charAt(index-1));
            answer += Character.toString(s.charAt(index));
        }
        
        
        return answer;
    }

}
