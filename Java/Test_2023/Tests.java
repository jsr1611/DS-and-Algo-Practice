/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2023/05/24 22:56
 */

public class Tests {

    public static void main(String[] args) {

    }
    public static int solution2(String a, String b){
        int index = a.indexOf(b);
        if(index == -1) return 0;
        int len = b.length();
        int nexIndex = index+len;
        int count = 1;
        int countMax = 1;
        boolean cont = true;
        for(int i=0; i < (a.length()-index)/len; i++){
            if(a.substring(nexIndex, len).equals(b)){
                count++;
                if(cont && countMax < count)
                    countMax = count;
                else if(!cont)
                    count = 1;
            }
        }
        return countMax;
    }
}
