function solution(n) {
    var answer = 0;
    
    var sqrt = Math.sqrt(n);
    
    if(sqrt == Math.round(sqrt)) {
        answer = Math.pow((sqrt+1), 2);
    } else {
        answer = -1;
    }
    
    return answer;
}