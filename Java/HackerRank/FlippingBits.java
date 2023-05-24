 /*

     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

public static long flippingBits(long n) {
    // Write your code here
    String binary = String.format("%1$32s", Long.toBinaryString(n)).replace(' ', '0');
    StringBuilder sb = new StringBuilder();
    for(int i=31; i >=0; i--){
        if(i < binary.length() && binary.charAt(i) == '1'){
            sb.append("0");
        }else{
            sb.append("1");
        }
    }
    sb.reverse();
    long num = (new BigInteger(sb.toString(), 2)).longValue();
    return num;

}