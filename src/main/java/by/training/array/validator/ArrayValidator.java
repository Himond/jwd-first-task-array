package by.training.array.validator;

import by.training.array.entity.ArrayMod;


public class ArrayValidator {

    private final String CORRECT_DATA_REGEX = "^-?(\\d*[\\ \\-\\,]*)*";

    public  boolean correctDataArray(String line){
        boolean valid = line.matches(CORRECT_DATA_REGEX);
        return valid;
    }

    public boolean nullOrEmptyValidArray(ArrayMod array){
        // FIXME: 10.06.2021 
        return true;
    }

}
