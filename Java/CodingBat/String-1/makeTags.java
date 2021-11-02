/*
Author: Jumanazar Saidov
Date: 2021.11.03
Link: https://codingbat.com/prob/p147483
 */
public String makeTags(String tag, String word) {
    return String.format("<%s>%s</%s>", tag, word, tag);
}
