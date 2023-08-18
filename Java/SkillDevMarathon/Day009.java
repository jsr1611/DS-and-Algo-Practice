public class Day009 {
    /*
    @description 1108. Defanging an IP address
    @author jsr1611
    @reference https://leetcode.com/problems/find-triangular-sum-of-an-array/
     */
    public String defangIPaddr(String address){
        int len = address.length();
        StringBuilder defAddr = new StringBuilder();
        for(int i=0; i < len; i++){
            if(address.charAt(i) == '.'){
                defAddr.append("[").append(".").append("]");
            }else {
                defAddr.append(address.charAt(i));
            }
        }
        return defAddr.toString();
    }
}
