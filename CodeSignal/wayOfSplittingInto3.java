package CodeSignal;
//For s = "xzxzx", the output should be countWaysToSplit(s) = 5.
public class wayOfSplittingInto3 {
    int countWaysToSplit(String s) {
        int count = 0;
        if(s.length() < 3){
            return 0;
        }

        for(int i = 0; i < s.length()-2; i++){
            for(int j=0; j < 3;j++){
                String a = s.substring(i, j+2);
                String b = s.substring(i, j+3);
                String c = s.substring(i, j+4);
                if((a + b).compareTo(b+c) != 0 && (a+c).compareTo(b+c) != 0 && (a+c).compareTo(a+b) != 0){
                    count++;
                }
            }
        }
        return count;
    }

}
