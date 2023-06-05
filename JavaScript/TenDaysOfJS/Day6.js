/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/06/05 17:23
 */
// Bitwise operations for getting maximum of a and be less than k
function getMaxLessThanK(n,k){
    let max = null;
    let num = 0;
    for(let i=1; i<n; i++){
        for(let j=i+1; j<=n; j++){
            num = i & j;
            if(max==null)
                max = num;
            if(num < k && num > max){
                max = num;
            }
        }
    }
    return max;
}



// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    let dayName;
    // Write your code here
    let dayNum = new Date(dateString).getDay();
    const dayNames = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    dayName = dayNames[dayNum];
    return dayName;
}