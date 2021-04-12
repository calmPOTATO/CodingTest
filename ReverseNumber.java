
public class ReverseNumber {

    public int[] solution(long n) {
        int[] answer = {};
        StringBuffer sbnum = new StringBuffer(String.valueOf(n));
        sbnum = sbnum.reverse();
        String snum = sbnum.toString();
        
        answer = new int [snum.length()];
        
        for(int i=0; i<snum.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(snum.charAt(i)));
        }
        
        return answer;
    }
}
