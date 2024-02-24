/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/05/30 11:34
 */

/**
 *   Calculate the area of a rectangle.
 *
 *   length: The length of the rectangle.
 *   width: The width of the rectangle.
 *
 *	Return a number denoting the rectangle's area.
 **/
function getArea(length, width) {
    let area;
    // Write your code here
    area = Number(length) * Number(width);
    return area;
}


/**
 *   Calculate the perimeter of a rectangle.
 *
 *	length: The length of the rectangle.
 *   width: The width of the rectangle.
 *
 *	Return a number denoting the perimeter of a rectangle.
 **/
function getPerimeter(length, width) {
    let perimeter;
    // Write your code here
    perimeter = (Number(length) * 2) + (Number(width) * 2);

    return perimeter;
}


/*
 * Create the function factorial here
 */
function factorial(n){
    let result = 1;
    for(let i=1; i < n+1; i++){
        result*= i;
    }
    return result;
}


function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    const r = Number(readLine());
    const PI = Math.PI;
    // Print the area of the circle:
    let area = PI * Math.pow(r, 2);
    console.log(area);
    // Print the perimeter of the circle:
    let perimeter = 2 * PI * r;
    console.log(perimeter);
}
