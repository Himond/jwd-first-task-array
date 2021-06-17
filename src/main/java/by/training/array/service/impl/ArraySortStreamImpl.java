package by.training.array.service.impl;

import by.training.array.entity.ArrayMod;
import by.training.array.service.ArraySort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySortStreamImpl implements ArraySort {

    static Logger logger = LogManager.getLogger();

    @Override
    public void bubbleArraySort(ArrayMod array) {

        int n = array.getArray().length;

        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (array.getArray()[j - 1] > array.getArray()[j]){
                        double temp = array.getArray()[j];
                        array.getArray()[j] = array.getArray()[j - 1];
                        array.getArray()[j - 1] = temp;
                    }
                });

        logger.info("bubble sort stream: " + Arrays.toString(array.getArray()));

    }

    @Override
    public void insertArraySort(ArrayMod array) {

        int n = array.getArray().length - 1;

        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    double key = array.getArray()[j + 1];
                    int indKey = ArraySortImpl.binSearch(array, key, j + 1);
                    if(indKey <= j){
                        int k = j + 1;
                        while (k > indKey){
                            array.getArray()[k] = array.getArray()[k - 1];
                            k--;
                        }
                        array.getArray()[indKey] = key;
                    }
                });

        logger.info("insert sort stream: " + Arrays.toString(array.getArray()));
    }

    @Override
    public void shellArraySort(ArrayMod array){

        double[] sort = Arrays.stream(array.getArray()).sorted().toArray();
        array.setArray(sort);

        logger.info("Shell sort stream: " + Arrays.toString(array.getArray()));

    }


}
