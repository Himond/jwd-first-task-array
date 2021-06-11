package by.training.array.validator;


public class ArrayValidator {

    private static final String CORRECT_ARRAY_REGEX = "^-?(\\d*[\\ \\-\\,]*)*";

    public static boolean correctValueArray(String line){
        boolean valid = line.matches(CORRECT_ARRAY_REGEX);
        return valid;
    }

}
