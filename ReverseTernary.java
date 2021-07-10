import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        while(n>2) {
            numbers.add(n%3);
            n = n/3;
        }    
        numbers.add(n);
        int length=numbers.size()-1;
        
         for(int i=0; i<numbers.size(); i++) {
            answer += numbers.get(i)*(Math.pow(3, length));
            length -= 1;
        }
        
        
        return answer;
    }
}