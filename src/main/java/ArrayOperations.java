import java.util.Arrays;
import java.util.Collections;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */
    public void print() {
        for (int numPrint1 : numbers) {
            System.out.print(numPrint1 + " ");
        }
        //for each schleife reinschreiben
    }

    /**
     * @return the sorted numbers array.
     */
    public int[] sort() {
        int[] arraySort = numbers;
        Arrays.sort(arraySort);

        return arraySort;
    }

    // nummern in array sortieren

    /**
     * Choose some sorting algorithm you like.
     * Some examples with pseudo code can be found here:
     *
     * @return the sorted array in reverted order
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] revertSort() {
        int []  arraySortReverse = numbers;
        Collections.sort(arraySortReverse, Collections.reverseOrder());

        return arraySortReverse;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
        return null;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
        // Ist der Wert in den numbers enthalten
        for (int numContains2 : numbers) {
            if (numContains2 == value) {
                return true;
            }
        }

        return false;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {

        double sum1 = 0; //Ergebniswert als Startpunkt
        for (int sum2 : numbers) {  //hier wird jeder Wert jeder Wert
            sum1 = sum1 + sum2;
            }

        return sum1 / numbers.length;
    } //return-werte müssen ersetzt werden, man braucht eine Rechnung

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */

    // Ich möchte von sort() die Stellen 1-3 nehmen und damit average() ausführen. Wie stelle ich das an?
    //Am einfachsten ist es wenn du die average Methode aufrufst und dann minValue und maxValue davon abziehst. Nicht vergessen, dass du dann 2 Werte weniger hast (für die Division).

    public double trimmedMean() {
        double mean1 = 0;
        for (int mean2 : numbers) {
            mean1 = mean2 + mean2;
        }
        return mean1 - maximal - minimal / numbers.length - 2;



        double mean = 0;
        for (double i = 0; i < numbers.length && !maxValue() && !minValue; i++) {
            average();
        }
        return mean;



        average mean = new average();
        mean.average();



    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        int maximal = 0;
        for (int maximal : numbers) {// ich muss das Array durchiterieren
            if (numbers[i] > maximal)  {
                maximal = numbers[i];
            }
        }
        return maximal;
        // mit einem Max-Wert starten, durchiterieren und wenn größer, dann ist das das neuen Ma



    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        int minimal = 1000;
        for (int minimal2 : numbers) {
            if (minimal2 < minimal) {
                minimal = minimal2;
            }
        }
        return minimal;
    }
    
     /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private void someHelper() {

    }

    private void someMoreHelper() {
        // ...
    }
}
