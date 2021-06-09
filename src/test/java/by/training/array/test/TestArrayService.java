package by.training.array.test;

import by.training.array.entity.ArrayMod;
import by.training.array.service.ArrayService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArrayService {

    private ArrayMod basicArray;

    @Before
    public void initTest() {
        basicArray = new ArrayMod();
    }

    @After
    public void afterTest() {
        basicArray = null;
    }

    @Test
    public void minValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        double expected = -5.0;
        double actual = ArrayService.minValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void maxValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        double expected = 8.0;
        double actual = ArrayService.maxValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void averageValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        double expected = 2.0;
        double actual = ArrayService.averageValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void sumValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        double expected = 12.0;
        double actual = ArrayService.sumAllValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void countPositiveValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        int expected = 5;
        int actual = ArrayService.countPositiveValueArray(basicArray);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void countNegativeValueTest() {

        basicArray.setArray(new double[]{-2, -3, 8, -8, -5, 0});
        int expected = 4;
        int actual = ArrayService.countNegativeValueArray(basicArray);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void changeNegValueToZeroTest() {

        basicArray.setArray(new double[]{-2, -3, 8, -8, -5, 0});
        ArrayMod expected = new ArrayMod(new double[]{0, 0, 8, 0, 0, 0});
        ArrayMod actual = ArrayService.changeNegValueToZeroArray(basicArray);
        Assert.assertArrayEquals(expected.getArray(), actual.getArray(), 0.001);

    }
}
