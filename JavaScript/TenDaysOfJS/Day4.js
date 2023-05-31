

/*
 * Complete the Rectangle function
 */
function Rectangle(a, b) {
    let recObj = {
        length: a,
        width: b,
        perimeter: 2*(a+b),
        area: a*b,
    };
    return recObj;
}


/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 *
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
    let count = 0;
    objects.map((o) => {
        if(o.x == o.y) count++;
    });
    return count;
}


