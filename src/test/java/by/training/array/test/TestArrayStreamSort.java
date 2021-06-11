package by.training.array.test;

import by.training.array.entity.ArrayMod;
import by.training.array.service.impl.ArraySortStreamImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArrayStreamSort {

    private ArrayMod basicArray;
    private ArraySortStreamImpl sort = new ArraySortStreamImpl();

    @Before
    public void initTest() {
        basicArray = new ArrayMod();
    }

    @After
    public void afterTest() {
        basicArray = null;
    }

    @Test
    public void exchangesSortTest() {

        basicArray.setArray(new double[]{-10, 2, 0, 34, -12, 3, 7, -8, -3, 0, 9, -1, -10, 12});
        double[] expected = {-12, -10, -10, -8, -3, -1, 0, 0, 2, 3, 7, 9, 12, 34};
        sort.exchangesArraySort(basicArray);
        Assert.assertArrayEquals(expected, basicArray.getArray(), 0.001);

    }

    @Test
    public void insertSortTest() {

        basicArray.setArray(new double[]{5, 9, 0, 8, -8, 12, 22, 54, -34, 6, 28, 17, -43, 6, 13});
        double[] expected = {-43, -34, -8, 0, 5, 6, 6, 8, 9, 12, 13, 17, 22, 28, 54};
        sort.insertArraySort(basicArray);
        Assert.assertArrayEquals(expected, basicArray.getArray(), 0.001);

    }

    @Test
    public void shellSortTest() {

        basicArray.setArray(new double[]{6, -5, 0, 0, -8, 7, 22, 8, 34, 6, 8, 13, -43, 76, 34});
        double[] expected = {-43, -8, -5, 0, 0, 6, 6, 7, 8, 8, 13, 22, 34, 34, 76};
        sort.shellArraySort(basicArray);
        Assert.assertArrayEquals(expected, basicArray.getArray(), 0.001);

    }
}
