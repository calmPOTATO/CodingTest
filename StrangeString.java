import java.util.ArrayList;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> slist = new ArrayList<String>();
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=' ') {
                if(count==0 || count%2==0) {
                    answer += Character.toString(s.charAt(i)).toUpperCase();
                    count++;
                } else {
                    answer += Character.toString(s.charAt(i)).toLowerCase();
                    count++;
                }
            } else {
                count = 0;
                answer += Character.toString(s.charAt(i));
            }
        }
        
        
        return answer;
    }
}