
/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */
class Polygon{
    constructor(sides){
        this.sides = sides;
    }

    perimeter() {
        let result = 0;
        this.sides.map((x) => {
            result += x;
        });
        return result;
    }
}



class Rectangle {
    constructor(w, h) {
        this.w = w;
        this.h = h;
    }
}

/*
 *  Write code that adds an 'area' method to the Rectangle class' prototype
 */
Rectangle.prototype.area = function(){
    return this.w * this.h;
}

/*
 * Create a Square class that inherits from Rectangle and implement its class constructor
 */
class Square extends Rectangle{
    constructor(a){
        super(a,a);
        this.a = a;
    }
}

/*
 * Determine the original side lengths and return an array:
 * - The first element is the length of the shorter side
 * - The second element is the length of the longer side
 *
 * Parameter(s):
 * literals: The tagged template literal's array of strings.
 * expressions: The tagged template literal's array of expression values (i.e., [area, perimeter]).
 */
function sides(literals, ...expressions) {

    let s1 = (expressions[1] + Math.sqrt(Math.pow(expressions[1], 2) - 16 * expressions[0])) / 4;
    let s2 = (expressions[1] - Math.sqrt(Math.pow(expressions[1], 2) - 16 * expressions[0])) / 4;
    return s1 > s2 ? [s2, s1] : [s1,s2];
}

/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 *
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    //map creates new array
    let newArr = nums.map((x) => {
        if(x % 2 === 0) x*=2;
        else x*=3;
        return x;
    });

    //forEach mutates the original array objects, but not primitives
    //this will not work!
    // nums.forEach(x => {
    //     if(x % 2 === 0) x*=2;
    //     else x*=3;
    // });
    return newArr;
}