function solution(num1, num2, exclusive_limit){
    //problem: https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem?isFullScreen=true
    //project Euler: https://projecteuler.net/problem=1
    let smaller = num1 < num2 ? num1 : num2;
    let count = 0;
    //brute-force
    // for(let i = smaller; i < exclusive_limit; i++){
    //     if(i % num1 === 0 || i % num2 === 0){
    //         count += i;
    //     }
    // }

    //optimised solution
    let inclusive_limit = exclusive_limit - 1;
    if(inclusive_limit < smaller){
        console.log(0);
        return;
    }
    count = sumOfDivisibles(num1, inclusive_limit) + sumOfDivisibles(num2, inclusive_limit) - sumOfDivisibles(num1*num2, inclusive_limit);
    console.log(count);
}

// calculate the sum of all numbers divisible by a divisor
function sumOfDivisibles(divisor, inclusive_limit){
    let countOfDivisibles = Math.floor(inclusive_limit / divisor);
    let biggestDivisible = divisor * countOfDivisibles;
    return sumOfArithmeticProgression(divisor, biggestDivisible, countOfDivisibles);
}

function sumOfArithmeticProgression(divisor, biggestDivisible, countOfDivisibles){
    return Math.floor((countOfDivisibles * (divisor + biggestDivisible)) / 2);
}


solution(3,5, 1000);
