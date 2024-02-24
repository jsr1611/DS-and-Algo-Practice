/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/26 17:37
 * desc: Given a list of points [[x1, y1], [x2, y2], ..., [xn, yn]], representing a polygon, and x and y,
 * determine if (x, y) lies inside this polygon or on the boundary.
 * You can assume these points are given in order; that is, you can construct the polygon by connecting point 1
 * to point 2, point 2 to point 3, and so on, finally looping around to connect point N to point 1.
 */

public class CollisionDetection {
    public boolean solve(int[][] polygon, int x, int y) {
        //boolean polA = false, polB = false, polC = false, polD = false, result = false;

        // TODO: 7/26/2022 Need to think about the ways the polygon can be drawn
        int len = polygon.length;
        if(len % 2 == 1){
            if((polygon[0][0] > x && polygon[0][1] > 0) &&
                (polygon[len/2][0] < x && polygon[len/2][1] < y) &&
                (polygon[len/3][0] > x && polygon[len/3][1] < 0) ){
                return true;
            }
        }else {
            return false;
        }


//
//        if(polygon[0][0] < x && polygon[0][1] < y){
//            polA = true;
//        }
//        if(polygon[1][0] > x && polygon[1][1] > y){
//            polB = true;
//        }
//        if(polygon[2][0] > x && polygon[2][1] > y){
//            polC = true;
//        }
//        if(polygon[3][0] > x && polygon[3][1] > y){
//            polD = true;
//        }
//        if(polA && polB && polC && polD){
//            result = true;
//        }
        return false;
    }
}
