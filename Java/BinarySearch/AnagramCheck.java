/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/07/24 22:49
 */

public class AnagramCheck {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(new AnagramCheck().solve("bedroom", "bedromm"));
        long endTime = System.nanoTime();
        System.out.println("Total time elapsed: " + (endTime - startTime)/1000_000.0 + " ms");
    }
    public boolean solve(String s0, String s1) {
        if(s0.length() != s1.length()) return false;
        int[] chars = new int[256];
        for(int i=0; i < s0.length(); i++){
            chars[s0.charAt(i)]++;
            chars[s1.charAt(i)]--;
        }
        for(int n: chars){
            if(n != 0) return false;
        }
        return true;
    }
}
