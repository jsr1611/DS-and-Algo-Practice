/**
 * author: Jumanazar Said
 * email: jumanazarsaidov@gmail.com
 * date: 2022/08/13 04:01
 * desc: Given the strings text, word0, and word1, return the smallest distance between
 * any two occurrences of word0 and word1 in text, measured in number of words in between.
 * If either word0 or word1 doesn't appear in text, return -1.
 *
 * Constraints
 *
 * word0 and word1 are different.
 * n ≤ 200,000 where n is the length of text.
 * Example 1
 * Input
 * text = "dog cat hello cat dog dog hello cat world"
 * word0 = "hello"
 * word1 = "world"
 * Output
 * 1
 * Explanation
 * There's only one word "cat" in between the hello and world at the end.
 */

public class MinimumDistanceOfTwoWordsSentence {
    public int solve(String text, String word0, String word1) {

        int start = -1;
        int end = -1;
        int counter = 0, min = Integer.MAX_VALUE;
        String[] words = text.split(" ");
        for(int i=0; i < words.length; i++){
            if(words[i].equals(word0)){
                start = i;
                if(end != -1){
                    counter = start - end - 1;
                    if(counter < min){
                        min = counter;
                    }
                }
            }
            else if(words[i].equals(word1)){
                end = i;
                if(start != -1){
                    if(start < end){
                        counter = end - start-1;
                        if(counter < min)
                            min = counter;
                    }
                }

            }
        }
        return (start != -1 && end!= -1) ? min : -1;
    }
}
