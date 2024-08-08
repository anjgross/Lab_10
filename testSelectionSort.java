package default_package;

import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public void testPositive() {
        int[] arr = {4, 9, 6, 10, 2};
        int[] Sortedarr = {2, 4, 6, 9, 10};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }

    @Test
    public void testNegative() {
        int[] arr = {-8, -5, -7, -10, -2};
        int[] Sortedarr = {-10, -8, -7, -5, -2};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }

    @Test
    public void testMixed() {
        int[] arr = {14, -9, 0, 10, -2};
        int[] Sortedarr = {-9, -2, 0, 10, 14};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {8, 8, 7, 7, 10};
        int[] Sortedarr = {7, 7, 8, 8, 10};

        SelectionSort sorter = new SelectionSort();
        arr = sorter.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }
}