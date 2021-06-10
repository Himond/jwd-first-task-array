package by.training.array.test;

import by.training.array.entity.ArrayMod;
import by.training.array.service.impl.ArrayServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArrayService {

    private ArrayMod basicArray;
    private ArrayServiceImpl service = new ArrayServiceImpl();

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
        double actual = service.minValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void maxValueTest() {

        basicArray.setArray(new double[]{3, 22, 8, 4, -5, 0});
        double expected = 22.0;
        double actual = service.maxValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void averageValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        double expected = 2.0;
        double actual = service.averageValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void sumValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        double expected = 12.0;
        double actual = service.sumAllValueArray(basicArray);
        Assert.assertEquals(actual, expected, 0.001);

    }

    @Test
    public void countPositiveValueTest() {

        basicArray.setArray(new double[]{3, 2, 8, 4, -5, 0});
        int expected = 5;
        int actual = service.countPositiveValueArray(basicArray);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void countNegativeValueTest() {

        basicArray.setArray(new double[]{-2, -3, 8, -8, -5, 0});
        int expected = 4;
        int actual = service.countNegativeValueArray(basicArray);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void changeNegValueToZeroTest() {

        basicArray.setArray(new double[]{-2, -3, 8, -8, -5, 0});
        ArrayMod expected = new ArrayMod(new double[]{0, 0, 8, 0, 0, 0});
        ArrayMod actual = service.changeNegValueToZeroArray(basicArray);
        Assert.assertArrayEquals(expected.getArray(), actual.getArray(), 0.001);

    }

    @Test
    public void nullArrayTest() {

        basicArray.setArray(new double[]{});
        ArrayMod expected = new ArrayMod(new double[]{});
        ArrayMod actual = service.changeNegValueToZeroArray(basicArray);
        Assert.assertArrayEquals(expected.getArray(), actual.getArray(), 0.001);

    }
}
