/*
Author: Jumanazar Saidov
link: https://codingbat.com/prob/p140449
Date: 2021-10-26
 */

public boolean parrotTrouble(boolean talking, int hour) {
    return (talking && (hour < 7 | hour > 20));
}
