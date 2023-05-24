import java.util.*;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/30 05:56
 * Test 1.
 * Task description:
 * In addition (arithmetic operation), a carry refers to a digit that is transferred from one column to the adjacent
 * column on the left when the result of the addition cannot be represented by a single digit.
 * For example:
 *
 *   55
 * + 29
 * ----
 *   84
 *
 * In this example, 5 + 9 = 14, which cannot be represented by a single digit, so the 1 is carried to the column
 * on the left and added to the result of 5 + 2.
 *
 * Write a function that given two numbers returns the total count of carry operations performed while adding them.
 *
 * Example:
 * numberOfCarryOperations(65, 55) // 2
 * 65 + 55 =>
 * 1st column: 5 + 5 = 0 (1 is carried)
 * 2nd column: 6 + 5 + 1 (carried) = 2 (1 is carried)
 * 3rd column: 1 (carried) = 1
 * => 120 (2 carry operations)
 *
 * numberOfCarryOperations(123, 456) // 0
 * numberOfCarryOperations(555, 555) // 3
 * numberOfCarryOperations(900, 11) // 0
 * numberOfCarryOperations(145, 55) // 2
 * numberOfCarryOperations(0, 0) // 0
 * numberOfCarryOperations(1, 99999) // 5
 * numberOfCarryOperations(999045, 1055) // 5
 * numberOfCarryOperations(101, 809) // 1
 * numberOfCarryOperations(189, 209) // 1
 *
 * Task 2.
 * Task Description:
 * A precedence rule is given as "P>E", which means that letter "P" is followed directly by the letter "E".
 * Write a function, given an array of precedence rules, that finds the word represented by the given rules.
 *
 * Note: Each represented word contains a set of unique characters, i.e. the word does not contain duplicate letters.
 *
 * Examples:
 * findWord(["P>E","E>R","R>U"]) // PERU
 * findWord(["I>N","A>I","P>A","S>P"]) // SPAIN
 *
 *
 * findWord(["U>N", "G>A", "R>Y", "H>U", "N>G", "A>R"]) // HUNGARY
 * findWord(["I>F", "W>I", "S>W", "F>T"]) // SWIFT
 * findWord(["R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G"]) // PORTUGAL
 * findWord(["W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"]) // SWITZERLAND
 *
 */

public class Test01 {

    public static void main(String[] args) {
        //System.out.println(numberOfCarryOperations(55, 65));
//        numberOfCarryOperations(123, 456); // 0
//        numberOfCarryOperations(555, 555); // 3
//        numberOfCarryOperations(900, 11); // 0
//        numberOfCarryOperations(145, 55); // 2
//        numberOfCarryOperations(0, 0); // 0
//        numberOfCarryOperations(1, 99999); // 5
//        numberOfCarryOperations(999045, 1055); // 5
//        numberOfCarryOperations(101, 809); // 1
//        numberOfCarryOperations(189, 209); // 1
        findWord(new String[] {"P>E","E>R","R>U"}); // PERU
        findWord(new String[] {"I>N","A>I","P>A","S>P"}); // SPAIN
        findWord(new String[] {"U>N", "G>A", "R>Y", "H>U", "N>G", "A>R"}); // HUNGARY
        findWord(new String[] {"I>F", "W>I", "S>W", "F>T"}); // SWIFT
        findWord(new String[] {"R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G" }); // PORTUGAL
        findWord(new String[] {"W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"}); // SWITZERLAND

    }

    static int numberOfCarryOperations(int a, int b){
        int count = 0;
        int carry = 0;
        int max = Math.max(a,b);
        int len = (max+"").length();
        int counter = 0;
        while (counter < len){
            //65
            //55

            int num1=a, num2=b;
            if(a > 9) {
                num1 =a % 10;
                a /= 10;
            }
            if(b > 9) {
                num2 = b % 10;
                b /= 10;
            }
            carry = num1+num2 > 9 ? (num1+num2 + carry) / 10 : 0;
            if(carry!=0) count++;
            counter++;
        }
        System.out.println(count);
    return count;
    }

    static String findWord(String[] arr){
        Map<Character, Character[]> map = new HashMap<>();
        Stack<Character> letters = new Stack<>();
        Stack<Character> nextLetters = new Stack<>();
        Character firstLetter = null;

        char letter = arr[0].charAt(0);
        char nextLetter = arr[0].charAt(2);

        map.put(letter, new Character[]{letter, nextLetter});
        letters.add(arr[0].charAt(0));
        nextLetters.add(arr[0].charAt(2));

        StringBuilder sb = new StringBuilder();

        for (int i=1; i<arr.length; i++) {
            letter = arr[i].charAt(0);
            nextLetter = arr[i].charAt(2);
            int index = -1;
            if (!nextLetters.contains(letter)) {
                letters.add(letter);
                map.put(letter, new Character[]{letter, nextLetter});
            }
            else {
                map.put(letter, new Character[]{letter, nextLetter});
                index = letters.indexOf(letter);
                if (index != -1) {
                    letters.remove(index);
                }
            }
            nextLetters.add(nextLetter);
            index = letters.indexOf(nextLetter);
            if(index != -1) {
                letters.remove(index);
            }
        }
        firstLetter = letters.pop();
        for(int i = 0 ; i < arr.length+1; i++){
            sb.append(firstLetter);
            if(map.get(firstLetter)!=null)
                firstLetter = map.get(firstLetter)[1];
        }
        System.out.println(sb);
        return sb.toString();
    }



}
