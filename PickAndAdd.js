function solution(numbers) {
    var answer = [];
    var sumarr = [];
    
    for(var i=0; i<numbers.length; i++) {
        for(var j=0; j<numbers.length; j++) {
            if(i!=j) {
                var sum = numbers[i]+numbers[j];
                sumarr.push(sum);
            } 
        }
    }
    
    answer[0] = sumarr[0];
    
    for(var i=0; i<sumarr.length; i++) {
        var count = 0;
        for(var j=0; j<answer.length; j++) {
            if(answer[j]==sumarr[i]) {
                count += 1;
            }
        }
        if(count==0) {
            answer.push(sumarr[i]);
        }
    }
    
    answer.sort(function(a,b) {
        return a-b;
    });
    
    return answer;
}