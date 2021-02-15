
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test {

    /*
     * Test de l algotimo de ordenamiento Gnome
     */
    @Test
    public void testGnomeSort() {
        GnomeSort gnomeSort = new GnomeSort();
        int[] array = { 5, 3, 2, 4, 1, 5 };
        int[] arrayOrdenado = { 1, 2, 3, 4, 5, 5 };
        assertEquals(gnomeSort.ordenar(array), arrayOrdenado);
    }

      /*
     * Test de l algotimo de ordenamiento Merge
     */
    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        int[] array = { 5, 3, 2, 4, 1, 5 };
        int[] arrayOrdenado = { 1, 2, 3, 4, 5, 5 };
        assertEquals(mergeSort.ordenar(array), arrayOrdenado);
    }

     /*
     * Test de l algotimo de ordenamiento Quick
     */
    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        int[] array = { 5, 3, 2, 4, 1, 5 };
        int[] arrayOrdenado = { 1, 2, 3, 4, 5, 5 };
        assertEquals(quickSort.ordenar(array), arrayOrdenado);
    }

      /*
     * Test de l algotimo de ordenamiento Radix
     */
    @Test
    public void testRadixSort() {
        RadixSort radixSort = new RadixSort();
        int[] array = { 5, 3, 2, 4, 1, 5 };
        int[] arrayOrdenado = { 1, 2, 3, 4, 5, 5 };
        assertEquals(radixSort.ordenar(array), arrayOrdenado);
    }

      /*
     * Test de l algotimo de ordenamiento Other
     */
    @Test
    public void testOtherSort() {
        OtherSort otherSort = new OtherSort();
        int[] array = { 5, 3, 2, 4, 1, 5 };
        int[] arrayOrdenado = { 1, 2, 3, 4, 5, 5 };
        assertEquals(otherSort.ordenar(array), arrayOrdenado);
    }

    
   
}
