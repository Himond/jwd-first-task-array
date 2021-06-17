package by.training.array.service.impl;

import by.training.array.entity.ArrayMod;
import by.training.array.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class ArrayServiceImpl implements ArrayService {

    static Logger logger = LogManager.getLogger();

    public ArrayServiceImpl() {
    }

    @Override
    public double minValueArray(ArrayMod array){
        double min;
        if(array.getArray().length > 0){
            min = array.getArray()[0];
            for (double value : array.getArray()) {
                if (value < min){
                    min = value;
                }
            }
        }else {
            min = 0.0;
        }
        logger.info("min value: " + min);
        return min;
    }
    @Override
    public double maxValueArray(ArrayMod array){
        double max;
        if(array.getArray().length > 0){
            max = array.getArray()[0];
            for (double value : array.getArray()) {
                if (value > max){
                    max = value;
                }
            }
        }else {
            max = 0.0;
        }
        logger.info("max value: " + max);
        return max;
    }

    @Override
    public double averageValueArray(ArrayMod array){
        double average = 0.0;
        if(array.getArray().length > 0){
            for (double value : array.getArray()) {
                average += value;
            }
            average = average/array.getArray().length;
        }
        logger.info("average value: " + average);
        return average;
    }

    @Override
    public double sumAllValueArray(ArrayMod array){
        double sum = 0.0;
        if(array.getArray().length > 0){
            for (double value : array.getArray()) {
                sum += value;
            }
        }
        logger.info("sum of values: " + sum);
        return sum;
    }

    @Override
    public int countPositiveValueArray(ArrayMod array){
        int count = 0;
        if(array.getArray().length > 0){
            for (double value : array.getArray()) {
                if(value >= 0){
                    count++;
                }
            }
        }
        logger.info("count of positive values: " + count);
        return count;
    }

    @Override
    public int countNegativeValueArray(ArrayMod array){
        int count = 0;
        if(array.getArray().length > 0){
            for (double value : array.getArray()) {
                if(value < 0){
                    count++;
                }
            }
        }
        logger.info("count of negative values: " + count);
        return count;
    }

    @Override
    public ArrayMod changeNegValueToZeroArray(ArrayMod array){
        double[] changeArray = new double[array.getArray().length];
        for (int i = 0; i < array.getArray().length; i++){
            if(array.getArray()[i] >= 0){
                changeArray[i] = array.getArray()[i];
            }else {
                changeArray[i] = 0;
            }
        }
        logger.info("modified array: " + Arrays.toString(changeArray));
        return new ArrayMod(changeArray);
    }



}
