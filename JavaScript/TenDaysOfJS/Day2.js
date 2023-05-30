/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/05/30 12:01
 */


function getGrade(score) {
    let grade;
    // Write your code here
    if(score>25 && score <= 30) grade = 'A';
    else if(score > 20 && score <= 25) grade = 'B';
    else if(score > 15 && score <= 20) grade = 'C';
    else if(score > 10 && score <= 15) grade = 'D';
    else if(score > 5 && score <= 10) grade = 'E';
    else grade = 'F';
    return grade;
}


console.log(getGrade(11));


function getLetter(s) {
    let letter;
    // Write your code here
    const A = ['a','e','i','o','u'];
    const B = ['b','c','d','f','g'];
    const C = ['h','j','k','l','m'];
    const D = ['n','p','q','r','s','t','v','w','x','y','z'];
    switch(true){
        case A.includes(s[0]):
            letter = 'A';
            break;
        case B.includes(s[0]):
            letter = 'B';
            break;
        case C.includes(s[0]):
            letter = 'C';
            break;
        case D.includes(s[0]):
            letter = 'D';
            break;
    }
    return letter;
}

console.log(getLetter('adfgt'));


/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    const vowels = 'aeiou';
    let consonants = '';
    for(let i=0; i < s.length; i++){
        if(vowels.includes(s.charAt(i))){
            console.log(s.charAt(i));
        }else {
            consonants += s.charAt(i);
        }
    }
    for(let i=0; i < consonants.length; i++){
        console.log(consonants.charAt(i));
    }
}

vowelsAndConsonants('javascriptloops');