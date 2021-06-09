package by.training.array.service;

import by.training.array.entity.ArrayMod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ArrayService {

    static Logger logger = LogManager.getLogger();

    private ArrayService() {
    }


    //поиск min\max значения массива
    public double minValueArray(ArrayMod array){
        return 0.0;
    }

    public double maxValueArray(ArrayMod array){
        return 0.0;
    }

    //определение среднего значения элементов массива
    public double averageValueArray(ArrayMod array){
        return 0.0;
    }

    //определение суммы элементов массива
    public double sumAllValueArray(ArrayMod array){
        return 0.0;
    }

    //определение числа положительных\отрицательных элементов массива
    public int countPositiveValueArray(ArrayMod array){
        return 0;
    }

    public int countNegativeValueArray(ArrayMod array){
        return 0;
    }

    //замену элементов массива по условию
    public ArrayMod changeNegValueToZeroArray(ArrayMod array){
        return null;
    }

}
