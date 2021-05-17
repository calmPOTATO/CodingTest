import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int supoja1 [] = {1,2,3,4,5};
        int supoja2 [] = {2,1,2,3,2,4,2,5};
        int supoja3 [] = {3,3,1,1,2,2,4,4,5,5};
        int right [] = new int[3];
        
        for(int i=0; i<answers.length; i++) {
            if(supoja1[i%supoja1.length]==answers[i]) {
                right[0]+=1;
            }
            if(supoja2[i%supoja2.length]==answers[i]) {
                right[1]+=1;
            }
            if(supoja3[i%supoja3.length]==answers[i]) {
                right[2]+=1;
            }
        }
        
        int max = Math.max(Math.max(right[0],right[1]), right[2]);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max==right[0]) { list.add(1); }
        if(max==right[1]) { list.add(2); }
        if(max==right[2]) { list.add(3); }
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}