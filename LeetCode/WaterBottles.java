/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/26 18:05
 */

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            total += (numBottles / numExchange);
            numBottles = (numBottles % numExchange) + (numBottles / numExchange);
        }
        return total;
    }
}
