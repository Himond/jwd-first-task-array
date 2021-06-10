package by.training.array.util;

import by.training.array.entity.ArrayMod;
import by.training.array.validator.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayBuilder {

    private List<ArrayMod> arrayList = new ArrayList<>();
    private ArrayValidator validator = new ArrayValidator();
    private int pivot = 0;


    public void createArrayList(List<String> list){
        double[] newArray;
        for (int i = 0; i < list.size(); i++){
            if(validator.correctDataArray(list.get(i))){
                String[] line = list.get(i).split("(\\s{1}\\-{1}\\s{1})|(\\,\\s{1})|(\\s{1})");
                newArray = new double[line.length];
                for (int j = 0; j < line.length; j++){
                    newArray[j] = Integer.parseInt(line[j]);
                }
                arrayList.add(new ArrayMod(newArray));
            }
        }
    }

    public ArrayMod nextArray(){
        ArrayMod array;
        if(pivot < arrayList.size()){
            array = arrayList.get(pivot);
            pivot += 1;
        }else {
            array = new ArrayMod();
        }
        return array;
    }

    public int arraySize(){
        return arrayList.size();
    }
}
