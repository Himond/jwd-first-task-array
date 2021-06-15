package by.training.array.service.impl;

import by.training.array.entity.ArrayMod;
import by.training.array.service.ArraySort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySortImpl implements ArraySort {

    static Logger logger = LogManager.getLogger();

    public ArraySortImpl() {
    }

    //сортировка пузырьком
    @Override
    public void bubbleArraySort(ArrayMod array){
        boolean sorted = false;
        double temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.getArray().length - 1; i++) {
                if (array.getArray()[i] > array.getArray()[i+1]) {
                    temp = array.getArray()[i];
                    array.getArray()[i] = array.getArray()[i+1];
                    array.getArray()[i+1] = temp;
                    sorted = false;
                }
            }
        }
        logger.info("сортировка пузырьком: " + Arrays.toString(array.getArray()));
    }

    //сортировка вставками
    @Override
    public void insertArraySort(ArrayMod array){
        for (int i = 0; i < array.getArray().length - 1; i++) {
            double key = array.getArray()[i + 1];
            int indKey = binSearch(array, key, i + 1);
            if(indKey <= i){
                int j = i + 1;
                while (j > indKey){
                    array.getArray()[j] = array.getArray()[j - 1];
                    j--;
                }
                array.getArray()[indKey] = key;}
        }
        logger.info("сортировка вставками: " + Arrays.toString(array.getArray()));
    }

    //сортировка Шелла
    @Override
    public void shellArraySort(ArrayMod array){
        int i = 0;
        while (i < array.getArray().length - 1){
            if(array.getArray()[i] > array.getArray()[i + 1]){
                double key = array.getArray()[i];
                array.getArray()[i] = array.getArray()[i + 1];
                array.getArray()[i + 1] = key;
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        logger.info("сортировка Шелла: " + Arrays.toString(array.getArray()));
    }


    //метод помещающий очередной элемента в отсортированную часть массива при
    //помощи двоичного поиска
    public static int binSearch(ArrayMod array, double key, int len){
        int left = -1;
        int right = len;
        while (left < right - 1){
            int mid = (left + right)/2;
            if(array.getArray()[mid] < key){
                left = mid;
            }else {
                right = mid;
            }
        }
        return right;
    }


}
