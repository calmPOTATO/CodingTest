class Solution {
    public int solution(String s) {
        int answer = 0;
        String num = "";
        
        if(s.charAt(0)=='-') {
            for(int i=1; i<s.length(); i++) {
                num += String.valueOf(s.charAt(i));
            }
            answer = Integer.parseInt(num) * (-1);
        } else {
            for(int i=0; i<s.length(); i++) {
                num += String.valueOf(s.charAt(i));
            }
            answer = Integer.parseInt(num);
        }
        
        return answer;
    }
}