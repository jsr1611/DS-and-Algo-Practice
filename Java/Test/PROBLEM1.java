import java.util.*;

/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/15 20:41
 */

public class PROBLEM1 {
    // ------------------------------------------------------------------------------------------------------------------------------------------------------------
// A precedence rule is given as "P>E", which means that letter "P" is followed directly by the letter "E".
// Write a function, given an array of precedence rules, that finds the word represented by the given rules.

// Note: Each represented word contains a set of unique characters, i.e. the word does not contain duplicate letters.

// Examples:
// findWord(["P>E","E>R","R>U"]) // PERU
// findWord(["I>N","A>I","P>A","S>P"]) // SPAIN

// findWord(["U>N", "G>A", "R>Y", "H>U", "N>G", "A>R"]) // HUNGARY
// findWord(["I>F", "W>I", "S>W", "F>T"]) // SWIFT
// findWord(["R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G"]) // PORTUGAL
// findWord(["W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"]) // SWITZERLAND
    public static void main(String[] args) {
        String[] arr = {"W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"};
        StringBuilder sb = new StringBuilder();
        Map<Character, Character[]> mymap = new HashMap();
        List<Character> keys = new ArrayList<>();
        List<Character> values = new ArrayList<>();

        char value = arr[0].charAt(2), letter= arr[0].charAt(0), start = arr[0].charAt(0);
        mymap.put(letter, new Character[]{letter, value});
        keys.add(letter);
        values.add(value);
        for(int i=1; i < arr.length; i++){
            value = arr[i].charAt(2);
            letter = arr[i].charAt(0);
            if(!keys.contains(letter) && values.contains(letter)){
                start = letter;
                keys.add(letter);
            }

            mymap.put(letter, new Character[]{letter, value});
        }
        sb.append(start);
        Character next = mymap.get(start)[1];

        while (next != null){
            sb.append(next);
            next = mymap.containsKey(next) ? mymap.get(next)[1] : null;
        }

        System.out.println(sb.toString());
    }
}
