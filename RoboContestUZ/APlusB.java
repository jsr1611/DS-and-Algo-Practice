/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/10 18:40
 */

import java.util.*;
import java.io.*;

public class APlusB{
    public static void main(String[] argv) throws IOException{
        new APlusB().run();
    }
    PrintWriter pw;
    Scanner sc;
    public void run() throws IOException{
        sc = new Scanner(new File("C:\\Users\\jimmy\\IdeaProjects\\DS_and_AlgoPractice\\Java\\RoboContestUZ\\input.txt"));
        String num1 = sc.next();
        String num2 = sc.next();
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for (int i=0; i < num1.length() || i < num2.length(); i++){
            if(i < num1.length()) carry += Character.getNumericValue(num1.charAt(num1.length()-1-i));
            if(i < num2.length()) carry += Character.getNumericValue(num2.charAt(num2.length()-1-i));
            if(carry > 9) {
                sb.append(carry % 10);
                carry /= 10;
            }
            else{
                sb.append(carry);
                carry = 0;
            }
        }
        if(carry != 0) sb.append(carry);
        pw = new PrintWriter(new File("./Java/RoboContestUZ/output.txt"));
        pw.print(sb.reverse());
        System.out.println(sb);
        pw.close();
    }
}