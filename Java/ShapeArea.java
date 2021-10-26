/*
Author: Jumanazar Saidov
Date: 2021-10-27
Definition: Compute the area of the polygon.
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1.
An n-interesting polygon is obtained by taking the n - 1-interesting polygon
and appending 1-interesting polygons to its rim, side by side.
You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
link: https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ/solutions
 */

public class ShapeArea {
    int shapeArea(int n) {
        int total = 1;
        for(int i=n-1; i > 0; i--){
            for(int j=0; j < 4; j++){
                total +=  i;
            }
        }
        return total;
    }
}




