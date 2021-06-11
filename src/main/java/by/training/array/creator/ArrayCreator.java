package by.training.array.creator;

import by.training.array.entity.ArrayMod;
import by.training.array.validator.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public final class ArrayCreator {

    private static final String SPLIT_REGEX = "(\\s\\-\\s)|(\\,\\s)|(\\s)";

    public static List<ArrayMod> createArrayList(List<String> stringArray){

        List<ArrayMod> arrayList = new ArrayList<>();
        double[] newArray;

        for (String array : stringArray) {
            if (ArrayValidator.correctValueArray(array)) {
                String[] line = array.split(SPLIT_REGEX);
                newArray = new double[line.length];
                for (int j = 0; j < line.length; j++) {
                    newArray[j] = Integer.parseInt(line[j]);
                }
                arrayList.add(new ArrayMod(newArray));
            }
        }
        return arrayList;
    }

    private ArrayCreator() {
    }

}
