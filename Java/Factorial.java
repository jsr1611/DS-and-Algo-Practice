/*
Author: Jumanazar Saidov
Definition:
Recursive function to calculate factorial of n
 */

public static int factorial(int n) {
    return n > 1 ? n* factorial(n-1) : n;
}