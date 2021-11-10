
/*
Definition:
Reverse list items and returns the reversed list.
 */
package HackerRank;
class ReverseGroceries {
    public String[] reverseGroceries(String[] groceryList) {
        String temp = "";
        for (int i = 0; i < groceryList.length / 2; i++) {
            temp = groceryList[i];
            groceryList[i] = groceryList[groceryList.length - 1 - i];
            groceryList[groceryList.length - 1 - i] = temp;
        }
        return groceryList;
    }
}