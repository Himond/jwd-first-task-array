package by.training.array.service;

import by.training.array.entity.ArrayMod;

public interface ArrayService {

     double minValueArray(ArrayMod array);
     double maxValueArray(ArrayMod array);
     double averageValueArray(ArrayMod array);
     double sumAllValueArray(ArrayMod array);
     int countPositiveValueArray(ArrayMod array);
     int countNegativeValueArray(ArrayMod array);
     ArrayMod changeNegValueToZeroArray(ArrayMod array);

}
