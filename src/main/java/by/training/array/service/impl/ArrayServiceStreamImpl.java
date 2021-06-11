package by.training.array.service.impl;

import by.training.array.entity.ArrayMod;
import by.training.array.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class ArrayServiceStreamImpl  implements ArrayService {

    static Logger logger = LogManager.getLogger();

    @Override
    public double minValueArray(ArrayMod array) {
        double min = Arrays.stream(array.getArray()).min().getAsDouble();
        logger.info("min value stream: " + min);
        return min;

    }

    @Override
    public double maxValueArray(ArrayMod array) {
        double max = Arrays.stream(array.getArray()).max().getAsDouble();
        logger.info("max value stream: " + max);
        return max;
    }

    @Override
    public double averageValueArray(ArrayMod array) {
        double average = 0;
        if(array.getArray().length > 0){
            average = Arrays.stream(array.getArray()).average().getAsDouble();
        }
        logger.info("average value stream: " + average);
        return average;
    }

    @Override
    public double sumAllValueArray(ArrayMod array) {
        double sum = Arrays.stream(array.getArray()).sum();;
        logger.info("sum value stream: " + sum);
        return sum;
    }

    @Override
    public int countPositiveValueArray(ArrayMod array) {
        int count;
        count = (int) Arrays.stream(array.getArray()).filter(x -> x >= 0).count();
        logger.info("count of positive values stream: " + count);
        return count;
    }

    @Override
    public int countNegativeValueArray(ArrayMod array) {
        int count;
        count = (int) Arrays.stream(array.getArray()).filter(x -> x < 0).count();
        logger.info("count of negative values stream: " + count);
        return count;
    }

    @Override
    public ArrayMod changeNegValueToZeroArray(ArrayMod array) {
        double[] resoult = Arrays.stream(array.getArray()).map(x -> x < 0 ? 0 : x).toArray();
        logger.info("modified array stream: " + Arrays.toString(resoult));
        return new ArrayMod(resoult);

    }
}
