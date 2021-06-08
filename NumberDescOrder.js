function solution(n) {
    var answer = 0;
    var arr = String(n).split("");
    arr.sort();
    arr.reverse();
    var strn = "";
    
    for(var i=0; i<arr.length; i++) {
        strn += arr[i];
    }
    
    answer = parseInt(strn);
    
    return answer;
}