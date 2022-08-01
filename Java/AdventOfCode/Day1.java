import java.io.*;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/01 00:15
 */

public class Day1 {
    public static void main(String[] args) {
        System.out.println(solve());
    }
    private static int solve() {
        String path = "C:\\GIT\\input.txt";
        int total_count = 0;
        File file;
        BufferedReader bf;
        try {
            file = new File(path);
            bf = new BufferedReader(new FileReader(file));
        String line =  bf.readLine();
        int old = Integer.parseInt(line);
        int num = Integer.MIN_VALUE;
        while (true){
            if(line == null) return total_count;
            num = Integer.parseInt(line);
            if(old < num)
                total_count++;
            old = num;
            line = bf.readLine();
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        return total_count;
    }
}
