/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/09 17:29
 * Question 3 out of 3. Toptal online coding
 * desc: An internal unit of company XYZ provides services to other departments.
 *      Service prices are fixed at the beginning of the quarter based on projected expenses and utilization. However,
 *      usage is billed at the end of the quarter.
 *      So while composing quarterly invoices there maybe an excess. We suppose planning is very good, so there is only
 *      ever a modest overage.
 *      This amount should be returned to the departments by discounting a portion of it on each invoice.
 *      Your job is to write a function which considers the excess S and allocates it fairly. Allocation proceeds
 *      from the largest to the smallest invoice. And is distributed as the ratio of the invoice's contribution to
 *      the sum of itself and those which follow.
 *
 *      Example 1:
 *      Given S="300.01" and B=["300.00", "200.00", "100.00"]/
 *      R[0] = "150.00" (=300.01 * 300.00/600.00)
 *      R[1] = "100.00" (=150.01 * 200.00/300.00)
 *      R[2] = "50.01" (=50.01 * 100.00/100.00)
 *
 *      Example 2: (Pay careful attention to this one)
 *      Given S="1.00" and B=["0.05", "1.00"]
 *      1. First we consider 1.00 because it is the largest,
 *       a. 1.00*1.00/1.05 ~= 0.95238...
 *       b. Round 0.95238... to "0.95". Rounding down to carry pennies to smaller departments.
 *       c. set R[1] = 0.95. Notice, this is the same place as 1.00
 *
 *      R[2] = 0.05 (=0.05 * 0.05/0.05)
 *
 */


import java.util.Arrays;

public class AllocateDiscountsFairly {
    public static void main(String[] args) {

    }
    public String[] solution(String S, String[] B){

    }

}