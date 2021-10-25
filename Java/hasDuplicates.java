/*
Author: Jumanazar Saidov
Definition:
Check for duplicates in the string array and return boolean true/false result.
 */

public static boolean hasDuplicates(String[] groceryList) {
    for (int i = 0; i < groceryList.length - 1; i++) {
        for (int j = i + 1; j < groceryList.length; j++){
            if (groceryList[i] == groceryList[j]) {
                return true;
            }
        }
    }
    return false;
}