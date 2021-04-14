import java.util.Arrays;

public class NumberKst {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int [commands.length];
      
        for(int i=0; i<commands.length; i++) {
            int numbers [] = new int [commands[i][1]-commands[i][0]+1];
            int k = 0;
            
            for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
                numbers[k] = array[j];
                k++;
            }
            Arrays.sort(numbers);
            answer[i] = numbers[commands[i][2]-1];
        }
        
        return answer;
    }

}
