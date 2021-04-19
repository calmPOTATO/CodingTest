public class InnerProduct {
	public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int num = 0;
        
        for(int i=0; i<a.length; i++) {
            num += a[i]*b[i];
        }
        
        answer = num;
        
        return answer;
    }
}
