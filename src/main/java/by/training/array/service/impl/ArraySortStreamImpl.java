package by.training.array.service.impl;

import by.training.array.entity.ArrayMod;
import by.training.array.service.ArraySort;

import java.util.Arrays;

public class ArraySortStreamImpl implements ArraySort {

    @Override
    public void exchangesArraySort(ArrayMod array) {
        // FIXME: 11.06.2021

        double[] sort = Arrays.stream(array.getArray()).sorted().toArray();
        array.setArray(sort);
    }

    @Override
    public void insertArraySort(ArrayMod array) {
        double[] sort = Arrays.stream(array.getArray()).sorted().toArray();
        array.setArray(sort);
        // FIXME: 11.06.2021
    }

    @Override
    public void shellArraySort(ArrayMod array) {
        double[] sort = Arrays.stream(array.getArray()).sorted().toArray();
        array.setArray(sort);
        // FIXME: 11.06.2021
    }
}
