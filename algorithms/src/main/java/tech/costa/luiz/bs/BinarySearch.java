package tech.costa.luiz.bs;

/**
 * The type Binary search.
 */
public class BinarySearch {

    /**
     * Search int.
     *
     * @param listOfNumbers the list of numbers
     * @param numberToFind  the number to find
     * @return the int
     */
    public int search(int[] listOfNumbers, int numberToFind){
        int index = -1, low = 0, mid;
        int high = listOfNumbers.length -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (listOfNumbers[mid] < numberToFind) {
                low = mid + 1;
            } else if (listOfNumbers[mid] > numberToFind) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return index;
    }
}