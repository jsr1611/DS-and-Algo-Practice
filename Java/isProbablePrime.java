/*
Author: Jumanazar Saidov
Date: 2021.11.10
Link: https://www.hackerrank.com/challenges/java-primality-test/problem
Useful resources: https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
                  https://www.geeksforgeeks.org/biginteger-isprobableprime-method-in-java-with-examples/
 */
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;


public class isProbablePrime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger number = new BigInteger(n);
        boolean prime = number.isProbablePrime(1);

        String result = prime ? "prime" : "not prime";
        System.out.println(result);
        bufferedReader.close();
    }
}

