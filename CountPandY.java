
public class CountPandY {
	boolean solution(String s) {
        boolean answer = true;
        int countp = 0;
        int county = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='p' || s.charAt(i)=='P') {
                countp++;
            } else if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
                county++;
            }
        }
        
        if(countp!=county) {
            answer = false;
        }

        return answer;
    }
}
