/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/11 02:50
 */

import java.util.*;
import java.io.*;

public class VisitOfDirector {
        public static void main(String[] argv) throws IOException{
            new VisitOfDirector().run();
        }
        PrintWriter pw;
        Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("input.txt"));
        pw = new PrintWriter(new File("output.txt"));
        pw.print((long) sc.nextInt() * sc.nextInt());
        pw.close();
    }
}
