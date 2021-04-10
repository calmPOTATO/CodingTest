public class Caesar_Cipher {
	public String solution(String s, int n) {
        String answer = "";
        String [] slist = s.split("");
        String [] englist ={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t" ,"u", "v", "w", "x", "y", "z"};
        
        for(int i=0; i<slist.length; i++) {
            for(int j=0; j<englist.length; j++) {
                if(slist[i].equals(englist[j])) {
                    if(j+n>=englist.length) {
                        j= (j+n)-(englist.length);
                    } else {
                        j = j+n;
                    }
                    answer += englist[j];
                    break;
                } else if(slist[i].equals(englist[j].toUpperCase())){
                    if(j+n>=englist.length) {
                        j= (j+n)-(englist.length);
                    } else {
                        j=j+n;
                    }
                    answer += englist[j].toUpperCase();
                    break;
                } else if(slist[i].equals(" ")) {
                    answer += " ";
                    break;
                } 
            }
        }
        
        return answer;
    }
}
