function solution(lottos, win_nums) {
    var answer = [];
    var mystery = 0;
    var count = 0;
    
    for(var i=0; i<lottos.length; i++) {
        if(lottos[i]==0) {
            mystery += 1;
        }
        for(var j=0; j<win_nums.length; j++) {
            if(lottos[i]==win_nums[j]) {
                count += 1;
            }
        }
    }

    if(count==0) {
        if(mystery==0) {
            answer[0] = 6;
        } else {
        answer[0] = 7-mystery;
        }
        answer[1] = 6;
    } else if(count==6) {
        answer[0] = 1;
        answer[1] = 1;
    } else {
        answer[0] = 7-(count+mystery);
        answer[1] = 7-count;
    }
  
    
    return answer;
}