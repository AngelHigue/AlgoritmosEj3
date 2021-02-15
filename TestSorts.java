
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TestSorts {

    /*
     * Test de l algotimo de ordenamiento Gnome
     */
    @Test
    public void testGnomeSort() {
        GnomeSort gnomeSort = new GnomeSort();
        int[] array = { 291, 636, 598, 680, 925, };

        int[] arrayOrdenado = gnomeSort.ordenar(array);
        int[] arrayTest = { 291, 598, 636, 680, 925 };
        assertEquals(Arrays.toString(arrayTest), Arrays.toString(arrayOrdenado));
    }

    /*
     * Test de l algotimo de ordenamiento Merge
     */
    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();

        int[] array = { 291, 636, 598, 680, 925, };
        int[] arrayOrdenado = mergeSort.ordenar(array);

        int[] arrayTest = { 291, 598, 636, 680, 925 };

        assertEquals(Arrays.toString(arrayTest), Arrays.toString(arrayOrdenado));

    }

    /*
     * Test de l algotimo de ordenamiento Quick
     */
    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();

        int[] array = { 291, 636, 598, 680, 925, };
        int[] arrayOrdenado = quickSort.ordenar(array);

        int[] arrayTest = { 291, 598, 636, 680, 925 };

        assertEquals(Arrays.toString(arrayTest), Arrays.toString(arrayOrdenado));
    }

    /*
     * Test de l algotimo de ordenamiento Radix
     */
    // @Test
    // public void testRadixSort() {
    // RadixSort radixSort = new RadixSort();
    // int[] array = { 291, 636, 598, 680, 925, };
    // int[] arrayOrdenado = radixSort.ordenar(array);

    // int[] arrayTest = { 291, 598, 636, 680, 925 };

    // assertEquals(Arrays.toString(arrayTest), Arrays.toString(arrayOrdenado));
    // }

    /*
     * Test de l algotimo de ordenamiento Other
     */
    @Test
    public void testOtherSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = { 291, 636, 598, 680, 925, };
        int[] arrayOrdenado = bubbleSort.ordenar(array);

        int[] arrayTest = { 291, 598, 636, 680, 925 };

        assertEquals(Arrays.toString(arrayTest), Arrays.toString(arrayOrdenado));
    }

}
